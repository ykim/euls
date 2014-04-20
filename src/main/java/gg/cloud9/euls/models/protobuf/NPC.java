package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;
import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.constants.LifeState;
import gg.cloud9.euls.models.transformers.IntegerToBoolean;
import gg.cloud9.euls.models.transformers.LifeStateToEnum;

import javax.vecmath.Vector2f;
import java.util.List;

/**
 * NPC - Represents DT_DOTA_BaseNPC
 */
public interface NPC extends Entity {

    @DotAProperty(type = Vector2f.class, propertyName = "m_vecOrigin")
    public Vector2f getVectorOrigin();

    @DotAProperty(type = Integer.class, propertyName = "m_lifeState", transformer = LifeStateToEnum.class)
    public LifeState getLifeState();

    @DotAProperty(type = Vector2f.class, propertyName = "m_iDayTimeVisionRange")
    public Integer getDayVision();

    @DotAProperty(type = Vector2f.class, propertyName = "m_iNightTimeVisionRange")
    public Integer getNightVision();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_Inventory.m_hItems")
    public List<Integer> getCurrentItemHandles();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_hAbilities")
    public List<Integer> getAbilityHandles();

    @DotAProperty(type = Integer.class, propertyName = "m_iCurrentLevel")
    public Integer getCurrentLevel();

    @DotAProperty(type = Integer.class, propertyName = "m_iHealth")
    public Integer getCurrentHP();

    @DotAProperty(type = Integer.class, propertyName = "m_iMaxHealth")
    public Integer getMaxHP();

    @DotAProperty(type = Float.class, propertyName = "m_flHealthThinkRegen")
    public Float getCurrentHPRegen();

    @DotAProperty(type = Float.class, propertyName = "m_flMana")
    public Float getCurrentMana();

    @DotAProperty(type = Float.class, propertyName = "m_flMaxMana")
    public Float getMaxMana();

    @DotAProperty(type = Float.class, propertyName = "m_flManaThinkRegen")
    public Float getCurrentManaRegen();

    @DotAProperty(type = Integer.class, propertyName = "m_bIsNeutralUnitType", transformer = IntegerToBoolean.class)
    public Boolean isNeutralUnit();

    @DotAProperty(type = Integer.class, propertyName = "m_bIsAncient", transformer = IntegerToBoolean.class)
    public Boolean isAncientUnit();

    @DotAProperty(type = Integer.class, propertyName = "m_bIsSummoned", transformer = IntegerToBoolean.class)
    public Boolean isSummoned();

    @DotAProperty(type = Integer.class, propertyName = "m_bCanBeDominated", transformer = IntegerToBoolean.class)
    public Boolean isDominable();
}
