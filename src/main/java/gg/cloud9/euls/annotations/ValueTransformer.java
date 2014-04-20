package gg.cloud9.euls.annotations;

import java.util.ArrayList;

public interface ValueTransformer<FromType, ToType> {

    ToType transform(FromType propValue);

    ArrayList<ToType> transformArray(ArrayList<FromType> propArray);

}
