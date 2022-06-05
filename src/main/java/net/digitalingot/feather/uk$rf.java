package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.BossBar;
import net.minecraft.client.gui.GuiIngame;

public class uk$rf
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
        this.kw.ay("Feather", (float)n4, 3.0f, ((BossBar.ay)((BossBar) BossBar.this).vz).sa, ((BossBar.ay)((BossBar) BossBar.this).vz).ki);
        this.fg = 19;
    }

    @Override
    public ci te() {
        return ((BossBar.ay)((BossBar) BossBar.this).vz).iO;
    }
}
