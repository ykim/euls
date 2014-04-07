package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameState;

public class GameStateToEnum implements ValueTransformer<Integer, GameState> {

    @Override
    public GameState transform(Integer propValue) {
        return GameState.fromId(propValue).orNull();
    }
}
