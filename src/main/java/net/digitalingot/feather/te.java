package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;

public class te
        implements bs<Double> {
    @NotNull
    public Double bu(@NotNull String string, @NotNull Class<? extends Double> clazz) {
        return Double.parseDouble(string);
    }

    @NotNull
    public String ay(@NotNull Double d) {
        return d.toString();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ay((Double) object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.bu(string, clazz);
    }
}
