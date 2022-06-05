package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.si;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

@sv(aw= qc.ZOOM, jf=@bx(vu="Zoom", jm="https://assets.feathercdn.net/game/mods/zoom.svg", mz="Zoom in and out of objects", lq={}))
public class Zoom
extends Mod<ay> {
    private boolean dW;
    private float dX;
    private float dY;
    private double dZ;
    private double eA;

    @Override
    public void initialize() {
        qo.ay(() -> ((ay)this.vz).eB, this::ht, this::qm);
        sw.ti.ay(uj2 -> {
            if (!this.gc()) {
                return;
            }
            if (this.dW) {
                this.hb();
                this.dX += 1.0f;
            }
        });
        sw.sq.ay((uj2, f) -> {
            if (!this.gc()) {
                return;
            }
            if (this.dW) {
                Minecraft.getMinecraft().gameSettings.fovSetting = this.rf(f);
            }
        });
    }

    private void ht() {
        this.dW = true;
        this.dX = 0.0f;
        this.dY = 0.0f;
        GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
        this.dZ = gameSettings.fovSetting;
        this.eA = gameSettings.mouseSensitivity;
        gameSettings.smoothCamera = ((ay)this.vz).eF;
    }

    private void qm() {
        this.dW = false;
        GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
        gameSettings.fovSetting = (float)this.dZ;
        gameSettings.mouseSensitivity = (float)this.eA;
        gameSettings.smoothCamera = false;
    }

    private void hb() {
        if (((ay)this.vz).eC) {
            int n = dv.aO();
            if (n > 0) {
                this.dY -= this.dY > 0.0f ? 5.0f : 2.0f;
            } else if (n < 0) {
                this.dY += this.dY < 0.0f ? 2.0f : 5.0f;
            }
        }
    }

    private float rf(float f) {
        float f2 = 100.0f - (float)((ay)this.vz).eG;
        if (((ay)this.vz).eD) {
            if (Math.abs(this.dY) > 0.0f) {
                this.dX = 10.0f;
            }
            if (this.dX >= 10.0f) {
                return this.uj(f2);
            }
            float f3 = (this.dX + f) / 10.0f;
            float f4 = Math.min(1.0f, ((ay)this.vz).eE.calculate(f3));
            float f5 = (float)Math.min(this.dZ, (float)(this.dZ - (double)f4 * (this.dZ - (double)f2)));
            return this.uj(f5);
        }
        if (((ay)this.vz).eF) {
            return this.uj(f2);
        }
        Minecraft.getMinecraft().gameSettings.mouseSensitivity = (float)(this.eA * ((ay)this.vz).eH / 100.0);
        return this.zz(f2);
    }

    private float uj(float f) {
        f = this.zz(f);
        this.sd(f);
        return f;
    }

    private float zz(float f) {
        float f2 = (float)Math.max(Math.min(f + this.dY, this.dZ), 3.0);
        this.dY = f2 - f;
        return f2;
    }

    private void sd(float f) {
        double d = (double)f / this.dZ;
        double d2 = ((ay)this.vz).eF ? Math.min(4.0 * d, 1.0) : d;
        Minecraft.getMinecraft().gameSettings.mouseSensitivity = (float)(this.eA * d2);
    }

    public boolean gq() {
        return this.dW;
    }

    public static final class ay
    extends zi {
        @au(wd="keyZoom", vu="Zoom", pr="0", yp=@de(vi=0))
        public km eB;
        @au(wd="scrollZoom", vu="Scroll Zoom", pr="true", yp=@de(vi=1))
        public boolean eC;
        @au(wd="smoothZoom", vu="Smooth Zoom", pr="false", yp=@de(vi=2))
        public boolean eD;
        @au(wd="smoothZoomEasing", vu="Smooth Zoom Zoom", pr="outQuint", yp=@de(vi=3))
        public si eE;
        @au(wd="smoothMovement", vu="Smooth Movement", pr="false", yp=@de(vi=4))
        public boolean eF;
        @au(wd="startZoomLevel", vu="Start Zoom Level", pr="76.5", yp=@de(vi=5))
        @in(hd=20.0, lf=95.0)
        public double eG;
        @au(wd="staticMovementSensitivity", vu="Static Movement Sensitivity", pr="100", yp=@de(vi=6))
        @in(hd=0.0, lf=100.0)
        public double eH;
    }
}
