package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class hz
implements bs<Integer> {
    @NotNull
    public Integer ed(@NotNull String string, @NotNull Class<? extends Integer> clazz) {
        return Integer.parseInt(string);
    }

    @NotNull
    public String sd(@NotNull Integer n) {
        return n.toString();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.sd((Integer)object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.ed(string, clazz);
    }
}
