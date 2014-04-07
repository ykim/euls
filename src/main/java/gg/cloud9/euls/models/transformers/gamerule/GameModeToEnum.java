package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameMode;

public class GameModeToEnum implements ValueTransformer<Integer, GameMode> {

    @Override
    public GameMode transform(Integer propValue) {
        return GameMode.fromId(propValue).orNull();
    }
}
