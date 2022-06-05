package net.digitalingot.feather;

import java.lang.reflect.Field;

public class zl {
    private static final boolean eu;
    private static Class<?> hy;
    private static Field he;

    static {
        Class.forName("club.sk1er.patcher.mixins.plugin.PatcherMixinPlugin");
        eu = true;
        vm.Fq.info("Detected PatcherMod! Disabling patches...");
    }

    public static boolean xb() {
        return eu;
    }

    public static void al() {
        block0:
        {
            if (!eu) break block0;
            hy = Class.forName("club.sk1er.patcher.config.PatcherConfig");
            he = hy.getField("batchModelRendering");
            he.setAccessible(true);
        }
    }

    public static void fu() {
        block0:
        {
            if (!eu) break block0;
            hy = Class.forName("club.sk1er.patcher.config.PatcherConfig");
            hy.getField("chatPosition").set(null, false);
        }
    }

    public static boolean oo() {
        if (eu) {
            return he.getBoolean(null);
        }
        return false;
    }
}
