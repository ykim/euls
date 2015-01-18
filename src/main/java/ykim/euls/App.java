package ykim.euls;

import ykim.euls.constants.Team;
import ykim.euls.constants.gamerule.GameState;
import ykim.euls.models.*;
import ykim.euls.models.protobuf.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class App {
    Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().run(args);
    }

    private void run(String[] args) {
        try {
            Replay matchReplay = new Replay(args[0]);

            Long start_time = System.currentTimeMillis();

            while (matchReplay.tick()) {
                logger.info(matchReplay.getReplayTimeAsString());

                // GameRules example
                GameRules gameRules = matchReplay.getGameRules();
                logger.info("Match Id : {}", gameRules.getMatchId());
                logger.info("Match Type : {}", gameRules.getGameMode());
                logger.info("Match Time : {}", gameRules.getCurrentGameTime());

                if ((gameRules.getCurrentGameState() == GameState.PREGAME) || (gameRules.getCurrentGameState() == GameState.GAME)) {
                    // DotaPlayer example
                    logger.info("Player Iteration");
                    for (int i = 0; i < Replay.MAX_PLAYERS; i++) {
                        DotaPlayer player = matchReplay.getDotaPlayerByIndex(i);

                        if (player != null) {
                            // DotaHero example
                            DotaHero playerHero = player.getHero();

                            if (playerHero != null) {
                                logger.info("Hero : {}", playerHero.getHero());
                                logger.info("Level : {}", playerHero.getCurrentLevel());
                                logger.info("HP : {}", playerHero.getCurrentHP());
                                logger.info("Mana : {}", playerHero.getCurrentMana());
                                logger.info("Coordinates : {}", playerHero.getCoordinates());
                                logger.info("Last Hits : {}", player.getCurrentLastHits());
                                logger.info("Denies : {}", player.getCurrentDenies());

                                // DotaItem eample
                                List<DotaItem> items = player.getItems();
                                for (int j = 0; j < items.size(); j++) {
                                    DotaItem item = items.get(j);
                                    if (item != null) {
                                        logger.info("Item : {}" + j, item.getItem());
                                    }
                                }
                            }
                        }
                    }

                    // DotaCourier Example
                    logger.info("Radiant Team's Courier");
                    List<DotaCourier> couriers = matchReplay.getCouriersByTeam(Team.RADIANT);
                    for (DotaCourier courier : couriers) {
                        if (courier != null) {
                            logger.info("Coordinate : {}", courier.getCoordinates());
                        }
                    }

                    // DotaTower Example - Similar to DotaBarracks and DotaAncient
                    logger.info("Dire Team's Towers");
                    List<DotaTower> towers = matchReplay.getTowersByTeam(Team.DIRE);
                    for (DotaTower tower : towers) {
                        if (tower != null) {
                            logger.info("Tier : {}", tower.getTier());
                            logger.info("Lane : {}", tower.getLane());
                            logger.info("HP : {}", tower.getCurrentHP());
                        }
                    }


                    // DotaLaneCreep Example
                    logger.info("Radiant Team's Creeps");
                    List<DotaLaneCreep> creeps = matchReplay.getLaneCreepsByTeam(Team.RADIANT);
                    for (DotaLaneCreep creep : creeps) {
                        if (creep != null) {
                            logger.info("Name : {}", creep.getName());
                            logger.info("Coordinate : {}", creep.getCoordinates());
                            logger.info("HP : {}", creep.getCurrentHP());
                        }
                    }

                    // DotaNeutralCreep example
                    logger.info("Neutral Creeps");
                    List<DotaNeutralCreep> neutrals = matchReplay.getNeutralCreeps();
                    for (DotaNeutralCreep neutralCreep : neutrals) {
                        logger.info("Name : {}", neutralCreep.getName());
                        logger.info("Type : {}", neutralCreep.getNeutral());
                        logger.info("Coordinate : {}", neutralCreep.getCoordinates());
                        logger.info("HP : {}", neutralCreep.getCurrentHP());
                    }

                    // DotaRoshan example
                    logger.info("Roshan");
                    DotaRoshan roshan = matchReplay.getRoshan();
                    if (roshan != null) {
                        logger.info("HP : {}", roshan.getCurrentHP());
                    }

                    // Ward Examples
                    logger.info("Dire Observer Ward");
                    List<DotaWard> wards = matchReplay.getObserverWardsByTeam(Team.DIRE);
                    for (DotaWard ward : wards) {
                        if (ward != null) {
                            logger.info("Coordinate : {}", ward.getCoordinates());
                        }
                    }
                }
            }

            Long end_time = System.currentTimeMillis();
            System.out.println((end_time - start_time));
        } catch (IOException e) {
            logger.error(args[0] + " could not be opened");
        }
    }
}
