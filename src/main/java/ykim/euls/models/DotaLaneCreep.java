package ykim.euls.models;

import ykim.euls.models.protobuf.NPCCreep;
import skadistats.clarity.model.Entity;
import skadistats.clarity.model.StringTable;

public class DotaLaneCreep extends NPCCreep {
    private StringTable models;

    public DotaLaneCreep(Entity entity, StringTable modelsTable) {
        super(entity);
        this.models = modelsTable;
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
}
