package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;

/**
 * Ability - Represents DT_DOTABaseAbility
 */
public interface Ability extends Entity {

    @DotAProperty(type = Integer.class, propertyName = "m_iLevel")
    public Integer getLevel();

    @DotAProperty(type = Float.class, propertyName = "m_fCooldown")
    public Float getCooldownTime();

    @DotAProperty(type = Float.class, propertyName = "m_flCooldownLength")
    public Float getCooldownLength();

    @DotAProperty(type = Integer.class, propertyName = "m_iManaCost")
    public Integer getManaCost();

    @DotAProperty(type = Integer.class, propertyName = "m_iCastRange")
    public Integer getCastRange();
}
