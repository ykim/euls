package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;

/**
 * Player - Represents DT_DOTAPlayer
 */
public interface Player extends Entity {

    @DotAProperty(type = Integer.class, propertyName = "m_iPlayerID")
    public Integer getPlayerId();

    @DotAProperty(type = Integer.class, propertyName = "m_hAssignedHero")
    public Integer getHeroId();
}
