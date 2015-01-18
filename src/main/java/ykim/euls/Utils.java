package ykim.euls;

import ykim.euls.constants.Team;
import skadistats.clarity.match.EntityCollection;
import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {
    public static final Integer MAX_COORDINATE = 16384;
    public static final Integer NEGATIVE = 2097151;

    public static Vector2f cellToCoordinates(int xPosition, int yPosition, Vector2f offsets, int cellbits) {
        int cellWidth = 1 << cellbits;
        float xCoordinate = ((xPosition * cellWidth) - MAX_COORDINATE) + offsets.x;
        float yCoordinate = ((yPosition * cellWidth) - MAX_COORDINATE) + offsets.y;
        return new Vector2f(xCoordinate, yCoordinate);
    }

    public static List<Entity> getEntityFromHandles(List<Integer> handles, EntityCollection e) {
        ArrayList<Entity> entities = new ArrayList<Entity>();

        if (handles != null) {
            for (Integer handle : handles) {
                if (handle != null) {
                    if (handle != NEGATIVE) {
                        entities.add(e.getByHandle(handle));
                        continue;
                    }
                }
                entities.add(null);
            }
        }

        return entities;
    }

    public static List<Entity> getEntitiesByTeam(Iterator<Entity> iter, Team team) {
        ArrayList<Entity> entitiesByTeam = new ArrayList<Entity>();

        while (iter.hasNext()) {
            Entity entity = iter.next();

            if (entity != null) {
                ykim.euls.models.protobuf.Entity dotaEntity = new ykim.euls.models.protobuf.Entity(entity);

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
