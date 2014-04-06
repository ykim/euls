package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.LifeState;

public class LifeStateToEnum implements ValueTransformer<Integer, LifeState> {

    @Override
    public LifeState transform(Integer propValue) {
        return LifeState.fromId(propValue).orNull();
    }

}
