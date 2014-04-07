package gg.cloud9.euls.constants;

import java.util.EnumSet;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public enum Team {
    RADIANT(2),
    DIRE(3),
    SPECTATOR(5);

    private final Integer id;

    private Team(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, Team> reverseMap;
    static {
        ImmutableMap.Builder<Integer, Team> builder = ImmutableMap.builder();
        for (Team value : EnumSet.allOf(Team.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<Team> fromId(Integer id) {
        Team value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<Team> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        Team value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}