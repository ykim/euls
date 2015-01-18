package ykim.euls.models.protobuf;

/**
 * NPCHero - Represents DT_DOTA_BaseNPC_Hero
 */
public class NPCHero extends NPC {

    public NPCHero(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getPlayerId() {
        return getProperty(Integer.class, "m_iPlayerID");
    }

    public Integer getCurrentExp() {
        return getProperty(Integer.class, "m_iCurrentXP");
    }

    public Float getCurrentRespawnTime() {
        return getProperty(Float.class, "m_flRespawnTime");
    }

    public Float getCurrentStrengthFromLevels() {
        return getProperty(Float.class, "m_flStrength");
    }

    public Float getCurrentAgilityFromLevels() {
        return getProperty(Float.class, "m_flAgility");
    }

    public Float getCurrentIntellectFromLevels() {
        return getProperty(Float.class, "m_flIntellect");
    }

    public Float getCurrentTotalStrength() {
        return getProperty(Float.class, "m_flStrengthTotal");
    }

    public Float getCurrentTotalAgility() {
        return getProperty(Float.class, "m_flAgilityTotal");
    }

    public Float getCurrentTotalIntellect() {
        return getProperty(Float.class, "m_flIntellectTotal");
    }

    public Float getLastSpawnedTime() {
        return getProperty(Float.class, "m_flSpawnedAt");
    }
}
