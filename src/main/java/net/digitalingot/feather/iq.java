package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class iq
implements bs<Boolean> {
    @NotNull
    public Boolean uj(@NotNull String string, @NotNull Class<? extends Boolean> clazz) {
        if (string.equalsIgnoreCase("true")) {
            return true;
        }
        if (string.equalsIgnoreCase("false")) {
            return false;
        }
        throw new lu("Input was neither true nor false.");
    }

    @NotNull
    public String zz(@NotNull Boolean bl) {
        return bl.toString();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.zz((Boolean)object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.uj(string, clazz);
    }
}
