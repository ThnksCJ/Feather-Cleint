package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.awt.*;

@sv(aw = qc.CROSSHAIR, jf = @bx(vu = "Custom Crosshair", jm = "https://assets.feathercdn.net/game/mods/crosshair.svg", mz = "Customize your crosshair", lq = {ly.ay.PVP}))
public class CustomCrosshair
        extends Mod<ay>
        implements be {
    private static final an<General> FEATHER$CORE_PROVIDER = ej.ay(General.class);
    private wl hK = null;

    @Override
    public void initialize() {
        cv.ll.ay((void_, uj2) -> {
            ItemStack itemStack;
            EntityPlayerSP entityPlayerSP;
            int n;
            if (!this.gc() || uj2 != cv.uj.CROSSHAIRS) {
                return wi.PASS;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            if (((General.ay) CustomCrosshair.FEATHER$CORE_PROVIDER.nt().xd()).fK && (n = minecraft.gameSettings.thirdPersonView) != 0) {
                return wi.PASS;
            }
            float f = (float) iz.bA();
            int n2 = iz.aW() / 2;
            int n3 = iz.aX() / 2;
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f, 1.0f / f, 1.0f / f);
            Color color = ((ay) this.vz).as.pg();
            int n4 = ((ay) this.vz).hO;
            if (((ay) this.vz).as.sc()) {
                color = new Color(vr.nR().nT());
            }
            if (!(entityPlayerSP = minecraft.player).isSpectator() && !(itemStack = entityPlayerSP.func_184614_ca()).isEmpty()) {
                int n5 = entityPlayerSP.func_184605_cv();
                if (itemStack.getItem() == Items.BOW) {
                    float f2 = (float) (itemStack.getItem().getMaxItemUseDuration(itemStack) - n5) / 20.0f;
                    if (n5 == 0 || f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    n4 = ((ay) this.vz).hO + (int) ((1.0f - f2) * (((ay) this.vz).hO + 5) * 2.0f);
                }
            }
            this.qb().ay((ay) this.vz, n2, n3, n4, color);
            if (((ay) this.vz).hR && ((ay) this.vz).hN != ay.ay.DEFAULT) {
                this.rl(n2, n3);
            }
            fp.aF();
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPopMatrix();
            return wi.PASS;
        });
    }

    @Override
    public void ms() {
        ItemStack itemStack;
        EntityPlayerSP entityPlayerSP;
        float f = (float) iz.bA();
        GL11.glPushMatrix();
        GL11.glScalef(1.0f / f, 1.0f / f, 1.0f / f);
        Color color = ((ay) this.vz).as.pg();
        int n = ((ay) this.vz).hO;
        if (((ay) this.vz).as.sc()) {
            color = new Color(vr.nR().nT());
        }
        if ((entityPlayerSP = Minecraft.getMinecraft().player) != null && !entityPlayerSP.isSpectator() && !(itemStack = entityPlayerSP.func_184614_ca()).isEmpty()) {
            int n2 = entityPlayerSP.func_184605_cv();
            if (itemStack.getItem() == Items.BOW) {
                float f2 = (float) (itemStack.getItem().getMaxItemUseDuration(itemStack) - n2) / 20.0f;
                if (n2 == 0 || f2 > 1.0f) {
                    f2 = 1.0f;
                }
                n = ((ay) this.vz).hO + (int) ((1.0f - f2) * (((ay) this.vz).hO + 5) * 2.0f);
            }
        }
        this.qb().ay((ay) this.vz, 0, 0, n, color);
        if (((ay) this.vz).hR && ((ay) this.vz).hN != ay.ay.DEFAULT) {
            this.rl(0, 0);
        }
        fp.aF();
        fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }

    @Override
    public int br() {
        return 0;
    }

    @Override
    public int to() {
        return 0;
    }

    @Override
    public void zq() {
        this.hK = null;
    }

    private wl qb() {
        if (this.hK == null) {
            switch (1. hL[((ay) this.vz).hN.ordinal()]){
                case 1: {
                    this.hK = new mk();
                    break;
                }
                case 2: {
                    this.hK = new wo();
                    break;
                }
                case 3: {
                    this.hK = new wn();
                    break;
                }
                case 4: {
                    this.hK = new fg();
                    break;
                }
                case 5: {
                    this.hK = new wh();
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return this.hK;
    }

    private void rl(int n, int n2) {
        int n3 = ((ay) this.vz).hP / 2;
        int n4 = (((ay) this.vz).hP + 1) / 2;
        if (((ay) this.vz).hU) {
            mb.rf((int) (n - n3 - ((ay) this.vz).n), (int) (n2 - n3 - ((ay) this.vz).n), (int) (n + n4 + ((ay) this.vz).n), (int) (n2 + n4 + ((ay) this.vz).n), (Color) ((ay) this.vz).hV);
        }
        Color color = ((ay) this.vz).as.sc() ? new Color(vr.nR().nT(), true) : ((ay) this.vz).hS;
        mb.rf((int) (n - n3), (int) (n2 - n3), (int) (n + n4), (int) (n2 + n4), (Color) color);
    }

    public static class tr$ay
            extends zi {
        @de(vi = 0)
        public iv hM = new iv("Crosshair");
        @au(wd = "type", vu = "Type", pr = "cross", yp = @de(vi = 1))
        public ay hN;
        @au(wd = "size", vu = "Size", pr = "5", yp = @de(vi = 2))
        @mj(js = 50)
        public int size;
        @au(wd = "gap", vu = "Gap", pr = "3", yp = @de(vi = 3))
        @mj(js = 50)
        public int hO;
        @au(wd = "thickness", vu = "Thickness", pr = "1", yp = @de(vi = 4))
        @mj(yu = 1, js = 50)
        public int hP;
        @au(wd = "color", vu = "Color", pr = "false/255/255/255/255", yp = @de(vi = 5))
        public gp as;
        @de(vi = 10)
        public iv hQ = new iv("Dot");
        @au(wd = "dot", vu = "Dot", yp = @de(vi = 11))
        public boolean hR;
        @au(wd = "dotColor", vu = "Dot Color", pr = "255/255/255/255", yp = @de(vi = 12))
        public Color hS;
        @de(vi = 20)
        public iv hT = new iv("Outline");
        @au(wd = "outline", vu = "Outline", pr = "true", yp = @de(vi = 21))
        public boolean hU;
        @au(wd = "outlineThickness", vu = "Thickness", pr = "1", yp = @de(vi = 22))
        @mj(yu = 1, js = 50)
        public int n;
        @au(wd = "outlineColor", vu = "Color", pr = "0/0/0/255", yp = @de(vi = 23))
        public Color hV;

        @Override
        public Boolean ir() {
            return true;
        }

        public enum ay {
            CROSS,
            CIRCLE,
            SQUARE,
            DEFAULT,
            ARROW

        }
    }
}
