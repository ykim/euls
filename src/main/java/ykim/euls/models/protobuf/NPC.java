package ykim.euls.models.protobuf;

import ykim.euls.Utils;
import ykim.euls.constants.LifeState;
import ykim.euls.models.transformers.IntegerToBoolean;
import ykim.euls.models.transformers.LifeStateToEnum;

import javax.vecmath.Vector2f;
import java.util.List;

/**
 * NPC - Represents DT_DOTA_BaseNPC
 */
public class NPC extends Entity {

    public NPC(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Vector2f getCoordinates() {
        return Utils.cellToCoordinates(getXCoordinate(), getYCoordinate(), getVectorOrigin(), getCellBits());
    }

    public Vector2f getVectorOrigin() {
        return getProperty(Vector2f.class, "m_vecOrigin");
    }

    public LifeState getLifeState() {
        LifeStateToEnum transformer = new LifeStateToEnum();
        return transformer.transform(getProperty(Integer.class, "m_lifeState"));
    }

    public Integer getDayVision() {
        return getProperty(Integer.class, "m_iDayTimeVisionRange");
    }

    public Integer getNightVision() {
        return getProperty(Integer.class, "m_iNightTimeVisionRange");
    }

    public List<Integer> getCurrentItemHandles() {
        return getListProperty(Integer.class, "m_Inventory.m_hItems");
    }

    public List<Integer> getAbilityHandles() {
        return getListProperty(Integer.class, "m_hAbilities");
    }

    public Integer getCurrentLevel() {
        return getProperty(Integer.class, "m_iCurrentLevel");
    }

    public Integer getCurrentHP() {
        return getProperty(Integer.class, "m_iHealth");
    }

    public Integer getMaxHP() {
        return getProperty(Integer.class, "m_iMaxHealth");
    }

    public Float getCurrentHPRegen() {
        return getProperty(Float.class, "m_flHealthThinkRegen");
    }

    public Float getCurrentMana() {
        return getProperty(Float.class, "m_flMana");
    }

    public Float getMaxMana() {
        return getProperty(Float.class, "m_flMaxMana");
    }

    public Float getCurrentManaRegen() {
        return getProperty(Float.class, "m_flManaThinkRegen");
    }

    public Integer getMinDamage() {
        return getProperty(Integer.class, "m_iDamageMin");
    }

    public Integer getMaxDamage() {
        return getProperty(Integer.class, "m_iDamageMax");
    }

    public Integer getBonusDamage() {
        return getProperty(Integer.class, "m_iDamageBonus");
    }

    public Long getTotalDamageTaken() {
        return getProperty(Long.class, "m_nTotalDamageTaken");
    }

    public Boolean isNeutralUnit() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bIsNeutralUnitType"));
    }

    public Boolean isAncientUnit() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bIsAncient"));
    }

    public Boolean isSummoned() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bIsSummoned"));
    }

    public Boolean isDominable() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bCanBeDominated"));
    }
}
