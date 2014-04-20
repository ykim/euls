package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GamePickState;

import java.util.ArrayList;

public class GamePickStateToEnum implements ValueTransformer<Integer, GamePickState> {

    @Override
    public GamePickState transform(Integer propValue) {
        return GamePickState.fromId(propValue).orNull();
    }

    @Override
    public ArrayList<GamePickState> transformArray(ArrayList<Integer> propArray) {
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
