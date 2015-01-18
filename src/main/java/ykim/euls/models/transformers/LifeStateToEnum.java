package ykim.euls.models.transformers;

import ykim.euls.annotations.ValueTransformer;
import ykim.euls.constants.LifeState;

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
