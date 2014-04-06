package gg.cloud9.euls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App {
    Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().run(args);
    }

    private void run(String[] args) {
        try {
            Replay matchReplay = new Replay(args[0]);
            GameInfo gameInfo = matchReplay.getGameInfo();

            while (matchReplay.tick()) {
                // This is where you want to do your main parsing or calculations
                // The example shown here is to get information about the game
                logger.debug(gameInfo.getCurrentGameState());
            }
        } catch (IOException e) {
            logger.error(args[0] + " could not be opened");
        }
    }
}
