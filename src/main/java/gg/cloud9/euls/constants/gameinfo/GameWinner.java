package gg.cloud9.euls.constants.gameinfo;

import java.util.EnumSet;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public enum GameWinner {
    RADIANT(2),
    DIRE(3);

    private final Integer id;

    private GameWinner(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, GameWinner> reverseMap;
    static {
        ImmutableMap.Builder<Integer, GameWinner> builder = ImmutableMap.builder();
        for (GameWinner value : EnumSet.allOf(GameWinner.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<GameWinner> fromId(Integer id) {
        GameWinner value = reverseMap.get(id);
        return Optional.of(value);
    }

    public static Optional<GameWinner> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        GameWinner value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}