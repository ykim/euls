package gg.cloud9.euls.constants;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class DotaGameInfoConstants {
    public static final ImmutableBiMap<Integer, String> GAME_STATE = ImmutableBiMap.<Integer, String>builder()
            .put(1, "Loading")
            .put(2, "Draft")
            .put(3, "Strategy Time")
            .put(4, "Pregame")
            .put(5, "Game")
            .put(6, "Postgame")
            .put(7, "Disconnect")
            .build();

    public static final ImmutableBiMap<Integer, String> GAME_MODE = ImmutableBiMap.<Integer, String>builder()
            .put(0, "None")
            .put(1, "All Pick")
            .put(2, "Captain's Mode")
            .put(3, "Random Draft")
            .put(4, "Single Draft")
            .put(5, "All Random")
            .put(6, "Intro")
            .put(7, "Diretide")
            .put(8, "Reverse Captain's Mode")
            .put(9, "Greeviling")
            .put(10, "Tutorial")
            .put(11, "Mid Only")
            .put(12, "Least Played")
            .put(13, "New Player Pool")
            .put(14, "Compendium Matchmaking")
            .build();

    public static final ImmutableBiMap<Integer, String> GAME_WINNER = ImmutableBiMap.<Integer, String>builder()
            .put(2, "Radiant")
            .put(3, "Dire")
            .build();
}
