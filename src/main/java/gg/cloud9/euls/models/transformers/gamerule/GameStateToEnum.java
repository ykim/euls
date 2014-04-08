package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameState;

public class GameStateToEnum implements ValueTransformer<Integer, GameState> {

    @Override
    public GameState transform(Integer propValue) {
        return GameState.fromId(propValue).orNull();
    }

    @Override
    public GameState[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            GameState[] propTransformArray = new GameState[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = GameState.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
