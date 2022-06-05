package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class yx
        implements bs<km> {
    @NotNull
    private final hz la = new hz();

    @NotNull
    public km zs(@NotNull String string, @NotNull Class<? extends km> clazz) {
        if (string.equals("0")) {
            return new km(new int[0]);
        }
        String[] stringArray = string.split(",");
        int[] nArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            nArray[i] = fz.yw(this.la.ed(stringArray[i], Integer.class)).fy();
        }
        return new km(nArray);
    }

    @NotNull
    public String ay(@NotNull km km2) {
        if (km2.zy().length == 0) {
            return "0";
        }
        StringJoiner stringJoiner = new StringJoiner(",");
        for (int n : km2.zy()) {
            stringJoiner.add(String.valueOf(fz.oh(n).oj()));
        }
        return stringJoiner.toString();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ay((km) object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.zs(string, clazz);
    }
}
