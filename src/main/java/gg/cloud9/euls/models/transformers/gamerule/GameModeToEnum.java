package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameMode;

import java.util.ArrayList;

public class GameModeToEnum implements ValueTransformer<Integer, GameMode> {

    @Override
    public GameMode transform(Integer propValue) {
        return GameMode.fromId(propValue).orNull();
    }

    @Override
    public ArrayList<GameMode> transformArray(ArrayList<Integer> propArray) {
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
