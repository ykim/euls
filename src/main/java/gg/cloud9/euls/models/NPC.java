package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.constants.LifeState;
import gg.cloud9.euls.models.transformers.LifeStateToEnum;

import javax.vecmath.Vector2f;

/**
 * NPC - Represents DT_DOTA_BaseNPC
 */
public interface NPC extends Entity {

    @DotAProperty(type = Vector2f.class, propertyName = "m_vecOrigin")
    public Vector2f getVectorOrigin();

    @DotAProperty(type = Integer.class, propertyName = "m_lifeState", transformer = LifeStateToEnum.class)
    public LifeState getLifeState();

    @DotAProperty(type = Integer.class, propertyName = "m_iCurrentLevel")
    public Integer getCurrentLevel();

    @DotAProperty(type = Integer.class, propertyName = "m_iHealth")
    public Integer getCurrentHP();

    @DotAProperty(type = Integer.class, propertyName = "m_iMaxHealth")
    public Integer getCurrentMaxHP();

    @DotAProperty(type = Float.class, propertyName = "m_flHealthThinkRegen")
    public Float getCurrentHPRegen();

    @DotAProperty(type = Float.class, propertyName = "m_flMana")
    public Float getCurrentMana();

    @DotAProperty(type = Float.class, propertyName = "m_flMaxMana")
    public Float getCurrentMaxMana();

    @DotAProperty(type = Float.class, propertyName = "m_flManaThinkRegen")
    public Float getCurrentManaRegen();
}
