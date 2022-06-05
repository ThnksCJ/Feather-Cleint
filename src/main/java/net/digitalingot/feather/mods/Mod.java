package net.digitalingot.feather.mods;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.sv;
import net.digitalingot.feather.zi;
import org.jetbrains.annotations.NotNull;

public abstract class Mod<C extends zi> {
    @NotNull
    protected C vz;
    @NotNull
    private sv ge;
    private boolean da;
    private boolean loaded;

    public void initialize() {
    }

    public void au() {
    }

    public void jl() {
    }

    public void zq() {
    }

    public void ca() {
    }

    @NotNull
    public C xd() {
        return this.vz;
    }

    public void ay(@NotNull C c) {
        this.vz = c;
    }

    @NotNull
    public sv cs() {
        return this.ge;
    }

    public void ay(@NotNull sv sv2) {
        this.ge = sv2;
    }

    public boolean gc() {
        return this.loaded;
    }

    public void nn(boolean bl) {
        this.loaded = bl;
    }

    public boolean ig() {
        return this.da;
    }

    public void ed(boolean bl) {
        this.da = bl;
    }

    protected abstract void ay(GameProfile gameProfile);
}
