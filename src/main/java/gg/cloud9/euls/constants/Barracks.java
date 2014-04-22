package gg.cloud9.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

/**
 * Created by ykim on 4/22/14.
 */
public enum Barracks {
    MELEE("melee"),
    RANGE("range");

    private final String barracksType;

    private Barracks(String laneName) {
        this.barracksType = laneName;
    }

    public String getBarracksType() {
        return barracksType;
    }

    private static final ImmutableMap<String, Barracks> reverseMap;

    static {
        ImmutableMap.Builder<String, Barracks> builder = ImmutableMap.builder();
        for (Barracks value : EnumSet.allOf(Barracks.class)) {
            builder.put(value.barracksType, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<Barracks> fromString(String internalName) {
        Barracks value = reverseMap.get(internalName);
        return Optional.fromNullable(value);
    }
}
