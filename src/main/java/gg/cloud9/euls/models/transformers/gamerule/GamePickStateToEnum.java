package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GamePickState;

public class GamePickStateToEnum implements ValueTransformer<Integer, GamePickState> {

    @Override
    public GamePickState transform(Integer propValue) {
        return GamePickState.fromId(propValue).orNull();
    }

    @Override
    public GamePickState[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            GamePickState[] propTransformArray = new GamePickState[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = GamePickState.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
