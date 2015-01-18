package ykim.euls;

import ykim.euls.constants.LifeState;
import ykim.euls.constants.Team;
import ykim.euls.models.*;
import ykim.euls.models.protobuf.GameRules;

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

public class Replay implements Iterable<Replay> {
    public static final Integer MAX_PLAYERS = 10;

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
        return new GameRules(this.match.getGameRulesProxy());
    }

    public DotaPlayer getDotaPlayerByIndex(Integer i) {
        return players.get(i);
    }

    public List<DotaCourier> getCouriersByTeam(Team team) {
        ArrayList<DotaCourier> couriers = new ArrayList<DotaCourier>();

        Iterator<Entity> courierIterator = this.match.getEntities().getAllByDtName("DT_DOTA_Unit_Courier");
        List<Entity> courierEntity = Utils.getEntitiesByTeam(courierIterator, team);

        for (Entity entity : courierEntity) {
            DotaCourier courier = new DotaCourier(entity);
            couriers.add(courier);
        }

        return couriers;
    }

    public DotaRoshan getRoshan() {
        Entity roshanEntity = this.match.getEntities().getByDtName("DT_DOTA_Unit_Roshan");

        if (roshanEntity != null) {
            return new DotaRoshan(roshanEntity);
        }

        return null;
    }

    public DotaAncient getAncientByTeam(Team team) {
        Iterator<Entity> ancientIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Fort");
        List<Entity> ancientEntity = Utils.getEntitiesByTeam(ancientIterator, team);

        for (Entity entity : ancientEntity) {
            DotaAncient ancient = new DotaAncient(entity);
            return ancient;
        }

        return null;
    }

    public List<DotaBarracks> getBarracksByTeam(Team team) {
        ArrayList<DotaBarracks> barracks = new ArrayList<DotaBarracks>();

        Iterator<Entity> barracksIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Barracks");
        List<Entity> barracksEntity = Utils.getEntitiesByTeam(barracksIterator, team);

        for (Entity entity : barracksEntity) {
            DotaBarracks barrack = new DotaBarracks(entity);
            barracks.add(barrack);
        }

        return barracks;
    }

    public List<DotaTower> getTowersByTeam(Team team) {
        ArrayList<DotaTower> towers = new ArrayList<DotaTower>();

        Iterator<Entity> towersIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Tower");
        List<Entity> towersEntity = Utils.getEntitiesByTeam(towersIterator, team);

        for (Entity entity : towersEntity) {
            DotaTower tower = new DotaTower(entity);
            towers.add(tower);
        }

        return towers;
    }

    public List<DotaLaneCreep> getLaneCreepsByTeam(Team team) {
        ArrayList<DotaLaneCreep> laneCreeps = new ArrayList<DotaLaneCreep>();

        Iterator<Entity> creepIterator = this.match.getEntities().getAllByDtName("DT_DOTA_BaseNPC_Creep_Lane");
        List<Entity> creepsEntity = Utils.getEntitiesByTeam(creepIterator, team);

        for (Entity entity : creepsEntity) {
            DotaLaneCreep creep = new DotaLaneCreep(entity, models);
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

    public GameEventCollection getGameEvents() {
        return gameEvents;
    }

    public List<DotaWard> getObserverWardsByTeam(Team team) {
        ArrayList<DotaWard> wards = new ArrayList<DotaWard>();

        Iterator<Entity> wardIterator = this.match.getEntities().getAllByDtName("DT_DOTA_NPC_Observer_Ward");
        List<Entity> wardEntities = Utils.getEntitiesByTeam(wardIterator, team);

        for (Entity wardEntity : wardEntities) {
            if (wardEntity != null) {
                DotaWard ward = new DotaWard(wardEntity);
                wards.add(ward);
            }
        }

        return wards;
    }

    public List<DotaWard> getSentryWardsByTeam(Team team) {
        ArrayList<DotaWard> wards = new ArrayList<DotaWard>();

        Iterator<Entity> wardIterator = this.match.getEntities().getAllByDtName("DT_DOTA_NPC_Observer_Ward_TrueSight");
        List<Entity> wardEntities = Utils.getEntitiesByTeam(wardIterator, team);

        for (Entity wardEntity : wardEntities) {
            if (wardEntity != null) {
                DotaWard ward = new DotaWard(wardEntity);
                wards.add(ward);
            }
        }

        return wards;
    }

    public List<GameEvent> getCombatLogs() {
        List<GameEvent> combatEvents = new ArrayList<GameEvent>();
        GameEventCollection events = getGameEvents();

        for (GameEvent event : events) {
            if (event.getName().equals("dota_combatlog")) {
                combatEvents.add(event);
            }
        }

        return combatEvents;
    }


    /*
     * Implement Iterable so Replay can be used like:
     *
     *    for (Replay state : replay) {
     *    }
     *
     */
    public Iterator<Replay> iterator() {
        final Replay r = this;
        return new Iterator<Replay>() {

            public boolean hasNext() {
                return r.iter.hasNext();
            }

            public Replay next() {
                r.tick();
                return r;
            }
        };
    }
}
