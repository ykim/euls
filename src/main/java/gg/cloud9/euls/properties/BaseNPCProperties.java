package gg.cloud9.euls.properties;

import gg.cloud9.euls.Utils;
import gg.cloud9.euls.constants.DotaGamePropertyConstants;
import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;

/**
 * BaseNPCProperties
 * Accessor for properties in DT_DOTA_BaseNPC
 */
public class BaseNPCProperties extends BaseEntityProperties {
    public BaseNPCProperties(Entity e) {
        super(e);
    }

    // Returns coordinate
    public Vector2f getCoordinates() {
        Vector2f xy_offsets = Utils.getPropertyFromEntity(this.entity, "m_vecOrigin");
        return Utils.cellToCoordinates(this.getXCoordinate(), this.getYCoordinate(), xy_offsets, this.getCellBits());
    }

    // Returns state of NPC
    public String getLifeState() {
        Integer lifeState = Utils.getPropertyFromEntity(this.entity, "m_lifeState");
        return lifeState != null ? DotaGamePropertyConstants.LIFE_STATE.get(lifeState) : "";
    }

    public Integer getCurrentLevel() {
        return Utils.getPropertyFromEntity(this.entity, "m_iCurrentLevel");
    }

    public Integer getCurrentHP() {
        return Utils.getPropertyFromEntity(this.entity, "m_iHealth");
    }

    public Integer getCurrentMaxHP() {
        return Utils.getPropertyFromEntity(this.entity, "m_iMaxHealth");
    }

    public Float getCurrentHPRegen() {
        return Utils.getPropertyFromEntity(this.entity, "m_flHealthThinkRegen");
    }

    public Float getCurrentMana() {
        return Utils.getPropertyFromEntity(this.entity, "m_flMana");
    }

    public Float getCurrentMaxMana() {
        return Utils.getPropertyFromEntity(this.entity, "m_flMaxMana");
    }

    public Float getCurrentManaRegen() {
        return Utils.getPropertyFromEntity(this.entity, "m_flManaThinkRegen");
    }
}
