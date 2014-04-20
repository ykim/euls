package gg.cloud9.euls;

import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.*;
import gg.cloud9.euls.models.protobuf.Courier;
import gg.cloud9.euls.models.protobuf.GameRules;
import gg.cloud9.euls.models.protobuf.NPCHero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import skadistats.clarity.match.GameEventCollection;
import skadistats.clarity.model.GameEvent;

import java.io.IOException;
import java.util.ArrayList;
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
//                System.out.println(matchReplay.getReplayTimeAsString());
//                for (int i = 0; i < 10; i++) {
//                    DotaPlayer playah = matchReplay.getDotaPlayerByIndex(i);
//                    ArrayList<DotaItem> items = playah.getItemProperty();
//                    if (items != null) {
//                        for (DotaItem item : items) {
//                            if (item != null) {
//                                System.out.println(item.getName());
//                            }
//                        }
//                    }
//                }

//                // Losing some GameEvents for sure when I tick
//                GameEventCollection events = matchReplay.getGameEvents();
//                for (GameEvent event : events) {
//                    System.out.println(event);
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                DotaPlayer hero1 = matchReplay.getDotaPlayerByIndex(3);
//                if (hero1 != null) {
//                    DotaHero hero1Property = hero1.getHeroProperty();
//                    if (hero1Property != null) {
//                        System.out.print(hero1Property.getCurrentHP());
//                    }
//                }
//                System.out.println("");

//                GameRules rules = matchReplay.getGameRules();
//
//                if (rules != null) {
//                    System.out.println(rules.getGamePickState());
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                ArrayList<DotaCourier> couriers = matchReplay.getCouriersByTeam(Team.DIRE);
//                for (DotaCourier courier : couriers) {
//                    if (courier != null) {
//                        System.out.println(courier.getCurrentHP());
//                        System.out.println(Utils.cellToCoordinates(courier.getXCoordinate(), courier.getYCoordinate(), courier.getVectorOrigin(), courier.getCellBits()));
//                    }
//                }

//                DotaBuilding ancient = matchReplay.getAncientByTeam(Team.DIRE);
//                if (ancient != null) {
//                    System.out.println(ancient.getCurrentHP());
//                    System.out.println(Utils.cellToCoordinates(ancient.getXCoordinate(), ancient.getYCoordinate(), ancient.getVectorOrigin(), ancient.getCellBits()));
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                ArrayList<DotaBuilding> couriers = matchReplay.getBarracksByTeam(Team.RADIANT);
//                for (DotaBuilding courier : couriers) {
//                    if (courier != null) {
//                        System.out.println(courier.getName());
//                        System.out.println(courier.getCurrentHP());
//                        System.out.println(Utils.cellToCoordinates(courier.getXCoordinate(), courier.getYCoordinate(), courier.getVectorOrigin(), courier.getCellBits()));
//                    }
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                ArrayList<DotaLaneCreep> couriers = matchReplay.getLaneCreepsByTeam(Team.RADIANT);
//                for (DotaLaneCreep courier : couriers) {
//                    if (courier != null) {
//                        System.out.println(courier.getName());
//                        System.out.println(courier.getCurrentHP());
//                        System.out.println(Utils.cellToCoordinates(courier.getXCoordinate(), courier.getYCoordinate(), courier.getVectorOrigin(), courier.getCellBits()));
//                    }
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                List<DotaNeutralCreep> couriers = matchReplay.getNeutralCreeps();
//                for (DotaNeutralCreep courier : couriers) {
//                    if (courier != null) {
//                        System.out.println(courier.getName());
//                        System.out.println(Utils.cellToCoordinates(courier.getXCoordinate(), courier.getYCoordinate(), courier.getVectorOrigin(), courier.getCellBits()));
//                        System.out.println(courier.getCurrentHP());
//                    }
//                }
            }

            Long end_time = System.currentTimeMillis();
            System.out.println((end_time - start_time));
        } catch (IOException e) {
            logger.error(args[0] + " could not be opened");
        }
    }
}
