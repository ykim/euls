package ykim.euls.annotations;

import java.util.List;

public interface ValueTransformer<FromType, ToType> {

    ToType transform(FromType propValue);

    List<ToType> transformArray(List<FromType> propArray);

}
