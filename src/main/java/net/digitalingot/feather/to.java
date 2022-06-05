package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Map;

public class to {
    private static final Map<Class<?>, bs<?>> sj = ImmutableMap.builder().put(Boolean.class, new iq()).put(Enum.class, (Object)new pl()).put(Double.class, (Object)new te()).put(Float.class, (Object)new bk()).put(Integer.class, (Object)new hz()).put(String.class, (Object)new xv()).put(Color.class, (Object)new tv()).put(gp.class, (Object)new ms()).put(km.class, (Object)new yx()).build();

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
