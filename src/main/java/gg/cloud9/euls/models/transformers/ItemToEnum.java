package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Item;

public class ItemToEnum implements ValueTransformer<Integer, Item> {

    @Override
    public Item transform(Integer propValue) {
        return Item.fromId(propValue).orNull();
    }

    @Override
    public Item[] transformArray(Integer[] propArray) {
        if (propArray != null) {
            Item[] propTransformArray = new Item[propArray.length];

            for (int i = 0; i < propArray.length; i++) {
                propTransformArray[i] = Item.fromId(propArray[i]).orNull();
            }

            return propTransformArray;
        }
        return null;
    }
}
