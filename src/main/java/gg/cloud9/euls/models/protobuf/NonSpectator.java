package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAArrayProperty;

import java.util.ArrayList;

/**
 * NonSpectator - Represents DT_DOTA_DataNonSpectator
 */
public interface NonSpectator {
    @DotAArrayProperty(type = Integer.class, propertyName = "m_iReliableGoldDire")
    public ArrayList<Integer> getCurrentReliableGold();

    @DotAArrayProperty(type = Integer.class, propertyName = "m_iUnreliableGold")
    public ArrayList<Integer> getCurrentUnreliableGold();
}
