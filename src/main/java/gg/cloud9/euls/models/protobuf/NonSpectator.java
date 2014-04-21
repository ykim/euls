package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.models.protobuf.base.EntityBase;

import java.util.List;

/**
 * NonSpectator - Represents DT_DOTA_DataNonSpectator
 */
public class NonSpectator extends EntityBase {

    public NonSpectator(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public List<Integer> getCurrentReliableGold() {
        return getListProperty(Integer.class, "m_iReliableGoldDire");
    }

    public List<Integer> getCurrentUnreliableGold() {
        return getListProperty(Integer.class, "m_iUnreliableGold");
    }
}
