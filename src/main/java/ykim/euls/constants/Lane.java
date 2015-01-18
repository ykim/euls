package ykim.euls.constants;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum Lane {
    TOP("top"),
    MIDDLE("mid"),
    BOTTOM("bot");

    private final String laneName;

    private Lane(String laneName) {
        this.laneName = laneName;
    }

    public String getLaneName() {
        return laneName;
    }

    private static final ImmutableMap<String, Lane> reverseMap;

    static {
        ImmutableMap.Builder<String, Lane> builder = ImmutableMap.builder();
        for (Lane value : EnumSet.allOf(Lane.class)) {
            builder.put(value.laneName, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<Lane> fromString(String internalName) {
        Lane value = reverseMap.get(internalName);
        return Optional.fromNullable(value);
    }
}
