package ykim.euls.models.transformers.gamerule;

import ykim.euls.annotations.ValueTransformer;
import ykim.euls.constants.gamerule.GameWinner;

import java.util.ArrayList;
import java.util.List;

public class GameWinnerToEnum implements ValueTransformer<Integer, GameWinner> {

    @Override
    public GameWinner transform(Integer propValue) {
        return GameWinner.fromId(propValue).orNull();
    }

    @Override
    public List<GameWinner> transformArray(List<Integer> propArray) {
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
