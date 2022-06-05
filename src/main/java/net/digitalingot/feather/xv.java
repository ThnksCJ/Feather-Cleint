package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class xv
implements bs<String> {
    @NotNull
    public String nl(@NotNull String string, @NotNull Class<? extends String> clazz) {
        return string;
    }

    @NotNull
    public String ig(@NotNull String string) {
        return string;
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ig((String)object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.nl(string, clazz);
    }
}
