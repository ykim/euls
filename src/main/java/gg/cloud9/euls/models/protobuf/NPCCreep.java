package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAProperty;

/**
 * NPCCreep - Represents DT_DOTA_BaseNPC_Creep_Lane
 */
public interface NPCCreep extends NPC {
    @DotAProperty(type = Integer.class, propertyName = "m_iHealthPercentage")
    public Integer getHealthPercentage();
}
