package gg.cloud9.euls;

import skadistats.clarity.Clarity;
import skadistats.clarity.match.Match;
import skadistats.clarity.parser.DemoInputStreamIterator;
import skadistats.clarity.parser.Profile;

import java.io.IOException;

public class Replay {
    private final Match match;
    private final DemoInputStreamIterator iter;
    private final GameInfo game;

    public Replay(String fileName) throws IOException {
        this.match = new Match();
        this.iter = Clarity.iteratorForFile(fileName, Profile.ALL);
        this.game = new GameInfo(this.match);
    }

    // tick - Applies a tick to the match
    public boolean tick() {
        if (this.iter.hasNext()) {
            this.iter.next().apply(this.match);
            return true;
        }
        return false;
    }

    public int getTick() {
        return this.match.getTick();
    }

    public GameInfo getGameInfo() {
        return this.game;
    }
}
