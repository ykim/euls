package gg.cloud9.euls.models;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.LifeState;
import gg.cloud9.euls.constants.Team;
import gg.cloud9.euls.models.protobuf.NPC;
import skadistats.clarity.model.Entity;
import skadistats.clarity.model.StringTable;

import javax.vecmath.Vector2f;
import java.util.List;

public class DotaNeutralCreep implements NPC {
    private NPC neutral;
    private StringTable models;

    public DotaNeutralCreep(Entity entity, StringTable modelsTable) {
        neutral = ModelProxyFactory.getProxy(NPC.class, entity);
        models = modelsTable;
    }

    @Override
    public Vector2f getVectorOrigin() {
        return neutral.getVectorOrigin();
    }

    @Override
    public LifeState getLifeState() {
        return neutral.getLifeState();
    }

    @Override
    public Integer getDayVision() {
        return neutral.getDayVision();
    }

    @Override
    public Integer getNightVision() {
        return neutral.getNightVision();
    }

    @Override
    public List<Integer> getCurrentItemHandles() {
        return neutral.getCurrentItemHandles();
    }

    @Override
    public List<Integer> getAbilityHandles() {
        return neutral.getAbilityHandles();
    }

    @Override
    public Integer getCurrentLevel() {
        return neutral.getCurrentLevel();
    }

    @Override
    public Integer getCurrentHP() {
        return neutral.getCurrentHP();
    }

    @Override
    public Integer getMaxHP() {
        return neutral.getMaxHP();
    }

    @Override
    public Float getCurrentHPRegen() {
        return neutral.getCurrentHPRegen();
    }

    @Override
    public Float getCurrentMana() {
        return neutral.getCurrentMana();
    }

    @Override
    public Float getMaxMana() {
        return neutral.getMaxMana();
    }

    @Override
    public Float getCurrentManaRegen() {
        return neutral.getCurrentManaRegen();
    }

    @Override
    public Boolean isNeutralUnit() {
        return neutral.isNeutralUnit();
    }

    @Override
    public Boolean isAncientUnit() {
        return neutral.isAncientUnit();
    }

    @Override
    public Boolean isSummoned() {
        return neutral.isSummoned();
    }

    @Override
    public Boolean isDominable() {
        return neutral.isDominable();
    }

    @Override
    public Team getTeam() {
        return neutral.getTeam();
    }

    @Override
    public String getName() {
        if (models != null) {
            String modelCacheName = models.getNameByIndex(getModelIndex());
            Integer index = modelCacheName.lastIndexOf("/");
            if (index != -1) {
                return modelCacheName.substring(index + 1);
            }
        }
        return null;
    }

    @Override
    public Integer getModelIndex() {
        return neutral.getModelIndex();
    }

    @Override
    public Integer getXCoordinate() {
        return neutral.getXCoordinate();
    }

    @Override
    public Integer getYCoordinate() {
        return neutral.getYCoordinate();
    }

    @Override
    public Integer getCellBits() {
        return neutral.getCellBits();
    }
}
