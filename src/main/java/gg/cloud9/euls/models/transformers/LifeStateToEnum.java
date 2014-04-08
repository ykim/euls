package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.LifeState;

public class LifeStateToEnum implements ValueTransformer<Integer, LifeState> {

    @Override
    public LifeState transform(Integer propValue) {
        return LifeState.fromId(propValue).orNull();
    }

    @Override
    public LifeState[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            LifeState[] propTransformArray = new LifeState[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = LifeState.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }

}
