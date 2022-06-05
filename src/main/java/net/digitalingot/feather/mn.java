package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

public abstract class mn<T extends zi> {
    @NotNull
    protected final Mod<T> vM;
    protected boolean vN;

    protected mn(@NotNull Mod<T> ux2) {
        this.vM = ux2;
    }

    public abstract boolean jn();

    public void initialize() {
    }

    public void zq() {
    }

    public void au() {
        this.vN = true;
    }

    public void jl() {
        this.vN = false;
    }

    public boolean gc() {
        return this.vN && this.vM.gc() && this.jn() && ck.oS();
    }

    public boolean pw() {
        return this.vN;
    }
}
