package ykim.euls.constants;

import java.util.EnumSet;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public enum LifeState {
    ALIVE(0),
    DYING(1),
    DEAD(2),
    RESPAWNABLE(3),
    DISCARD_BODY(4);

    private final Integer id;

    private LifeState(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, LifeState> reverseMap;
    static {
        ImmutableMap.Builder<Integer, LifeState> builder = ImmutableMap.builder();
        for (LifeState value : EnumSet.allOf(LifeState.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<LifeState> fromId(Integer id) {
        LifeState value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<LifeState> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        LifeState value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}