package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mixin.core.sd;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;

import java.util.Locale;

@sv(aw = qc.MOTION_BLUR, jf = @bx(vu = "Motion Blur", jm = "https://assets.feathercdn.net/game/mods/motionblur.svg", mz = "", lq = {ly.ay.PVP}))
public class MotionBlur
        extends Mod<ay>
        implements xo {
    private static final String aX = "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}";
    private static final ResourceLocation aY = bn.vq("motionblur");
    private Object aZ = null;

    @Override
    public void initialize() {
        sw.ti.ay(uj2 -> {
            if (uj2 != sw.uj.START) {
                return;
            }
            if (!this.gc()) {
                return;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            if (minecraft.world == null || minecraft.currentScreen != null) {
                return;
            }
            this.kh();
        });
        hl.bo.ay(() -> {
            if (this.gc()) {
                this.aZ = null;
            }
        });
    }

    @Override
    public void au() {
        rf.ed().ay(aY, this);
        this.aZ = null;
    }

    @Override
    public void jl() {
        this.tt();
        rf.ed().uj(aY);
    }

    @Override
    public void zq() {
        rf.nn().ay(() -> {
            if (this.gc()) {
                this.aZ = null;
            }
        }, 1L);
    }

    private void kh() {
        EntityRenderer entityRenderer = Minecraft.getMinecraft().entityRenderer;
        sd sd2 = (sd) entityRenderer;
        if (this.aZ == null || sd2.feather$getEffect() != this.aZ) {
            sd2.feather$loadShader(aY);
            this.aZ = sd2.feather$getEffect();
        }
    }

    private void tt() {
        EntityRenderer entityRenderer = Minecraft.getMinecraft().entityRenderer;
        sd sd2 = (sd) entityRenderer;
        if (this.aZ != null) {
            if (sd2.feather$getEffect() == this.aZ) {
                entityRenderer.stopUseShader();
            }
            this.aZ = null;
        }
    }

    @Override
    public qr wp() {
        return new ts(this.qu());
    }

    private String qu() {
        double d = 0.6 + ((ay) this.vz).bA / 251.0;
        return String.format(Locale.ROOT, aX, d, d, d);
    }

    public static class ay
            extends zi {
        @au(wd = "blurAmount", vu = "Blur Amount", pr = "50", yp = @de(vi = 0))
        @in(hd = 0.0, lf = 100.0)
        public double bA;
    }
}
