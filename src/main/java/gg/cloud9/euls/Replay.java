package gg.cloud9.euls;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.DotaCourier;
import gg.cloud9.euls.models.DotaPlayer;
import gg.cloud9.euls.models.protobuf.Courier;
import gg.cloud9.euls.models.protobuf.GameRules;

import skadistats.clarity.Clarity;
import skadistats.clarity.match.GameEventCollection;
import skadistats.clarity.match.Match;
import skadistats.clarity.model.Entity;
import skadistats.clarity.model.GameEvent;
import skadistats.clarity.parser.DemoInputStreamIterator;
import skadistats.clarity.parser.Peek;
import skadistats.clarity.parser.Profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Replay {
    private static final Integer MAX_PLAYERS = 10;

    private Match match;
    private DemoInputStreamIterator iter;
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

    public ArrayList<Courier> getCouriersByTeam(Team team) {
        ArrayList<Courier> couriers = new ArrayList<Courier>();

        Iterator<Entity> courierIterator = this.match.getEntities().getAllByDtName("DT_DOTA_Unit_Courier");

        while (courierIterator.hasNext()) {
            Entity courierEntity = courierIterator.next();
            if (courierEntity != null) {
                Courier courier = ModelProxyFactory.getProxy(Courier.class, courierEntity);

                if (courier != null) {
                    Team courierTeam = courier.getTeam();

                    if (courierTeam == team) {
                        couriers.add(courier);
                    }
                }
            }
        }

        return couriers;
    }

    public GameEventCollection getGameEvents() {
        return gameEvents;
    }
}
