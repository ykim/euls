package ykim.euls.models.transformers.gamerule;

import ykim.euls.annotations.ValueTransformer;
import ykim.euls.constants.gamerule.GamePickState;

import java.util.ArrayList;
import java.util.List;

public class GamePickStateToEnum implements ValueTransformer<Integer, GamePickState> {

    @Override
    public GamePickState transform(Integer propValue) {
        return GamePickState.fromId(propValue).orNull();
    }

    @Override
    public List<GamePickState> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<GamePickState> propTransformArray = new ArrayList<GamePickState>();

            for (Integer integer : propArray) {
                propTransformArray.add(GamePickState.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
