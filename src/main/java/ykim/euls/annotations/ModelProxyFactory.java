package ykim.euls.annotations;

import ykim.euls.Utils;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

import skadistats.clarity.model.Entity;

import javax.vecmath.Vector2f;

public final class ModelProxyFactory {

    public static <T> T getProxy(Class<T> clazz, Entity entity) {
        ClassLoader loader = clazz.getClassLoader();
        Class<?>[] interfaces = {clazz};
        InvocationHandler handler = new EntityHandler(entity);

        @SuppressWarnings("unchecked")
        T proxy = (T) Proxy.newProxyInstance(loader, interfaces, handler);
        return proxy;
    }

    public static class EntityHandler implements InvocationHandler {
        private final Entity entity;

        public EntityHandler(Entity entity) {
            this.entity = entity;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // Check for annotations
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof DotAProperty) {
                    DotAProperty prop = (DotAProperty) annotation;
                    Object propValue = valueOfProperty(entity, prop.type(), prop.propertyName());
                    if (prop.transformer() == DotAProperty.NoTransformer.class) {
                        return propValue;
                    }

                    @SuppressWarnings("unchecked")
                    ValueTransformer<Object, Object> transformer = (ValueTransformer<Object, Object>) prop
                            .transformer().newInstance();
                    return transformer.transform(propValue);
                }
                if (annotation instanceof DotAArrayProperty) {
                    DotAArrayProperty prop = (DotAArrayProperty) annotation;
                    Object[] propArray = valueOfArrayProperty(entity, prop.type(), prop.propertyName());

                    // Convert to ArrayList
                    ArrayList<Object> propList = new ArrayList<Object>();
                    for (Object property: propArray) {
                        propList.add(property);
                    }

                    if (prop.transformer() == DotAArrayProperty.NoTransformer.class) {
                        return propList;
                    }

                    @SuppressWarnings("unchecked")
                    ValueTransformer<Object, Object> transformer = (ValueTransformer<Object, Object>) prop
                            .transformer().newInstance();
                    return transformer.transformArray(propList);
                }
            }

            // Check for defender
            if (method.isDefault()) {
                final Class<?> declaringClass = method.getDeclaringClass();
                return MethodHandles.lookup()
                        .in(declaringClass)
                        .unreflectSpecial(method, declaringClass)
                        .bindTo(proxy)
                        .invokeWithArguments(args);
            }
            return null;
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

}
