package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Map;

public class to {
    private static final Map<Class<?>, bs<?>> sj = ImmutableMap.builder().put(Boolean.class, new iq()).put(Enum.class, new pl()).put(Double.class, new te()).put(Float.class, new bk()).put(Integer.class, new hz()).put(String.class, new xv()).put(Color.class, new tv()).put(gp.class, new ms()).put(km.class, new yx()).build();

    @Nullable
    static <T> bs<T> zz(@NotNull Class<T> clazz) {
        for (Map.Entry<Class<?>, bs<?>> entry : sj.entrySet()) {
            Class<T> clazz2 = entry.getKey();
            bs<?> bs2 = entry.getValue();
            if (!clazz2.isAssignableFrom(clazz)) continue;
            return bs2;
        }
        return null;
    }
}
