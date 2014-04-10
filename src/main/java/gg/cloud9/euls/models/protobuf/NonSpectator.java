package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;

/**
 * NonSpectator - Represents DT_DOTA_DataNonSpectator
 */
public interface NonSpectator {
    @DotAArrayProperty(type = Integer.class, propertyName = "m_iReliableGoldDire")
    public Integer[] getCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iUnreliableGold")
    public Integer[] getCurrentUnreliableGold();
}
