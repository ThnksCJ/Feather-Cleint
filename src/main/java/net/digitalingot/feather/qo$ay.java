package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

final class qo$ay {
    @NotNull
    private final Supplier<km> oi;
    @Nullable
    private final qo.rf zv;
    @Nullable
    private final qo.rf ue;
    private boolean dj;

    private qo$ay(@NotNull Supplier<km> supplier, @Nullable qo.rf rf2, @Nullable qo.rf rf3) {
        this.oi = supplier;
        this.zv = rf2;
        this.ue = rf3;
    }

    @NotNull
    public Supplier<km> jg() {
        return this.oi;
    }

    @Nullable
    public qo.rf fc() {
        return this.zv;
    }

    @Nullable
    public qo.rf po() {
        return this.ue;
    }

    public boolean isPressed() {
        return this.dj;
    }

    public void kl(boolean bl) {
        this.dj = bl;
    }
}
