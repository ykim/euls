package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.transformers.TeamToEnum;

/**
 * Entity - Represents DT_BaseEntity
 */
public interface Entity {

    @DotAProperty(type = Integer.class, propertyName = "m_iTeamNum", transformer = TeamToEnum.class)
    Team getTeamId();

    @DotAProperty(type = String.class, propertyName = "m_iName")
    String getName();

    @DotAProperty(type = Integer.class, propertyName = "m_cellX")
    Integer getXCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellY")
    Integer getYCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellbits")
    Integer getCellBits();
}
