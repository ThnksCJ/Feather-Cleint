package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.gui.GuiIngame;

@sv(aw= qc.BOSS_BAR, jf=@bx(vu="Boss Bar", jm="https://assets.feathercdn.net/game/mods/bossbar.svg", mz="", lq={ly.ay.HUD}))
@pq(we={@xd(bp=rf.class)})
public class BossBar
extends HUDMod<ay> {

    @rm(wm=true)
    public static class ay
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(yv= ho.TOP_CENTER, dz=-0.5, ev=1.0)
        public ci iO;
        @au(wd="textColor", vu="Text Color", pr="false/22/119/114/255", yp=@de(vi=1))
        public gp sa;
        @au(wd="textShadow", vu="Text Shadow", yp=@de(vi=2))
        public boolean ki;
    }

    public class rf
    extends kb {
        @Override
        public int df() {
            return 182;
        }

        @Override
        public void ay(qx qx2) {
            if (qx2 == qx.MOD_LAYOUT) {
                this.ky();
            }
        }

        private void ky() {
            int n = this.df();
            int n2 = (int)(0.8 * (double)(n + 1));
            boolean bl = false;
            int n3 = 12;
            fp.ay(0, GuiIngame.field_110324_m);
            this.kw.zz(0, 12, 0, 74, n, 5);
            this.kw.zz(0, 12, 0, 74, n, 5);
            if (n2 > 0) {
                this.kw.zz(0, 12, 0, 79, n2, 5);
            }
            String string = "Feather";
            int n4 = (n - this.kw.on("Feather")) / 2;
            this.kw.ay("Feather", (float)n4, 3.0f, ((ay) BossBar.this.vz).sa, ((ay) BossBar.this.vz).ki);
            this.fg = 19;
        }

        @Override
        public ci te() {
            return ((ay) BossBar.this.vz).iO;
        }
    }
}
