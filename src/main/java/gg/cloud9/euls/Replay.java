package gg.cloud9.euls;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.models.GameRules;
import gg.cloud9.euls.models.NPCHero;

import skadistats.clarity.Clarity;
import skadistats.clarity.match.Match;
import skadistats.clarity.parser.DemoInputStreamIterator;
import skadistats.clarity.parser.Profile;

import java.io.IOException;

public class Replay {
    private final Match match;
    private final DemoInputStreamIterator iter;

    public Replay(String fileName) throws IOException {
        this.match = new Match();
        this.iter = Clarity.iteratorForFile(fileName, Profile.ALL);
    }

    // tick - Applies a tick to the match
    public boolean tick() {
        if (this.iter.hasNext()) {
            this.iter.next().apply(this.match);
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
}
