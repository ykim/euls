package gg.cloud9.euls.models;

import gg.cloud9.euls.models.protobuf.Item;
import skadistats.clarity.model.Entity;

public class DotaItem extends Item {

    public DotaItem(Entity e) {
        super(e);
    }

    public gg.cloud9.euls.constants.Item getItem() {
        return gg.cloud9.euls.constants.Item.fromInternalName(getName()).orNull();
    }
}
