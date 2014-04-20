package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;

import java.util.ArrayList;
import java.util.List;

public class IntegerToBoolean implements ValueTransformer<Integer, Boolean> {

    @Override
    public Boolean transform(Integer propValue) {
        if (propValue != null) {
            if (propValue == 0) {
                return Boolean.FALSE;
            } else {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    @Override
    public List<Boolean> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<Boolean> propTransformArray = new ArrayList<Boolean>();

            for (Integer integer : propArray) {
                if (integer == 0) {
                    propTransformArray.add(Boolean.TRUE);
                } else {
                    propTransformArray.add(Boolean.FALSE);
                }
            }

            return propTransformArray;
        }
        return null;
    }

}
