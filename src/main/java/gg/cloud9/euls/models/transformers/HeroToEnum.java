package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Hero;

public class HeroToEnum implements ValueTransformer<Integer, Hero> {

    @Override
    public Hero transform(Integer propValue) {
        return Hero.fromId(propValue).orNull();
    }
}
