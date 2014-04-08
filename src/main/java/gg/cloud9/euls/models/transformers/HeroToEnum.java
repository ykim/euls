package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Hero;

public class HeroToEnum implements ValueTransformer<Integer, Hero> {

    @Override
    public Hero transform(Integer propValue) {
        return Hero.fromId(propValue).orNull();
    }

    @Override
    public Hero[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            Hero[] propTransformArray = new Hero[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = Hero.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
