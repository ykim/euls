package ykim.euls.models.protobuf.base;

import ykim.euls.Utils;
import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityBase - Represents a clarity entity wrapper
 */
public class EntityBase {
    protected Entity entity;

    public EntityBase(Entity e) {
        entity = e;
    }

    public <T> T getProperty(Class<T> clazz, String propertyName) {
        return valueOfProperty(entity, clazz, propertyName);
    }

    public <T> List<T> getListProperty(Class<T> clazz, String propertyName) {
        T[] propArray = valueOfArrayProperty(entity, clazz, propertyName);
        ArrayList<T> propList = new ArrayList<>();
        for (T property : propArray) {
            propList.add(property);
        }
        return propList;
    }

    @SuppressWarnings("unchecked")
    private static <T> T valueOfProperty(Entity entity, Class<T> clazz, String propertyName) {
        if (clazz == String.class) {
            return (T) Utils.getPropertyFromEntity(entity, String.class, propertyName);
        } else if (clazz == Integer.class) {
            return (T) Utils.getPropertyFromEntity(entity, Integer.class, propertyName);
        } else if (clazz == Float.class) {
            return (T) Utils.getPropertyFromEntity(entity, Float.class, propertyName);
        } else if (clazz == Long.class) {
            return (T) Utils.getPropertyFromEntity(entity, Long.class, propertyName);
        } else if (clazz == Vector2f.class) {
            return (T) Utils.getPropertyFromEntity(entity, Vector2f.class, propertyName);
        } else {
            throw new RuntimeException("This type is not supported yet");
        }

    }

    @SuppressWarnings("unchecked")
    private static <T> T[] valueOfArrayProperty(Entity entity, Class<T> clazz, String propertyName) {
        if (clazz == String.class) {
            return (T[]) Utils.getArrayPropertyFromEntity(entity, String.class, propertyName);
        } else if (clazz == Integer.class) {
            return (T[]) Utils.getArrayPropertyFromEntity(entity, Integer.class, propertyName);
        } else if (clazz == Float.class) {
            return (T[]) Utils.getArrayPropertyFromEntity(entity, Float.class, propertyName);
        } else if (clazz == Long.class) {
            return (T[]) Utils.getArrayPropertyFromEntity(entity, Long.class, propertyName);
        } else {
            throw new RuntimeException("This type is not supported yet");
        }

    }

}
