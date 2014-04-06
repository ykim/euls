package gg.cloud9.euls.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DotAProperty {
    static interface NoTransformer extends ValueTransformer<Void, Void> {};

    String propertyName();

    Class<?> type() default String.class;

    Class<? extends ValueTransformer<?,?>> transformer() default NoTransformer.class;
}
