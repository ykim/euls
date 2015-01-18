package ykim.euls.models;

import ykim.euls.constants.Neutral;
import ykim.euls.models.protobuf.NPC;
import skadistats.clarity.model.Entity;
import skadistats.clarity.model.StringTable;

public class DotaNeutralCreep extends NPC {
    private StringTable models;

    public DotaNeutralCreep(Entity entity, StringTable modelsTable) {
        super(entity);
        models = modelsTable;
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

    public Neutral getNeutral() {
        return Neutral.fromModelName(getName(), getCurrentLevel()).orNull();
    }
}
