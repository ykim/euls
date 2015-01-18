package ykim.euls.models;

import ykim.euls.models.protobuf.Item;
import skadistats.clarity.model.Entity;

public class DotaItem extends Item {

    public DotaItem(Entity e) {
        super(e);
    }

    public ykim.euls.constants.Item getItem() {
        return ykim.euls.constants.Item.fromInternalName(getName()).orNull();
    }
}
