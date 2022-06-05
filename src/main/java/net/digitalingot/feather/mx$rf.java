package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.ItemInfo;

import java.awt.*;

public class mx$rf
        extends kb {
    private String nO;
    private long nP;
    private float eg;

    @Override
    public void ay(qx qx2) {
        this.ig(qx2 == qx.MOD_LAYOUT);
    }

    @Override
    public void ms() {
        this.kw.ay(ItemInfo.nC, 0.0f, 0.0f, ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nH, true);
    }

    @Override
    public int br() {
        return 0;
    }

    @Override
    public int to() {
        return 0;
    }

    private void ig(boolean bl) {
        Color color;
        Object object;
        float f = this.eg;
        String string = null;
        String string2 = null;
        if (((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nJ) {
            string = bl ? ItemInfo.nB : ItemInfo.this.pk();
        }
        if (((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nG) {
            if (bl) {
                string2 = ItemInfo.nC;
            } else {
                int n = ItemInfo.this.rr();
                if (n != -1) {
                    string2 = String.valueOf(n);
                }
            }
        }
        float f2 = 1.0f;
        if (!bl && ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nM) {
            object = string + "\n" + string2;
            long l = 0L;
            if (object.equals(this.nO)) {
                l = System.currentTimeMillis() - this.nP - (long) ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nE * 100L;
            } else {
                this.nO = object;
                this.nP = System.currentTimeMillis();
            }
            if (l >= (long) ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nN * 100L) {
                return;
            }
            if (l > 0L) {
                f2 = 1.0f - (float) l / 100.0f / (float) ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nN;
            }
        }
        if (string != null) {
            object = ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nK.pg();
            color = new Color(((Color) object).getRed(), ((Color) object).getGreen(), ((Color) object).getBlue(), Math.max(5, (int) ((float) ((Color) object).getAlpha() * f2)));
            this.kw.ay(string, (float) (this.df() - this.kw.on(string)) / 2.0f, f, color.getRGB(), true, ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nK.sc());
            f += 16.0f;
        }
        if (string2 != null) {
            object = ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nH.pg();
            color = new Color(((Color) object).getRed(), ((Color) object).getGreen(), ((Color) object).getBlue(), Math.max(5, (int) ((float) ((Color) object).getAlpha() * f2)));
            this.kw.ay(string2, (float) (this.df() - this.kw.on(string2)) / 2.0f, f, color.getRGB(), true, ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nH.sc());
        }
    }

    @Override
    public int hu() {
        if (((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nG) {
            return ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nJ ? 30 : 14;
        }
        return ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nJ ? 14 : 0;
    }

    @Override
    public int df() {
        return ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).nJ ? 120 : 30;
    }

    @Override
    public void zq() {
        float f = 8.0f;
        this.eg = ((float) this.hu() - f) / 2.0f;
    }

    @Override
    public ci te() {
        return ((ItemInfo.ay) ((ItemInfo) ItemInfo.this).vz).jQ;
    }
}
