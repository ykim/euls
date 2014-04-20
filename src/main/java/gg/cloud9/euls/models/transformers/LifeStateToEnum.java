package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.LifeState;

import java.util.ArrayList;
import java.util.List;

public class LifeStateToEnum implements ValueTransformer<Integer, LifeState> {

    @Override
    public LifeState transform(Integer propValue) {
        return LifeState.fromId(propValue).orNull();
    }

    @Override
    public List<LifeState> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<LifeState> propTransformArray = new ArrayList<LifeState>();

            for (Integer integer : propArray) {
                propTransformArray.add(LifeState.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }

}
