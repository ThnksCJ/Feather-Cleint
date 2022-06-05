package net.digitalingot.feather;

import net.digitalingot.feather.enums.ic;
import net.digitalingot.feather.enums.qx;

public abstract class mo
        extends kb {
    private final String np;
    private final String dx;
    protected float rz;
    protected float eg;
    protected int qh;
    protected int cx;
    protected String qv;
    protected Object uu;
    private qx dp;

    public mo() {
        this(null, null);
    }

    public mo(String string, String string2) {
        this.np = string;
        this.dx = string2;
    }

    public abstract Object so();

    public String ui() {
        return "";
    }

    public abstract boolean gf();

    public boolean tj() {
        return true;
    }

    @Override
    public int df() {
        this.wl = this.bt().cu == ic.BACKGROUND ? this.bt().jd : this.qh;
        return this.wl;
    }

    @Override
    public int hu() {
        this.fg = this.bt().cu == ic.BACKGROUND ? this.bt().nd : this.cx;
        return this.fg;
    }

    @Override
    public void zq() {
        this.ay(qx.HUD_OVERLAY, true);
        this.st();
    }

    @Override
    public void ay(qx qx2) {
        this.ay(qx2, qx2 == qx.MOD_LAYOUT, true);
    }

    @Override
    public void ms() {
        this.ay(qx.MOD_LAYOUT, true, true);
    }

    protected void ay(qx qx2, boolean bl, boolean bl2) {
        if (bl || this.tj()) {
            if (bl2) {
                this.ay(qx2, false);
            }
            if (this.qv == null || this.qv.isEmpty()) {
                return;
            }
            if (this.bt().cu == ic.BACKGROUND) {
                this.kw.rf(0, 0, this.wl, this.fg, this.bt().kv.getRGB());
                if (this.bt().pi) {
                    int n = this.bt().hi.getRGB();
                    float f = (float) this.bt().xt / 20.0f;
                    this.kw.ay(0, 0, this.wl, this.fg, n, f);
                }
            }
            this.ga();
        }
    }

    protected void ga() {
        this.kw.ay(this.qv, this.rz, this.eg, this.bt().sa, this.bt().ki);
    }

    private void xa() {
        this.qh = fp.mq(this.qv);
        this.cx = (int) fp.xs(this.bt().ki);
    }

    protected void ay(qx qx2, boolean bl) {
        this.ay(qx2, this.so(), bl);
    }

    protected void ay(qx qx2, Object object, boolean bl) {
        if (!bl && object == this.uu && this.dp == qx2) {
            return;
        }
        this.uu = object;
        this.dp = qx2;
        switch (1.ef[qx2.ordinal()]) {
            case 1: {
                this.zz(object);
                break;
            }
            case 2: {
                this.sd(object);
            }
        }
        this.xa();
        this.st();
    }

    private void st() {
        if (this.bt().cu == ic.BACKGROUND) {
            this.rz = (float) (this.df() - this.qh) / 2.0f;
            this.eg = (float) (this.hu() - this.cx) / 2.0f;
        } else {
            this.rz = 0.0f;
            this.eg = 0.0f;
        }
    }

    private void zz(Object object) {
        String string = String.valueOf(object);
        int n = string.length();
        if (n == 0) {
            this.qv = "";
            return;
        }
        boolean bl = this.gf();
        boolean bl2 = this.np != null && !this.np.isEmpty() && bl;
        boolean bl3 = this.dx != null && !this.dx.isEmpty() && !bl;
        boolean bl4 = this.bt().cu == ic.BRACKETS;
        StringBuilder stringBuilder = new StringBuilder((bl4 ? 2 : 0) + (bl2 ? this.np.length() : (bl3 ? this.dx.length() : 0)) + n);
        if (bl4) {
            stringBuilder.append('[');
        }
        if (bl2) {
            stringBuilder.append(this.np);
        }
        stringBuilder.append(string);
        if (bl3) {
            stringBuilder.append(this.dx);
        }
        if (bl4) {
            stringBuilder.append(']');
        }
        this.qv = stringBuilder.toString();
    }

    private void sd(Object object) {
        String string = this.ui();
        if (string.isEmpty()) {
            this.zz(object);
        } else {
            this.qv = this.ui();
        }
    }

    public abstract fw bt();

    @Override
    public ci te() {
        return this.bt();
    }
}
