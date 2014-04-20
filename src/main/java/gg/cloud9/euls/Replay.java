package gg.cloud9.euls;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.LifeState;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.*;
import gg.cloud9.euls.models.protobuf.GameRules;

import skadistats.clarity.Clarity;
import skadistats.clarity.match.GameEventCollection;
import skadistats.clarity.match.Match;
import skadistats.clarity.model.Entity;
import skadistats.clarity.model.GameEvent;
import skadistats.clarity.model.StringTable;
import skadistats.clarity.parser.DemoInputStreamIterator;
import skadistats.clarity.parser.Peek;
import skadistats.clarity.parser.Profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Replay {
    private static final Integer MAX_PLAYERS = 10;

    private Match match;
    private DemoInputStreamIterator iter;
    public StringTable models;
    private ArrayList<DotaPlayer> players = new ArrayList<DotaPlayer>();
    private GameEventCollection gameEvents = new GameEventCollection();
    private int currentTick;
    private Peek nextPeek;
    private Boolean complete;


    public Replay(String fileName) throws IOException {
        this.match = new Match();
        this.iter = Clarity.iteratorForFile(fileName, Profile.ALL);
        this.nextPeek = null;
        this.complete = Boolean.FALSE;

        // Initialize all DotaPlayer
        for (int i = 0; i < MAX_PLAYERS; i++) {
            players.add(i, new DotaPlayer(this.match, i));
        }
    }

    // tick - Applies a tick to the match
    public Boolean tick() {
        if (!this.complete) {
            // Initialized nextPeek
            if (this.nextPeek == null) {
                if (this.iter.hasNext()) {
                    nextPeek = this.iter.next();
                    currentTick = nextPeek.getTick();
                }
            }

            // Clear up GameEvents
            gameEvents.clear();

            // Iterate over Peeks until next tick is hit
            while (this.iter.hasNext() && nextPeek.getTick() == currentTick) {
                nextPeek.apply(this.match);
                // Collect game events
                for (GameEvent event : this.match.getGameEvents()) {
                    gameEvents.add(event);
                }
                // Update DotaPlayer
                for (DotaPlayer player : players) {
                    player.tick();
                }
                // Update StringTable
                this.models = this.match.getStringTables().forName("modelprecache");

                nextPeek = this.iter.next();
            }
            currentTick = nextPeek.getTick();

            if (this.iter.hasNext()) {
                return Boolean.TRUE;
            } else {
                nextPeek.apply(this.match);
                for (GameEvent event : this.match.getGameEvents()) {
                    gameEvents.add(event);
                }
                for (DotaPlayer player : players) {
                    player.tick();
                }
                return Boolean.FALSE;
            }
        }

        return Boolean.FALSE;
    }

    // Note : Do not use if you do not know what this does
    public Boolean stick() {
        // Clear up GameEvents
        gameEvents.clear();

        if (this.iter.hasNext()) {
            this.iter.next().apply(this.match);
            for (GameEvent event : this.match.getGameEvents()) {
                gameEvents.add(event);
            }
            for (DotaPlayer player : players) {
                player.tick();
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Integer getTick() {
        return this.match.getTick();
    }

    public Float getReplayTime() {
        return this.match.getReplayTime();
    }

    public String getReplayTimeAsString() {
        return this.match.getReplayTimeAsString();
    }

    public GameRules getGameRules() {
        return ModelProxyFactory.getProxy(GameRules.class, this.match.getGameRulesProxy());
    }

    public DotaPlayer getDotaPlayerByIndex(Integer i) {
        return players.get(i);
    }

    public List<DotaCourier> getCouriersByTeam(Team team) {
        ArrayList<DotaCourier> couriers = new ArrayList<DotaCourier>();

        Iterator<Entity> courierIterator = this.match.getEntities().getAllByDtName("DT_DOTA_Unit_Courier");
        List<Entity> courierEntity = Utils.getEntitiesByTeam(courierIterator, team);

        for (Entity entity : courierEntity) {
            DotaCourier courier = ModelProxyFactory.getProxy(DotaCourier.class, entity);
            couriers.add(courier);
        }

        return couriers;
    }

    public DotaBuilding getAncientByTeam(Team team) {
        Iterator<Entity> ancientIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Fort");
        List<Entity> ancientEntity = Utils.getEntitiesByTeam(ancientIterator, team);

        for (Entity entity : ancientEntity) {
            DotaBuilding ancient = ModelProxyFactory.getProxy(DotaBuilding.class, entity);
            return ancient;
        }

        return null;
    }

    public List<DotaBuilding> getBarracksByTeam(Team team) {
        ArrayList<DotaBuilding> barracks = new ArrayList<DotaBuilding>();

        Iterator<Entity> barracksIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Barracks");
        List<Entity> barracksEntity = Utils.getEntitiesByTeam(barracksIterator, team);

        for (Entity entity : barracksEntity) {
            DotaBuilding barrack = ModelProxyFactory.getProxy(DotaBuilding.class, entity);
            barracks.add(barrack);
        }

        return barracks;
    }

    public List<DotaBuilding> getTowersByTeam(Team team) {
        ArrayList<DotaBuilding> towers = new ArrayList<DotaBuilding>();

        Iterator<Entity> towersIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Tower");
        List<Entity> towersEntity = Utils.getEntitiesByTeam(towersIterator, team);

        for (Entity entity : towersEntity) {
            DotaBuilding tower = ModelProxyFactory.getProxy(DotaBuilding.class, entity);
            towers.add(tower);
        }

        return towers;
    }

    public List<DotaLaneCreep> getLaneCreepsByTeam(Team team) {
        ArrayList<DotaLaneCreep> laneCreeps = new ArrayList<DotaLaneCreep>();

        Iterator<Entity> creepIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Creep_Lane");
        List<Entity> creepsEntity = Utils.getEntitiesByTeam(creepIterator, team);

        for (Entity entity : creepsEntity) {
            DotaLaneCreep creep = new DotaLaneCreep(entity);
            if (creep.getLifeState() == LifeState.ALIVE) {
                laneCreeps.add(creep);
            }
        }

        return laneCreeps;
    }

    public List<DotaNeutralCreep> getNeutralCreeps() {
        ArrayList<DotaNeutralCreep> laneCreeps = new ArrayList<DotaNeutralCreep>();

        Iterator<Entity> creepIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Creep_Neutral");

        while (creepIterator.hasNext()) {
            Entity neutralEntity = creepIterator.next();

            if (neutralEntity != null) {
                DotaNeutralCreep neutralCreep = new DotaNeutralCreep(neutralEntity, models);

                if (neutralCreep.getLifeState() == LifeState.ALIVE) {
                    laneCreeps.add(neutralCreep);
                }
            }
        }

        return laneCreeps;
    }

    // TODO: Return Events based on type
    public GameEventCollection getGameEvents() {
        return gameEvents;
    }
}
