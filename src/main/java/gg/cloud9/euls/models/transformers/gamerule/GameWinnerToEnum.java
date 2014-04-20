package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameWinner;

import java.util.ArrayList;

public class GameWinnerToEnum implements ValueTransformer<Integer, GameWinner> {

    @Override
    public GameWinner transform(Integer propValue) {
        return GameWinner.fromId(propValue).orNull();
    }

    @Override
    public ArrayList<GameWinner> transformArray(ArrayList<Integer> propArray) {
        if (propArray != null) {
            ArrayList<GameWinner> propTransformArray = new ArrayList<GameWinner>();

            for (Integer integer : propArray) {
                propTransformArray.add(GameWinner.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
