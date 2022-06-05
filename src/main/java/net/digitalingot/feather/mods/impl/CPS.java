package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;

import java.text.DecimalFormat;

@sv(aw = qc.CPS, jf = @bx(vu = "CPS", jm = "https://assets.feathercdn.net/game/mods/cps.svg", mz = "", lq = {ly.ay.PVP, ly.ay.HUD}))
@pq(we = {@xd(bp = rf.class)})
public class CPS
        extends HUDMod<ay> {
    private final yt pC = new yt(this);

    public static class ay
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.TOP_LEFT, ev = 41.0)
        public fw jQ;
        @de(vi = 10)
        public iv oZ = new iv("CPS");
        @au(wd = "digits", vu = "Digits", yp = @de(vi = 11))
        @mj(js = 2)
        public int rJ;
        @au(wd = "right", vu = "Right", pr = "true", yp = @de(vi = 12))
        public boolean tI;
        @au(wd = "showCPSText", vu = "Show CPS Text", pr = "false", yp = @de(vi = 13))
        public boolean tJ;
        @au(wd = "lineColor", vu = "Line Color", pr = "false/0/0/0", yp = @de(vi = 14))
        public gp tK;
    }

    public class rf
            extends mo {
        private static final String rR = " | ";
        private final DecimalFormat pD = wk.yl("#.#");

        @Override
        public Object so() {
            return this.pD.format(CPS.this.pC.wk()) + (((ay) CPS.this.vz).tI ? rR + this.pD.format(CPS.this.pC.si()) : "") + (((ay) CPS.this.vz).tJ ? " CPS" : "");
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        public void zq() {
            wk.ay(this.pD, ((ay) CPS.this.vz).rJ);
            super.zq();
        }

        @Override
        public fw bt() {
            return ((ay) CPS.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
