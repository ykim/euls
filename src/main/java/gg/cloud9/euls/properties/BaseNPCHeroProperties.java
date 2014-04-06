package gg.cloud9.euls.properties;

import gg.cloud9.euls.Utils;
import skadistats.clarity.model.Entity;

/**
 * BaseNPCHeroProperties
 * Accessor for properties in DT_DOTA_BaseNPC_Hero
 */
public class BaseNPCHeroProperties extends BaseNPCProperties {
    public BaseNPCHeroProperties(Entity e) {
        super(e);
    }

    public Integer getCurrentExp() {
        return Utils.getPropertyFromEntity(this.entity, "m_iCurrentXP");
    }

    public Float getCurrentRespawnTime() {
        return Utils.getPropertyFromEntity(this.entity, "m_flRespawnTime");
    }

    public Float getCurrentStrengthFromLevels() {
        return Utils.getPropertyFromEntity(this.entity, "m_flStrength");
    }

    public Float getCurrentAgilityFromLevels() {
        return Utils.getPropertyFromEntity(this.entity, "m_flAgility");
    }

    public Float getCurrentIntellectFromLevels() {
        return Utils.getPropertyFromEntity(this.entity, "m_flIntellect");
    }

    public Float getCurrentTotalStrength() {
        return Utils.getPropertyFromEntity(this.entity, "m_flStrengthTotal");
    }

    public Float getCurrentTotalAgility() {
        return Utils.getPropertyFromEntity(this.entity, "m_flAgilityTotal");
    }

    public Float getCurrentTotalIntellect() {
        return Utils.getPropertyFromEntity(this.entity, "m_flIntellectTotal");
    }

    public Float getLastSpawnedTime() {
        return Utils.getPropertyFromEntity(this.entity, "m_flSpawnedAt");
    }
}
