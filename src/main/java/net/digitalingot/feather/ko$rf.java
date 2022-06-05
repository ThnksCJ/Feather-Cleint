package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.CPS;

import java.text.DecimalFormat;

public class ko$rf
extends mo {
    private static final String rR = " | ";
    private final DecimalFormat pD = wk.yl("#.#");

    @Override
    public Object so() {
        return this.pD.format(CPS.this.pC.wk()) + (((CPS.ay)((CPS) CPS.this).vz).tI ? rR + this.pD.format(CPS.this.pC.si()) : "") + (((CPS.ay)((CPS) CPS.this).vz).tJ ? " CPS" : "");
    }

    @Override
    public boolean gf() {
        return false;
    }

    @Override
    public void zq() {
        wk.ay(this.pD, ((CPS.ay)((CPS) CPS.this).vz).rJ);
        super.zq();
    }

    @Override
    public fw bt() {
        return ((CPS.ay)((CPS) CPS.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
