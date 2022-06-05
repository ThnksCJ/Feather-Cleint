package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.entity.item.EntityTNTPrimed;
import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

@sv(aw = qc.TNT_TIMER, jf = @bx(vu = "TNT Timer", jm = "https://assets.feathercdn.net/game/mods/tnttime.svg", mz = "Adds a timer to your TNT explosions.", lq = {ly.ay.HYPIXEL}))
public class jj
        extends Mod<ay> {
    private static DecimalFormat dQ = new DecimalFormat("0.00");

    public static String ay(EntityTNTPrimed entityTNTPrimed, float f) {
        int n = ck.oS() ? 27 : 0;
        return dQ.format(((float) (entityTNTPrimed.getFuse() - n) - f) / 20.0f);
    }

    @Override
    public void zq() {
        dQ = ((ay) this.vz).dR > 0 ? new DecimalFormat("0." + StringUtils.repeat("0", ((ay) this.vz).dR)) : new DecimalFormat("0");
    }

    public int rf(EntityTNTPrimed entityTNTPrimed) {
        int n;
        int n2 = n = ck.oS() ? 27 : 0;
        if (!((ay) this.vz).dS) {
            int n3 = entityTNTPrimed.getFuse() - n;
            float f = (float) n3 / (80.0f - (float) n);
            return az.sd(1.0f - f, f, 0.0f);
        }
        return ((ay) this.vz).dT.sc() ? vr.nR().nT() : ((ay) this.vz).dT.aq();
    }

    public boolean mt() {
        return ((ay) this.vz).ki;
    }

    public static class ay
            extends zi {
        @de(vi = 0)
        public iv i = new iv("General Options");
        @au(wd = "decimals", vu = "Decimal Points", pr = "2", yp = @de(vi = 1))
        @mj(js = 4)
        public int dR;
        @de(vi = 10)
        public iv cq = new iv("Style Options");
        @au(wd = "staticColor", vu = "Static Color", pr = "false", yp = @de(vi = 11))
        public boolean dS;
        @au(wd = "timeColor", vu = "Time Color", nu = @ra(wd = "staticColor"), yp = @de(vi = 12))
        public gp dT;
        @au(wd = "textShadow", vu = "Text Shadow", pr = "false", yp = @de(vi = 13))
        public boolean ki;
    }
}
