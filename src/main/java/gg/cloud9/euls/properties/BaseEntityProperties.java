package gg.cloud9.euls.properties;

import gg.cloud9.euls.Utils;
import gg.cloud9.euls.constants.DotaGameConstants;
import skadistats.clarity.model.Entity;

/**
 * BaseEntityProperties
 * Accessor for properties in DT_BaseEntity
 */
public class BaseEntityProperties {
    protected Entity entity;

    public BaseEntityProperties(Entity e) {
        this.entity = e;
    }

    public String getTeam() {
        Integer teamId = Utils.getPropertyFromEntity(this.entity, "m_iTeamNum");
        return DotaGameConstants.TEAM.get(teamId);
    }

    public Integer getXCoordinate() {
        return Utils.getPropertyFromEntity(this.entity, "m_cellX");
    }

    public Integer getYCoordinate() {
        return Utils.getPropertyFromEntity(this.entity, "m_cellY");
    }

    public Integer getCellBits() {
        return Utils.getPropertyFromEntity(this.entity, "m_cellbits");
    }
}
