package gg.cloud9.euls.models.protobuf;

import gg.cloud9.euls.annotations.DotAProperty;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.transformers.TeamToEnum;

/**
 * Entity - Represents DT_BaseEntity
 */
public interface Entity {

    @DotAProperty(type = Integer.class, propertyName = "m_iTeamNum", transformer = TeamToEnum.class)
    public Team getTeam();

    @DotAProperty(type = String.class, propertyName = "m_iName")
    public String getName();

    @DotAProperty(type = Integer.class, propertyName = "m_cellX")
    public Integer getXCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellY")
    public Integer getYCoordinate();

    @DotAProperty(type = Integer.class, propertyName = "m_cellbits")
    public Integer getCellBits();
}
