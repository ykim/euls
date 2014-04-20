package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameState;

import java.util.ArrayList;
import java.util.List;

public class GameStateToEnum implements ValueTransformer<Integer, GameState> {

    @Override
    public GameState transform(Integer propValue) {
        return GameState.fromId(propValue).orNull();
    }

    @Override
    public List<GameState> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<GameState> propTransformArray = new ArrayList<GameState>();

            for (Integer integer : propArray) {
                propTransformArray.add(GameState.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
