package ykim.euls.constants.gamerule;

import java.util.EnumSet;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public enum GameMode {
    NONE(0),
    ALL_PICK(1),
    CAPTAINS_MODE(2),
    RANDOM_DRAFT(3),
    SINGLE_DRAFT(4),
    ALL_RANDOM(5),
    INTRO(6),
    DIRETIDE(7),
    REVERSE_CAPTAINS_MODE(8),
    GREEVILING(9),
    TUTORIAL(10),
    MID_ONLY(11),
    LEAST_PLAYED(12),
    NEW_PLAYER_POOL(13),
    COMPENDIUM_MATCHMAKING(14),
    CUSTOM(15);

    private final Integer id;

    private GameMode(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, GameMode> reverseMap;

    static {
        ImmutableMap.Builder<Integer, GameMode> builder = ImmutableMap.builder();
        for (GameMode value : EnumSet.allOf(GameMode.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<GameMode> fromId(Integer id) {
        GameMode value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<GameMode> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }
        
        GameMode value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}