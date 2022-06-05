package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;

import java.awt.*;

@sv(aw= qc.WEATHER_CHANGER, jf=@bx(vu="Weather Changer", jm="https://assets.feathercdn.net/game/mods/weatherchanger.svg", mz="Change the weather locally", lq={}))
public class dz
extends Mod<ay> {
    public boolean ws() {
        return ((ay)this.xd()).dU == ay.ay.DEFAULT;
    }

    public boolean lo() {
        return ((ay)this.xd()).dU == ay.ay.RAIN;
    }

    public boolean oy() {
        return ((ay)this.xd()).dU == ay.ay.THUNDER;
    }

    public boolean eo() {
        return this.lo() || this.oy();
    }

    public static class dz$ay
    extends zi {
        @au(wd="weatherMode", vu="Weather Mode", pr="default", yp=@de(vi=0))
        public ay dU;
        @au(wd="fallingColor", vu="Rain / Snow Color", pr="255/255/255", yp=@de(vi=1))
        public Color dV;

        public static enum ay {
            DEFAULT,
            CLEAR,
            RAIN,
            THUNDER

        }
    }
}
