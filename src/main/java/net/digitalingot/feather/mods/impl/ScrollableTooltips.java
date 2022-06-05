package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;

@sv(aw= qc.SCROLLABLE_TOOLTIPS, jf=@bx(vu="Scrollable Tooltips", jm="https://assets.feathercdn.net/game/mods/scrollabletooltips.svg", mz="Makes tooltips scrollable", lq={}))
public class ScrollableTooltips
extends Mod<ay> {
    private static final int dJ = fz.yw(16).fy();
    private boolean dK;
    private int dL = 0;
    private int dM = 0;

    @Override
    public void au() {
        jw.ne.ay((void_, itemStack, n, n2, n3, n4) -> {
            if (!this.gc() || Minecraft.getMinecraft().currentScreen == null) {
                return;
            }
            int n5 = Minecraft.getMinecraft().currentScreen.height;
            if (!this.dK) {
                this.dL = 0;
                this.dM = 0;
            }
            boolean bl = this.dK = n2 < 0;
            if (this.dK) {
                int n6 = dv.aO();
                if (bu.ay(dJ)) {
                    if (n6 < 0) {
                        this.dL += 10;
                    } else if (n6 > 0) {
                        this.dL -= 10;
                    }
                } else if (n6 < 0) {
                    this.dM -= 10;
                } else if (n6 > 0) {
                    this.dM += 10;
                }
                if (this.dM + n2 > 6) {
                    this.dM = -n2 + 6;
                } else if (this.dM + n2 + n4 + 6 < n5) {
                    this.dM = n5 - 6 - n2 - n4;
                }
            }
            if (this.dL != 0 || this.dM != 0) {
                fp.aM();
                fp.rf(this.dL, this.dM, 0.0f);
            }
        });
        jw.eq.ay((void_, itemStack, n, n2, n3, n4) -> {
            if (this.gc() && (this.dL != 0 || this.dM != 0)) {
                fp.aN();
            }
        });
    }

    @rm(wm=true)
    public static class ay
    extends zi {
    }
}
