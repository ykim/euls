package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameMode;

public class GameModeToEnum implements ValueTransformer<Integer, GameMode> {

    @Override
    public GameMode transform(Integer propValue) {
        return GameMode.fromId(propValue).orNull();
    }

    @Override
    public GameMode[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            GameMode[] propTransformArray = new GameMode[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = GameMode.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
