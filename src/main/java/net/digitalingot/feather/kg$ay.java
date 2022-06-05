package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.Scoreboard;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.ScoreObjective;
import org.lwjgl.opengl.GL11;

public class kg$ay
extends kb {
    public void ul() {
        if (!Scoreboard.this.gc() || Minecraft.getMinecraft().currentScreen instanceof ov) {
            return;
        }
        float f = (float)this.te().yx();
        GL11.glPushMatrix();
        GL11.glTranslated(this.hh(), this.ix(), 0.0);
        GL11.glScalef(f, f, 1.0f);
        this.vo();
        GL11.glPopMatrix();
    }

    @Override
    public void ay(qx qx2) {
        if (qx2 == qx.MOD_LAYOUT) {
            this.ay(Scoreboard.this.lk());
        }
    }

    @Override
    public void ms() {
        this.ay(Scoreboard.this.lk());
    }

    @Override
    public int df() {
        return Scoreboard.this.lk().wl;
    }

    @Override
    public int hu() {
        return Scoreboard.this.lk().fg;
    }

    private void vo() {
        if (Scoreboard.this.rU) {
            ScoreObjective scoreObjective = Scoreboard.wf();
            Scoreboard.this.rT = scoreObjective != null ? Scoreboard.this.ay(Scoreboard.wf()) : null;
            Scoreboard.this.rU = false;
        }
        if (Scoreboard.this.rT != null) {
            this.ay(Scoreboard.this.lk());
        }
    }

    private void ay(Scoreboard.rf rf2) {
        int n = ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).sa.aq();
        this.kw.rf(0, 0, rf2.wl, 9, ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).sC.getRGB());
        this.kw.rf(0, 9, rf2.wl, rf2.fg, ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).kv.getRGB());
        for (Scoreboard.rf.ay ay2 : rf2.rY) {
            this.kw.ay(ay2.qv, 2.0f, ay2.eg, n, ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).ki);
            if (!((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).sB) continue;
            this.kw.ay(ay2.rZ, ay2.se, ay2.eg, n, ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).ki);
        }
        this.kw.ay(rf2.rW, rf2.rX, 1.0f, n, ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).ki);
    }

    @Override
    public ci te() {
        return ((Scoreboard.uj)((Scoreboard) Scoreboard.this).vz).iO;
    }
}
