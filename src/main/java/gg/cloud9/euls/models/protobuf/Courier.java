package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.models.transformers.IntegerToBoolean;

public class Courier extends NPC {

    public Courier(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Float getRespawnTime() {
        return getProperty(Float.class, "m_flRespawnTime");
    }

    public Boolean isFlying() {
        IntegerToBoolean transformer = new IntegerToBoolean();
        return transformer.transform(getProperty(Integer.class, "m_bFlyingCourier"));
    }
}
