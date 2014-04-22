package gg.cloud9.euls.models;

import gg.cloud9.euls.constants.Barracks;
import gg.cloud9.euls.constants.Lane;
import skadistats.clarity.model.Entity;

public class DotaBarracks extends DotaBuilding {

    public DotaBarracks(Entity e) {
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

    public Barracks getType() {
        String towerName = getName();
        String[] towerEntities = towerName.split("_");

        if (towerEntities.length == 4) {
            return Barracks.fromString(towerEntities[2]).orNull();
        }

        return null;
    }
}
