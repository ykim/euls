package ykim.euls.models.protobuf;

/**
 * Ability - Represents DT_DOTABaseAbility
 */
public class Ability extends Entity {

    public Ability(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getLevel() {
        return getProperty(Integer.class, "m_iLevel");
    }

    public Float getCooldownTime() {
        return getProperty(Float.class, "m_fCooldown");
    }

    public Float getCooldownLength() {
        return getProperty(Float.class, "m_flCooldownLength");
    }

    public Integer getManaCost() {
        return getProperty(Integer.class, "m_iManaCost");
    }

    public Integer getCastRange() {
        return getProperty(Integer.class, "m_iCastRange");
    }
}
