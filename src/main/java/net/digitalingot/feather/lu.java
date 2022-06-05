package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class lu
        extends RuntimeException {
    public lu(@NotNull String string) {
        super(string);
    }

    public lu(@NotNull String string, @NotNull Throwable throwable) {
        super(string, throwable);
    }

    public lu(@NotNull Throwable throwable) {
        super(throwable);
    }
}
