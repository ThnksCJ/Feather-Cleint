package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class vs {
    @Nullable
    private static final Class<?> ho;
    private static final Field km;
    private static final Method db;
    private static long hv;
    private static boolean qo;

    public static boolean kx() {
        return ho != null;
    }

    public static void bo() {
        Object object = km.get(null);
        Class<?> clazz = Class.forName("com.replaymod.replay.gui.screen.GuiReplayViewer");
        Constructor<?> constructor = clazz.getConstructor(ho);
        Object obj = constructor.newInstance(object);
        Method method = clazz.getMethod("display");
        method.invoke(obj);
    }

    public static boolean cb() {
        if (ho == null) {
            return false;
        }
        long l = System.currentTimeMillis();
        if (l - hv < 1000L) {
            return qo;
        }
        Object object = km.get(null);
        Object object2 = db.invoke(object);
        hv = l;
        qo = object2 != null;
        return qo;
    }

    static {
        Class<?> clazz = Class.forName("com.replaymod.replay.ReplayModReplay");
        if (clazz == null) {
            ho = null;
            km = null;
            db = null;
        } else {
            ho = clazz;
            km = clazz.getDeclaredField("instance");
            db = clazz.getDeclaredMethod("getReplayHandler");
        }
    }
}
