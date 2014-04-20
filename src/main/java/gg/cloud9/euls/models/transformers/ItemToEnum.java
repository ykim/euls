package gg.cloud9.euls.models.transformers;

import gg.cloud9.euls.annotations.ValueTransformer;
import gg.cloud9.euls.constants.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemToEnum implements ValueTransformer<Integer, Item> {

    @Override
    public Item transform(Integer propValue) {
        return Item.fromId(propValue).orNull();
    }

    @Override
    public List<Item> transformArray(List<Integer> propArray) {
        if (propArray != null) {
            ArrayList<Item> propTransformArray = new ArrayList<Item>();

            for (Integer integer : propArray) {
                propTransformArray.add(Item.fromId(integer).orNull());
            }

            return propTransformArray;
        }
        return null;
    }
}
