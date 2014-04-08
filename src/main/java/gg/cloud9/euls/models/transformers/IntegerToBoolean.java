package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;

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
    public Boolean[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            Boolean[] propTransformArray = new Boolean[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                if (propArray[i] != null) {
                    if (propArray[i] == 0) {
                        propTransformArray[i] = Boolean.FALSE;
                    } else {
                        propTransformArray[i] = Boolean.TRUE;
                    }
                }
            }

            return propTransformArray;
        }
        return null;
    }

}
