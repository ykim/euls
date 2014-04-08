package gg.cloud9.euls.annotations;

public interface ValueTransformer<FromType, ToType> {

    ToType transform(FromType propValue);

    ToType[] transformArray(FromType[] propArray);

}
