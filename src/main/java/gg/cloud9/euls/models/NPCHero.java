package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;

/**
 * NPCHero - Represents DT_DOTA_BaseNPC_Hero
 */
public interface NPCHero extends NPC {

    @DotAProperty(type = Integer.class, propertyName = "m_iCurrentXP")
    public Integer getCurrentExp();

    @DotAProperty(type = Float.class, propertyName = "m_flRespawnTime")
    public Float getCurrentRespawnTime();

    @DotAProperty(type = Float.class, propertyName = "m_flStrength")
    public Float getCurrentStrengthFromLevels();

    @DotAProperty(type = Float.class, propertyName = "m_flAgility")
    public Float getCurrentAgilityFromLevels();

    @DotAProperty(type = Float.class, propertyName = "m_flIntellect")
    public Float getCurrentIntellectFromLevels();

    @DotAProperty(type = Float.class, propertyName = "m_flStrengthTotal")
    public Float getCurrentTotalStrength();

    @DotAProperty(type = Float.class, propertyName = "m_flAgilityTotal")
    public Float getCurrentTotalAgility();

    @DotAProperty(type = Float.class, propertyName = "m_flIntellectTotal")
    public Float getCurrentTotalIntellect();

    @DotAProperty(type = Float.class, propertyName = "m_flSpawnedAt")
    public Float getLastSpawnedTime();
}
