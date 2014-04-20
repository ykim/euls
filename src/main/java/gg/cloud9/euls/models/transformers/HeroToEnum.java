package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Hero;

import java.util.ArrayList;

public class HeroToEnum implements ValueTransformer<Integer, Hero> {

    @Override
    public Hero transform(Integer propValue) {
        return Hero.fromId(propValue).orNull();
    }

    @Override
    public ArrayList<Hero> transformArray(ArrayList<Integer> propArray) {
        if (propArray != null) {
            ArrayList<Hero> propTransformArray = new ArrayList<Hero>();

            for (Integer integer : propArray) {
                propTransformArray.add(Hero.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
