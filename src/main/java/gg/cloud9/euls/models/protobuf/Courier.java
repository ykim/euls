package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.models.transformers.IntegerToBoolean;

public interface Courier extends NPC {
    @DotAProperty(type = Float.class, propertyName = "m_flRespawnTime")
    public Float getRespawnTime();

    @DotAProperty(type = Integer.class, propertyName = "m_bFlyingCourier", transformer = IntegerToBoolean.class)
    public Boolean isFlying();
}
