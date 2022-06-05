package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class iv {
    @NotNull
    private final String name;

    public iv(@NotNull String string) {
        this.name = string;
    }

    @NotNull
    public String getName() {
        return this.name;
    }
}
