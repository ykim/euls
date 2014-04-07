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

}
