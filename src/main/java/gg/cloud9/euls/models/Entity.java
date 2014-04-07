package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;

/**
 * Entity - Represents DT_BaseEntity
 */
public interface Entity {

    @DotAProperty(type = Integer.class, propertyName = "m_iTeamNum")
    String getTeamId();

    @DotAProperty(type = Integer.class, propertyName = "m_cellX")
    Integer getXCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellY")
    Integer getYCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellbits")
    Integer getCellBits();
}