package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;

public class bk
        implements bs<Float> {
    @NotNull
    public Float nn(@NotNull String string, @NotNull Class<? extends Float> clazz) {
        return Float.valueOf(Float.parseFloat(string));
    }

    @NotNull
    public String ay(@NotNull Float f) {
        return f.toString();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ay((Float) object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.nn(string, clazz);
    }
}
