package net.digitalingot.feather;

import java.util.function.Function;

public final class yd {
    private static final boolean wg = true;

    private yd() {
    }

    public static boolean ut() {
        return wg;
    }

    public static void sm() {
        vq.sm();
    }

    public static <T> gb<T> ay(Class<? super T> clazz, Function<T[], T> function) {
        return vq.ay(clazz, function);
    }

    public static <T> gb<T> ay(Class<T> clazz, T t, Function<T[], T> function) {
        return yd.ay(clazz, objectArray -> {
            if (objectArray.length == 0) {
                return t;
            }
            if (objectArray.length == 1) {
                return objectArray[0];
            }
            return function.apply(objectArray);
        });
    }

    public static String rf(Object object) {
        return object.getClass().getName();
    }
}
