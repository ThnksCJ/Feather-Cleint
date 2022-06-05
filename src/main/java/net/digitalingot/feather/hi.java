package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class hi {
    public static Class<?> ay(Class<?> clazz, int n, int n2) {
        ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericInterfaces()[n];
        return hi.ay(parameterizedType, n2);
    }

    public static Class<?> ay(Class<?> clazz, int n) {
        ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericSuperclass();
        return hi.ay(parameterizedType, n);
    }

    @Nullable
    public static Class<?> ay(ParameterizedType parameterizedType, int n) {
        Type type = parameterizedType.getActualTypeArguments()[n];
        String string = type.getTypeName();
        return Class.forName(string);
    }
}
