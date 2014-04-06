package gg.cloud9.euls.constants;

import com.google.common.collect.ImmutableBiMap;

public class DotaGamePropertyConstants {
    public static final ImmutableBiMap<Integer, String> LIFE_STATE = ImmutableBiMap.<Integer, String>builder()
            .put(0, "Alive")
            .put(1, "Dying")
            .put(2, "Dead")
            .put(3, "Respawnable")
            .put(4, "Discard Body")
            .build();
}
