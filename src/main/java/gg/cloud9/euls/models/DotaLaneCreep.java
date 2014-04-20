package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.LifeState;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.protobuf.NPCCreep;
import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;
import java.util.List;

public class DotaLaneCreep implements NPCCreep {
    private NPCCreep creep;

    public DotaLaneCreep(Entity entity) {
        this.creep = ModelProxyFactory.getProxy(NPCCreep.class, entity);
    }

    @Override
    public Vector2f getVectorOrigin() {
        return creep.getVectorOrigin();
    }

    @Override
    public LifeState getLifeState() {
        return creep.getLifeState();
    }

    @Override
    public Integer getDayVision() {
        return creep.getDayVision();
    }

    @Override
    public Integer getNightVision() {
        return creep.getNightVision();
    }

    @Override
    public List<Integer> getCurrentItemHandles() {
        return creep.getCurrentItemHandles();
    }

    @Override
    public List<Integer> getAbilityHandles() {
        return creep.getAbilityHandles();
    }

    @Override
    public Integer getCurrentLevel() {
        return creep.getCurrentLevel();
    }

    public Integer getCurrentHP() {
        Integer healthPercentageAsAbsolute = getHealthPercentage();

        if (healthPercentageAsAbsolute != null) {
            Double healthPercentage = healthPercentageAsAbsolute / 127.0;
            Long currentHealth = Math.round(getMaxHP() * healthPercentage);
            return new Integer(currentHealth.intValue());
        }

        return null;
    }

    @Override
    public Integer getMaxHP() {
        return creep.getMaxHP();
    }

    @Override
    public Float getCurrentHPRegen() {
        return creep.getCurrentHPRegen();
    }

    @Override
    public Float getCurrentMana() {
        return creep.getCurrentMana();
    }

    @Override
    public Float getMaxMana() {
        return creep.getMaxMana();
    }

    @Override
    public Float getCurrentManaRegen() {
        return creep.getCurrentManaRegen();
    }

    @Override
    public Boolean isNeutralUnit() {
        return creep.isNeutralUnit();
    }

    @Override
    public Boolean isAncientUnit() {
        return creep.isAncientUnit();
    }

    @Override
    public Boolean isSummoned() {
        return creep.isSummoned();
    }

    @Override
    public Boolean isDominable() {
        return creep.isDominable();
    }

    @Override
    public Integer getHealthPercentage() {
        return creep.getHealthPercentage();
    }

    @Override
    public Team getTeam() {
        return creep.getTeam();
    }

    @Override
    public String getName() {
        return creep.getName();
    }

    @Override
    public Integer getXCoordinate() {
        return creep.getXCoordinate();
    }

    @Override
    public Integer getYCoordinate() {
        return creep.getYCoordinate();
    }

    @Override
    public Integer getCellBits() {
        return creep.getCellBits();
    }
}
