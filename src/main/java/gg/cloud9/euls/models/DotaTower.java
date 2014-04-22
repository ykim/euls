package gg.cloud9.euls.models;

import gg.cloud9.euls.constants.Lane;
import skadistats.clarity.model.Entity;

public class DotaTower extends DotaBuilding {

    public DotaTower(Entity e) {
        super(e);
    }

    public Lane getLane() {
        String towerName = getName();
        String[] towerEntities = towerName.split("_");

        if (towerEntities.length == 4) {
            return Lane.fromString(towerEntities[3]).orNull();
        }

        return null;
    }

    public Integer getTier() {
        String towerName = getName();
        String[] towerEntities = towerName.split("_");

        if (towerEntities.length == 4) {
            return Integer.parseInt(towerEntities[2].substring(5));
        }

        return null;
    }
}
