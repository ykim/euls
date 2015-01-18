package ykim.euls.constants.gamerule;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.util.EnumSet;

public enum GamePickState {
    ALL_PICK(1),
    SINGLE_DRAFT(2),
    RANDOM_DRAFT(3),
    ALL_RANDOM(27),
    CAPTAINS_MODE_BAN_1(6),
    CAPTAINS_MODE_BAN_2(7),
    CAPTAINS_MODE_BAN_3(8),
    CAPTAINS_MODE_BAN_4(9),
    CAPTAINS_MODE_BAN_5(10),
    CAPTAINS_MODE_BAN_6(11),
    CAPTAINS_MODE_BAN_7(12),
    CAPTAINS_MODE_BAN_8(13),
    CAPTAINS_MODE_BAN_9(14),
    CAPTAINS_MODE_BAN_10(15),
    CAPTAINS_MODE_PICK_1(16),
    CAPTAINS_MODE_PICK_2(17),
    CAPTAINS_MODE_PICK_3(18),
    CAPTAINS_MODE_PICK_4(19),
    CAPTAINS_MODE_PICK_5(20),
    CAPTAINS_MODE_PICK_6(21),
    CAPTAINS_MODE_PICK_7(22),
    CAPTAINS_MODE_PICK_8(23),
    CAPTAINS_MODE_PICK_9(24),
    CAPTAINS_MODE_PICK_10(25),
    CAPTAINS_MODE_COMPLETE(26);

    private final Integer id;

    private GamePickState(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, GamePickState> reverseMap;

    static {
        ImmutableMap.Builder<Integer, GamePickState> builder = ImmutableMap.builder();
        for (GamePickState value : EnumSet.allOf(GamePickState.class)) {
            builder.put(value.id, value);
        }
        reverseMap = builder.build();
    }

    public static Optional<GamePickState> fromId(Integer id) {
        GamePickState value = reverseMap.get(id);
        return Optional.fromNullable(value);
    }

    public static Optional<GamePickState> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        GamePickState value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}