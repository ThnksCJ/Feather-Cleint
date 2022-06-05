package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mixin.core.ed;
import net.digitalingot.feather.mods.HUDMod;

@sv(aw = qc.FPS, jf = @bx(vu = "FPS", jm = "https://assets.feathercdn.net/game/mods/fps.svg", mz = "Display your frames per second", lq = {ly.ay.HUD}))
@pq(we = {@xd(bp = rf.class)})
public class FPS
        extends HUDMod<ay> {

    @rm(wm = true)
    public static class ay
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.TOP_LEFT)
        public fw jQ;
        @au(wd = "reversed", vu = "Reversed", yp = @de(vi = 1))
        public boolean jR;
    }

    public class rf
            extends mo {
        public rf() {
            super("FPS: ", " FPS");
        }

        @Override
        public Object so() {
            return ed.getFPS();
        }

        @Override
        public boolean gf() {
            return ((ay) FPS.this.vz).jR;
        }

        @Override
        public fw bt() {
            return ((ay) FPS.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
