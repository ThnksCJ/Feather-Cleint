package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class nl
        extends Exception {
    public nl(@NotNull String string) {
        super(string);
    }

    public nl(@NotNull Throwable throwable) {
        super(throwable);
    }
}
