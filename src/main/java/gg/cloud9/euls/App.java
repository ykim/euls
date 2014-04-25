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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        new App().run(args);
    }

    private void run(String[] args) {
        try {
            Replay matchReplay = new Replay(args[0]);

            Long start_time = System.currentTimeMillis();
            HashSet<String> nameOfCreeps = new HashSet<>();

            while (matchReplay.tick()) {
//                System.out.println(matchReplay.getReplayTimeAsString());
//                for (int i = 0; i < 10; i++) {
//                    DotaPlayer playah = matchReplay.getDotaPlayerByIndex(i);
//                    List<DotaItem> items = playah.getItems();
//                    if (items != null) {
//                        for (DotaItem item : items) {
//                            if (item != null) {
//                                System.out.println(item.getItem());
//                            }
//                        }
//                    }
//                }

//                // Losing some GameEvents for sure when I tick
//                List<GameEvent> events = matchReplay.getCombatLogs();
//                for (GameEvent event : events) {
//                    System.out.println(event);
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                DotaPlayer player = matchReplay.getDotaPlayerByIndex(1);
//                if (player != null) {
//                    DotaHero hero = player.getHero();
//                    if (hero != null) {
//                        System.out.println(hero.getHero());
//                        System.out.println(hero.getCurrentHP());
//                    }
//                }
//                System.out.println("");

//                GameRules rules = matchReplay.getGameRules();
//
//                if (rules != null) {
//                    System.out.println(rules.getCurrentGameTime());
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                List<DotaCourier> couriers = matchReplay.getCouriersByTeam(Team.RADIANT);
//                for (DotaCourier courier : couriers) {
//                    if (courier != null) {
//                        System.out.println(courier.getCurrentHP());
//                        System.out.println(courier.getCoordinates());
//                    }
//                }

//                List<DotaBarracks> ancient = matchReplay.getBarracksByTeam(Team.DIRE);
//                if (ancient != null) {
//                    for (DotaBuilding tower : ancient) {
//                        if (tower != null) {
//                            System.out.println(tower.getName());
//                        }
//                    }
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

//                List<DotaNeutralCreep> couriers = matchReplay.getNeutralCreeps();
//                for (DotaNeutralCreep courier : couriers) {
//                    nameOfCreeps.add(courier.getName());
//                }

//                System.out.println(matchReplay.getReplayTimeAsString());
//                List<DotaWard> wards = matchReplay.getSentryWardsByTeam(Team.RADIANT);
//                for (DotaWard ward: wards) {
//                    System.out.println(ward.getCoordinates());
//                }
            }

//            Long end_time = System.currentTimeMillis();
//            System.out.println((end_time - start_time));
//
//            for (String s : nameOfCreeps) {
//                System.out.println(s);
//            }
        } catch (IOException e) {
            logger.error(args[0] + " could not be opened");
        }
    }
}
