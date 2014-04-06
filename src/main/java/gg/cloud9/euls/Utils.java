package gg.cloud9.euls;

import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;

public class Utils {
    public static final int MAX_COORDINATE = 16384;

    public static Vector2f cellToCoordinates(int xPosition, int yPosition, Vector2f offsets, int cellbits) {
        int cellWidth = 1 << cellbits;
        float xCoordinate = ((xPosition * cellWidth) - MAX_COORDINATE) + offsets.x;
        float yCoordinate = ((yPosition * cellWidth) - MAX_COORDINATE) + offsets.y;
        return new Vector2f(xCoordinate, yCoordinate);
    }

    @Deprecated
    public static <T> T getPropertyFromEntity(Entity e, String name) {
        if (e != null) {
            return (T) e.<T>getProperty(name);
        }
        return null;
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
