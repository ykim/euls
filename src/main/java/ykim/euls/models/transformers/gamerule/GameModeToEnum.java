package ykim.euls.models.transformers.gamerule;

import ykim.euls.annotations.ValueTransformer;
import ykim.euls.constants.gamerule.GameMode;

import java.util.ArrayList;
import java.util.List;

public class GameModeToEnum implements ValueTransformer<Integer, GameMode> {

    @Override
    public GameMode transform(Integer propValue) {
        return GameMode.fromId(propValue).orNull();
    }

    @Override
    public List<GameMode> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<GameMode> propTransformArray = new ArrayList<GameMode>();

            for (Integer integer : propArray) {
                propTransformArray.add(GameMode.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
