package ykim.euls.models.protobuf;

import ykim.euls.constants.Team;
import ykim.euls.models.protobuf.base.EntityBase;
import ykim.euls.models.transformers.TeamToEnum;

/**
 * Entity - Represents DT_BaseEntity
 */
public class Entity extends EntityBase {

    public Entity(skadistats.clarity.model.Entity e) {
        super(e);
    }

    public Team getTeam() {
        TeamToEnum transformer = new TeamToEnum();
        return transformer.transform(getProperty(Integer.class, "m_iTeamNum"));
    }

    public String getName() {
        return getProperty(String.class, "m_iName");
    }

    public Integer getModelIndex() {
        return getProperty(Integer.class, "m_nModelIndex");
    }

    public Integer getXCoordinate() {
        return getProperty(Integer.class, "m_cellX");
    }

    public Integer getYCoordinate() {
        return getProperty(Integer.class, "m_cellY");
    }

    public Integer getCellBits() {
        return getProperty(Integer.class, "m_cellbits");
    }
}
