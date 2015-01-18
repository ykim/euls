package ykim.euls.models;

import ykim.euls.constants.Hero;
import ykim.euls.models.protobuf.NPCHero;
import skadistats.clarity.model.Entity;

public class DotaHero extends NPCHero {

    public DotaHero(Entity e) {
        super(e);
    }

    public Hero getHero() {
        return Hero.fromInternalName(entity.getDtClass().getDtName()).orNull();
    }
}
