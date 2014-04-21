package gg.cloud9.euls.models.protobuf;

/**
 * NPCCreep - Represents DT_DOTA_BaseNPC_Creep_Lane
 */
public class NPCCreep extends NPC {

    public NPCCreep(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Integer getHealthPercentage() {
        return getProperty(Integer.class, "m_iHealthPercentage");
    }

    @Override
    public Integer getCurrentHP() {
        Integer healthPercentageAsAbsolute = getHealthPercentage();

        if (healthPercentageAsAbsolute != null) {
            Double healthPercentage = healthPercentageAsAbsolute / 127.0;
            Long currentHealth = Math.round(getMaxHP() * healthPercentage);
            return new Integer(currentHealth.intValue());
        }

        return null;
    }
}
