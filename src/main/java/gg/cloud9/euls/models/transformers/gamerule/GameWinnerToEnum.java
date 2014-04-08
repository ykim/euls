package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameWinner;

public class GameWinnerToEnum implements ValueTransformer<Integer, GameWinner> {
    
    @Override
    public GameWinner transform(Integer propValue) {
        return GameWinner.fromId(propValue).orNull();
    }

    @Override
    public GameWinner[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            GameWinner[] propTransformArray = new GameWinner[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = GameWinner.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
