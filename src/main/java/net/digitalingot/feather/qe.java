package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public class qe {
    @NotNull
    private final UUID hj;
    @NotNull
    private final List<String> Cu;

    public qe(@NotNull UUID uUID, @NotNull List<String> list) {
        this.hj = uUID;
        this.Cu = list;
    }

    @NotNull
    public UUID zx() {
        return this.hj;
    }

    @NotNull
    public List<String> bN() {
        return this.Cu;
    }
}
