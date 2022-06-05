package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Ping;

import java.awt.*;

public class aq$ay
        extends mo {
    @Override
    public Object so() {
        return Ping.this.zd() + " ms";
    }

    @Override
    public String ui() {
        return "888 ms";
    }

    @Override
    public boolean tj() {
        return Ping.this.zd() > 0;
    }

    @Override
    public boolean gf() {
        return false;
    }

    @Override
    protected void ga() {
        this.kw.ay(this.qv, this.rz, this.eg, this.rw(), this.bt().ki, this.bt().sa.sc());
    }

    private int rw() {
        return ((Ping.rf) ((Ping) Ping.this).vz).qJ ? this.xh(Ping.this.zd()) : this.bt().sa.aq();
    }

    public int xh(int n) {
        return Color.getHSBColor(Math.max((125.0f - (float) n * 10.0f / (float) ((Ping.rf) ((Ping) Ping.this).vz).qH) / 360.0f, 0.0f), 1.0f, 1.0f).getRGB();
    }

    @Override
    public fw bt() {
        return ((Ping.rf) ((Ping) Ping.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
