package gg.cloud9.euls.models.transformers.gamerule;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.gamerule.GameWinner;

public class GameWinnerToEnum implements ValueTransformer<Integer, GameWinner> {
    
    @Override
    public GameWinner transform(Integer propValue) {
        return GameWinner.fromId(propValue).orNull();
    }
}
