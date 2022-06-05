package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.ToggleSprint;

public class bi$ay
extends mo {
    @Override
    public Object so() {
        if (MINECRAFT.player == null) {
            return "";
        }
        if (!sN.isKeyDown()) {
            ToggleSprint.this.sS = false;
        }
        if (((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).sW && sM.isPressed()) {
            ToggleSprint.this.sQ = !ToggleSprint.this.sQ;
        } else if (((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).sV && sN.isPressed() && !MINECRAFT.player.field_71075_bZ.isFlying) {
            ToggleSprint.this.sO = !ToggleSprint.this.sO;
        }
        if (MINECRAFT.player.isSneaking()) {
            return MINECRAFT.gameSettings.keyBindSneak.isKeyDown() ? ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tD : ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tE;
        }
        if (MINECRAFT.player.func_70051_ag() || ToggleSprint.this.sQ) {
            return MINECRAFT.gameSettings.keyBindSprint.isKeyDown() ? ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tF : (ToggleSprint.this.sQ ? ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tG : ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tH);
        }
        return "";
    }

    @Override
    public void ms() {
        this.ay(qx.HUD_OVERLAY, ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tG, false);
        this.ay(qx.MOD_LAYOUT, true, false);
    }

    @Override
    public String ui() {
        return ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tG;
    }

    @Override
    public boolean tv() {
        return !((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tC;
    }

    @Override
    public boolean gf() {
        return false;
    }

    @Override
    public fw bt() {
        return ((ToggleSprint.rf)((ToggleSprint) ToggleSprint.this).vz).tA;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
