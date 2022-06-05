package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.un$ay$ay;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

@sv(aw= qc.SNAPLOOK, jf=@bx(vu="Snaplook", jm="https://assets.feathercdn.net/game/mods/snaplook.svg", mz="Snap to a particular perspective", lq={}))
public class Snaplook
extends Mod<ay> {
    private boolean dN;
    private int dE = 0;

    @Override
    public void initialize() {
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            if (!this.gc()) {
                return;
            }
            this.dN = false;
        });
        qo.ay(() -> ((ay)this.vz).dO, () -> {
            if (!this.gc()) {
                return;
            }
            this.dN = true;
            Minecraft minecraft = Minecraft.getMinecraft();
            GameSettings gameSettings = minecraft.gameSettings;
            this.dE = gameSettings.thirdPersonView;
            gameSettings.thirdPersonView = ((ay)this.vz).dP == un$ay$ay.THIRD ? 1 : 2;
            this.ey();
        }, () -> {
            if (!this.gc() || !this.dN) {
                return;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            GameSettings gameSettings = minecraft.gameSettings;
            this.dN = false;
            gameSettings.thirdPersonView = this.dE;
            this.ey();
        });
    }

    private void ey() {
        Minecraft minecraft = Minecraft.getMinecraft();
        GameSettings gameSettings = minecraft.gameSettings;
        minecraft.renderGlobal.setDisplayListEntitiesDirty();
    }

    public static classun$ay
    extends zi {
        @au(wd="keyBind", pr="0", vu="Keybind", yp=@de(vi=0))
        public km dO;
        @au(wd="viewMode", pr="third", vu="View Mode", yp=@de(vi=1))
        public ay dP;

        public static enum ay {
            THIRD,
            FORWARD

        }
    }
}
