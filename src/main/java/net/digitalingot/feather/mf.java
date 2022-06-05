package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;

import java.awt.*;
import java.nio.FloatBuffer;

@sv(aw= qc.DAMAGE_INDICATOR, jf=@bx(vu="Damage Indicator", jm="https://assets.feathercdn.net/game/mods/damageindicator.svg", mz="Change hit color", lq={}))
public class mf
extends Mod<ay> {
    @Override
    public void ay(FloatBuffer floatBuffer) {
        gp gp2 = ((ay)this.vz).R;
        Color color = gp2.pg();
        if (gp2.sc()) {
            Color color2 = new Color(vr.nR().nT());
            floatBuffer.put((float)color2.getRed() / 255.0f);
            floatBuffer.put((float)color2.getGreen() / 255.0f);
            floatBuffer.put((float)color2.getBlue() / 255.0f);
        } else {
            floatBuffer.put((float)color.getRed() / 255.0f);
            floatBuffer.put((float)color.getGreen() / 255.0f);
            floatBuffer.put((float)color.getBlue() / 255.0f);
        }
        floatBuffer.put((float)color.getAlpha() / 255.0f);
    }

    public static class ay
    extends zi {
        @de(vi=0)
        public iv Q = new iv("Damage Color");
        @au(wd="damageColor", vu="Color", pr="false/160/0/0/76", yp=@de(vi=1))
        public gp R;
    }
}
