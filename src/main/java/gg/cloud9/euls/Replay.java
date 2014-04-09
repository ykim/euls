package gg.cloud9.euls;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.models.DotaPlayer;
import gg.cloud9.euls.models.protobuf.GameRules;
import gg.cloud9.euls.models.protobuf.NPCHero;

import skadistats.clarity.Clarity;
import skadistats.clarity.match.Match;
import skadistats.clarity.parser.DemoInputStreamIterator;
import skadistats.clarity.parser.Profile;

import java.io.IOException;
import java.util.ArrayList;

public class Replay {
    private static final Integer MAX_PLAYERS = 10;

    private final Match match;
    private final DemoInputStreamIterator iter;
    private final ArrayList<DotaPlayer> players = new ArrayList<DotaPlayer>();

    public Replay(String fileName) throws IOException {
        this.match = new Match();
        this.iter = Clarity.iteratorForFile(fileName, Profile.ALL);

        // Initialize all DotaPlayer
        for (int i = 0; i < MAX_PLAYERS; i++) {
            players.add(i, new DotaPlayer(this.match, i));
        }
    }

    // tick - Applies a tick to the match
    public boolean tick() {
        if (this.iter.hasNext()) {
            this.iter.next().apply(this.match);

            // Apply tick to DotaPlayer also
            for (DotaPlayer player : players) {
                player.tick();
            }

            return true;
        }
        return false;
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
}
