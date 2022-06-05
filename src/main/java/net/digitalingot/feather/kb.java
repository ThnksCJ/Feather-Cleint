package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.be;
import net.digitalingot.feather.mods.HUDMod;
import org.jetbrains.annotations.NotNull;

public abstract class kb
        implements be {
    @NotNull
    protected final ya kw = new ya(this);
    protected HUDMod<?> gz;
    protected int wl;
    protected int fg;

    public void zq() {
    }

    public double hh() {
        return this.te().getX(this.ch());
    }

    public double ix() {
        return this.te().getY(this.iq());
    }

    public int df() {
        return this.wl;
    }

    public int hu() {
        return this.fg;
    }

    public void rd(int n) {
        this.fg = n;
    }

    public int bs() {
        return this.df();
    }

    public int ku() {
        return this.hu();
    }

    @Override
    public int br() {
        return this.bs();
    }

    @Override
    public int to() {
        return this.ku();
    }

    public final double ch() {
        return (double) (bd.INSTANCE.getRenderLayer() == qx.HUD_OVERLAY ? this.df() : this.bs()) * this.te().yx();
    }

    public final double iq() {
        return (double) (bd.INSTANCE.getRenderLayer() == qx.HUD_OVERLAY ? this.hu() : this.ku()) * this.te().yx();
    }

    public void ay(qx qx2) {
    }

    @Override
    public void ms() {
        this.ay(qx.MOD_LAYOUT);
    }

    public boolean tv() {
        return true;
    }

    public abstract ci te();

    public ya pl() {
        return this.kw;
    }

    public void uj(HUDMod<?> ft2) {
        this.gz = ft2;
    }

    public HUDMod<?> bk() {
        return this.gz;
    }
}
