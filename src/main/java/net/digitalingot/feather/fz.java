package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import org.jetbrains.annotations.NotNull;

public class fz {
    @NotNull
    private static final ImmutableMap<Integer, vf> fb;
    @NotNull
    private static final ImmutableMap<Integer, vf> mt;

    @NotNull
    public static vf oh(int n) {
        vf vf2 = fb.get(n);
        if (vf2 != null) {
            return vf2;
        }
        return n >= 100000 ? lw.ey : lw.gm;
    }

    @NotNull
    public static vf yw(int n) {
        vf vf2 = mt.get(n);
        if (vf2 != null) {
            return vf2;
        }
        return n >= 100000 ? lw.ey : lw.gm;
    }

    static {
        ImmutableMap.Builder<Integer, vf> builder = ImmutableMap.builder();
        ImmutableMap.Builder<Integer, vf> builder2 = ImmutableMap.builder();
        for (vf vf2 : lw.tx) {
            builder.put(vf2.fy(), vf2);
            builder2.put(vf2.oj(), vf2);
        }
        fb = builder.build();
        mt = builder2.build();
    }
}
