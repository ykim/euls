package ykim.euls.constants.gamerule;

import java.util.EnumSet;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public enum GameState {
    LOADING(1),
    DRAFT(2),
    STRATEGY_TIME(3),
    PREGAME(4),
    GAME(5),
    POSTGAME(6),
    DISCONNECT(7);

    private final Integer id;

    private GameState(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private static final ImmutableMap<Integer, GameState> reverseMap;

    static {
        ImmutableMap.Builder<Integer, GameState> builder = ImmutableMap.builder();
        for (GameState gameState : EnumSet.allOf(GameState.class)) {
            builder.put(gameState.id, gameState);
        }
        reverseMap = builder.build();
    }

    public static Optional<GameState> fromId(Integer id) {
        GameState state = reverseMap.get(id);
        return Optional.fromNullable(state);
    }

    public static Optional<GameState> fromOptionalId(Optional<Integer> id) {
        if (!id.isPresent()) {
            return Optional.absent();
        }

        GameState value = reverseMap.get(id.get());
        return Optional.of(value);
    }
}