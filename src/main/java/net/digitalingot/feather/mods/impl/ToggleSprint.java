package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

@sv(aw = qc.TOGGLE_SPRINT, jf = @bx(vu = "Toggle Sprint", jm = "https://assets.feathercdn.net/game/mods/togglesprint.svg", mz = "Toggle your sprint and sneak key", lq = {ly.ay.PVP}))
@pq(we = {@xd(bp = ay.class)})
public class ToggleSprint
        extends HUDMod<rf> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final KeyBinding sM = ToggleSprint.MINECRAFT.gameSettings.keyBindSprint;
    private static final KeyBinding sN = ToggleSprint.MINECRAFT.gameSettings.keyBindSneak;
    private boolean sO;
    private boolean sP;
    private boolean sQ;
    private boolean sR;
    private boolean sS;

    @Override
    public void initialize() {
        lv.vs.ay((n, n2, n3, n4) -> {
            boolean bl;
            if (!this.gc()) {
                return;
            }
            if (ToggleSprint.MINECRAFT.player == null) {
                return;
            }
            boolean bl2 = bl = ToggleSprint.MINECRAFT.gameSettings.keyBindSprint.getKeyCode() == n;
            if (bl && n3 == 1 && ToggleSprint.MINECRAFT.player.field_71075_bZ.isFlying) {
                this.sQ = ((rf) this.vz).sW && !this.sQ;
                this.sR = !this.sR;
            }
        });
        ei.bo.ay(guiScreen -> {
            if (!this.gc()) {
                return guiScreen;
            }
            if (this.sO) {
                this.sO = false;
                this.sP = true;
            }
            return guiScreen;
        });
        sw.ti.ay(uj2 -> {
            if (!this.gc()) {
                return;
            }
            if (uj2 != sw.uj.START) {
                return;
            }
            if (this.sP && Minecraft.getMinecraft().currentScreen == null) {
                this.sO = true;
                this.sP = false;
            }
        });
    }

    @Override
    public void zq() {
        super.zq();
        if (!((rf) this.vz).sV) {
            this.sO = false;
        }
        this.sQ = ((rf) this.vz).sW;
    }

    @Override
    public void jl() {
        this.sQ = false;
        this.sO = false;
    }

    public boolean ym() {
        return this.gc() && this.sQ;
    }

    public boolean mv() {
        return this.gc() && this.sO;
    }

    public void ag(boolean bl) {
        this.sO = bl;
    }

    public boolean pn() {
        return !this.gc() || !((rf) this.vz).sY;
    }

    public boolean zo() {
        return this.sR && ToggleSprint.MINECRAFT.player.field_71075_bZ.isCreativeMode;
    }

    public int wa() {
        return ((rf) this.vz).sZ;
    }

    @rm(wm = true)
    public static class rf
            extends zi {
        @de(vi = 0)
        public iv sU = new iv("Toggle Sprint");
        @au(wd = "toggleSneak", vu = "Toggle Sneak", yp = @de(vi = 1))
        public boolean sV;
        @au(wd = "toggleSprint", vu = "Toggle Sprint", pr = "true", yp = @de(vi = 2))
        public boolean sW;
        @de(vi = 10)
        public iv sX = new iv("Fly");
        @au(wd = "blockSprintWhenFlying", vu = "Block Sprint", yp = @de(vi = 11))
        public boolean sY;
        @au(wd = "flyBoostAmount", vu = "Boost Amount", pr = "1", yp = @de(vi = 12))
        @mj(yu = 1, js = 8)
        public int sZ;
        @fl(yp = @de(vi = 20))
        @cy(yv = ho.TOP_LEFT, dz = 0.0, ev = 52.0)
        @wv(rh = {@aw(ie = "backgroundWidth", js = 150, pr = "110"), @aw(ie = "backgroundHeight", yu = 10, js = 25, pr = "16")})
        public uj tA;
        @de(vi = 30)
        public iv tB = new iv("Text Settings");
        @au(wd = "hideText", vu = "Hide Text", yp = @de(vi = 31))
        public boolean tC;
        @au(wd = "sneakingKeyHeldText", vu = "Sneaking Held", pr = "Sneaking (Key Held)", yp = @de(vi = 32))
        @jf(yu = 0, js = 32)
        public String tD;
        @au(wd = "sneakingToggledText", vu = "Sneaking Toggled", pr = "Sneaking (Toggled)", yp = @de(vi = 33))
        @jf(yu = 0, js = 32)
        public String tE;
        @au(wd = "sprintingKeyHeldText", vu = "Sprinting Held", pr = "Sprinting (Key Held)", yp = @de(vi = 34))
        @jf(yu = 0, js = 32)
        public String tF;
        @au(wd = "sprintingToggledText", vu = "Sprinting Toggled", pr = "Sprinting (Toggled)", yp = @de(vi = 35))
        @jf(yu = 0, js = 32)
        public String tG;
        @au(wd = "sprintingVanillaText", vu = "Sprinting Vanilla", pr = "Sprinting (Vanilla)", yp = @de(vi = 36))
        @jf(yu = 0, js = 32)
        public String tH;
    }

    public static class uj
            extends fw {
    }

    public class ay
            extends mo {
        @Override
        public Object so() {
            if (MINECRAFT.player == null) {
                return "";
            }
            if (!sN.isKeyDown()) {
                ToggleSprint.this.sS = false;
            }
            if (((rf) ToggleSprint.this.vz).sW && sM.isPressed()) {
                ToggleSprint.this.sQ = !ToggleSprint.this.sQ;
            } else if (((rf) ToggleSprint.this.vz).sV && sN.isPressed() && !MINECRAFT.player.field_71075_bZ.isFlying) {
                ToggleSprint.this.sO = !ToggleSprint.this.sO;
            }
            if (MINECRAFT.player.isSneaking()) {
                return MINECRAFT.gameSettings.keyBindSneak.isKeyDown() ? ((rf) ToggleSprint.this.vz).tD : ((rf) ToggleSprint.this.vz).tE;
            }
            if (MINECRAFT.player.func_70051_ag() || ToggleSprint.this.sQ) {
                return MINECRAFT.gameSettings.keyBindSprint.isKeyDown() ? ((rf) ToggleSprint.this.vz).tF : (ToggleSprint.this.sQ ? ((rf) ToggleSprint.this.vz).tG : ((rf) ToggleSprint.this.vz).tH);
            }
            return "";
        }

        @Override
        public void ms() {
            this.ay(qx.HUD_OVERLAY, ((rf) ToggleSprint.this.vz).tG, false);
            this.ay(qx.MOD_LAYOUT, true, false);
        }

        @Override
        public String ui() {
            return ((rf) ToggleSprint.this.vz).tG;
        }

        @Override
        public boolean tv() {
            return !((rf) ToggleSprint.this.vz).tC;
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        public fw bt() {
            return ((rf) ToggleSprint.this.vz).tA;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
