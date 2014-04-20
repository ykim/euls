package gg.cloud9.euls;

import gg.cloud9.euls.annotations.ModelProxyFactory;
import gg.cloud9.euls.constants.Team;
import skadistats.clarity.match.EntityCollection;
import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;
import java.util.ArrayList;
import java.util.Iterator;

public class Utils {
    public static final Integer MAX_COORDINATE = 16384;
    public static final Integer NEGATIVE = 2097151;

    public static Vector2f cellToCoordinates(int xPosition, int yPosition, Vector2f offsets, int cellbits) {
        int cellWidth = 1 << cellbits;
        float xCoordinate = ((xPosition * cellWidth) - MAX_COORDINATE) + offsets.x;
        float yCoordinate = ((yPosition * cellWidth) - MAX_COORDINATE) + offsets.y;
        return new Vector2f(xCoordinate, yCoordinate);
    }

    // TODO: Change this to an ArrayList
    public static Entity[] getEntityFromHandles(Integer[] handles, EntityCollection e) {
        if (handles != null) {
            Entity[] entities = new Entity[handles.length];

            for (int i = 0; i < handles.length; i++) {
                if (handles[i] != NEGATIVE) {
                    entities[i] = e.getByHandle(handles[i]);
                } else {
                    entities[i] = null;
                }
            }
            return entities;
        }
        return null;
    }

    public static ArrayList<Entity> getEntitiesByTeam(Iterator<Entity> iter, Team team) {
        ArrayList<Entity> entitiesByTeam = new ArrayList<Entity>();

        while (iter.hasNext()) {
            Entity entity = iter.next();

            if (entity != null) {
                gg.cloud9.euls.models.protobuf.Entity dotaEntity = ModelProxyFactory.getProxy(gg.cloud9.euls.models.protobuf.Entity.class, entity);

                if (dotaEntity != null) {
                    Team dotaTeam = dotaEntity.getTeam();

                     if (dotaTeam == team) {
                         entitiesByTeam.add(entity);
                     }
                }
            }
        }

        return entitiesByTeam;
    }

    public static <T> T getPropertyFromEntity(Entity e, Class<T> clazz, String name) {
        if (e != null) {
            return (T) e.<T>getProperty(name);
        }
        return null;
    }

    public static <T> T[] getArrayPropertyFromEntity(Entity e, Class<T> clazz, String name) {
        if (e != null) {
            return e.getArrayProperty(clazz, name);
        }
        return null;
    }
}
