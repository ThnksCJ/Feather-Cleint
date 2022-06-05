package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;

@sv(aw = qc.PERSPECTIVE, jf = @bx(vu = "Perspective", jm = "https://assets.feathercdn.net/game/mods/perspective.svg", mz = "Freelook", lq = {}))
public class Perspective
        extends Mod<ay> {
    private Minecraft minecraft;
    private float cY = 0.0f;
    private float cZ = 0.0f;
    private float dm;
    private float dA;
    private float dB;
    private float dC;
    private boolean dD = false;
    private int dE = 0;

    @Override
    public void initialize() {
        this.minecraft = Minecraft.getMinecraft();
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            if (!this.gc()) {
                return;
            }
            this.dD = false;
        });
        qo.ay(() -> ((ay) this.vz).dF, () -> {
            if (!this.gc()) {
                return;
            }
            GameSettings gameSettings = this.minecraft.gameSettings;
            this.dD = !this.dD;
            EntityPlayerSP entityPlayerSP = this.minecraft.player;
            this.cZ = entityPlayerSP.field_70177_z;
            this.cY = entityPlayerSP.field_70125_A;
            if (this.dD) {
                this.dE = gameSettings.thirdPersonView;
                gameSettings.thirdPersonView = 1;
            } else {
                gameSettings.thirdPersonView = this.dE;
            }
            this.ey();
        }, () -> {
            if (!((ay) this.vz).dI || !this.dD) {
                return;
            }
            GameSettings gameSettings = this.minecraft.gameSettings;
            this.dD = false;
            gameSettings.thirdPersonView = this.dE;
            this.ey();
        });
        lv.vs.ay((n, n2, n3, n4) -> this.zs(n, n2));
        lv.zl.ay((n, n2, n3) -> this.zs(n + 100001, -1));
        hr.bo.ay((f, f2) -> {
            if (!this.gc()) {
                return wi.PASS;
            }
            if (!this.dD) {
                return wi.PASS;
            }
            this.cZ += f * (((ay) this.vz).dH ? -0.15f : 0.15f);
            this.cY += f2 * (((ay) this.vz).dG ? 0.15f : -0.15f);
            if (this.cY < -90.0f) {
                this.cY = -90.0f;
            }
            if (this.cY > 90.0f) {
                this.cY = 90.0f;
            }
            return wi.FAIL;
        });
        dy.ll.ay(entity -> {
            if (!this.gc()) {
                return;
            }
            if (!this.dD) {
                return;
            }
            this.dC = entity.rotationYaw;
            this.dm = entity.rotationPitch;
            this.dB = entity.prevRotationYaw;
            this.dA = entity.prevRotationPitch;
            dd.rf(entity, this.cZ);
            dd.ay(entity, this.cY);
            entity.prevRotationYaw = this.cZ;
            entity.prevRotationPitch = this.cY;
        });
        dy.ds.ay(entity -> {
            boolean bl;
            if (!this.gc()) {
                return;
            }
            if (!this.dD) {
                return;
            }
            dd.rf(entity, this.dC);
            dd.ay(entity, this.dm);
            entity.prevRotationYaw = this.dB;
            entity.prevRotationPitch = this.dA;
            EntityPlayerSP entityPlayerSP = this.minecraft.player;
            boolean bl2 = entityPlayerSP.field_191988_bg == 0.0f;
            boolean bl3 = bl = entityPlayerSP.field_70702_br == 0.0f;
            if (bl2 && bl && !entityPlayerSP.movementInput.jump) {
                entity.prevPosY += 1.0E-6;
            }
        });
    }

    private void ey() {
        GameSettings gameSettings = this.minecraft.gameSettings;
        this.minecraft.renderGlobal.setDisplayListEntitiesDirty();
    }

    private void zs(int n, int n2) {
        if (!this.gc()) {
            return;
        }
        if (n2 != -1) {
            boolean bl;
            GameSettings gameSettings = this.minecraft.gameSettings;
            boolean bl2 = bl = gameSettings.keyBindTogglePerspective.getKeyCode() == n;
            if (bl) {
                this.dD = false;
            }
        }
    }

    public static class ay
            extends zi {
        @au(wd = "keyPerspective", vu = "Perspective", pr = "75", yp = @de(vi = 0))
        public km dF;
        @au(wd = "invertPitch", vu = "Invert Pitch (Up and Down)", yp = @de(vi = 1))
        public boolean dG;
        @au(wd = "invertYaw", vu = "Invert Yaw (Right and Left)", yp = @de(vi = 2))
        public boolean dH;
        @au(wd = "returnOnRelease", vu = "Return on Release", pr = "true", yp = @de(vi = 3))
        public boolean dI;
    }
}
