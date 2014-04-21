package gg.cloud9.euls.models;

import gg.cloud9.euls.constants.Hero;
import gg.cloud9.euls.models.protobuf.NPCHero;
import skadistats.clarity.model.Entity;

public class DotaHero extends NPCHero {

    public DotaHero(Entity e) {
        super(e);
    }

    public Hero getHero() {
        return Hero.fromInternalName(entity.getDtClass().getDtName()).orNull();
    }
}
