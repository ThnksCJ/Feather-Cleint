package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;

@sv(aw= qc.COMBO_DISPLAY, jf=@bx(vu="Combo Display", jm="https://assets.feathercdn.net/game/mods/combodisplay.svg", mz="Display number of consecutive hits", lq={ly.ay.PVP, ly.ay.HUD}))
@pq(we={@xd(bp= rf.class)})
public class ComboDisplay
extends HUDMod<ay> {
    private static final long jL = 2000L;
    private static final long jM = 500L;
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private long jN;
    private int jO = 0;
    private int jP;

    @Override
    public void initialize() {
        rd.bo.ay((entityPlayer, entity) -> {
            if (!this.gc() || !(entity instanceof EntityPlayer)) {
                return;
            }
            if (ComboDisplay.MINECRAFT.objectMouseOver == null) {
                return;
            }
            if (ComboDisplay.MINECRAFT.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) {
                return;
            }
            if (ComboDisplay.MINECRAFT.objectMouseOver.entityHit == null || ComboDisplay.MINECRAFT.objectMouseOver.entityHit.getEntityId() != entity.getEntityId()) {
                return;
            }
            if (this.jP != entity.getEntityId()) {
                this.jO = 0;
            }
            this.jP = entity.getEntityId();
            this.jN = System.currentTimeMillis();
        });
        jo.bo.ay(entityLivingBase -> {
            if (!this.gc() || ComboDisplay.MINECRAFT.player == null) {
                return;
            }
            int n = entityLivingBase.func_145782_y();
            if (n == ComboDisplay.MINECRAFT.player.func_145782_y()) {
                this.jO = 0;
            } else if (this.jP == n && System.currentTimeMillis() - this.jN < 500L) {
                ++this.jO;
            }
        });
        sw.ti.ay(uj2 -> {
            if (uj2 != sw.uj.END || ComboDisplay.MINECRAFT.player == null || !this.gc()) {
                return;
            }
            if (System.currentTimeMillis() > this.jN + 2000L) {
                this.jO = 0;
            }
        });
    }

    public static class ay
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(dz=33.0, ev=8.0)
        public fw jQ;
        @au(wd="reversed", vu="Reversed", yp=@de(vi=1))
        public boolean jR;
    }

    public class rf
    extends mo {
        @Override
        public Object so() {
            if (ComboDisplay.this.jO == 0) {
                return "No Combo";
            }
            return ((ay) ComboDisplay.this.vz).jR ? "Combo: " + ComboDisplay.this.jO : ComboDisplay.this.jO + " Combo";
        }

        @Override
        public boolean gf() {
            return ((ay) ComboDisplay.this.vz).jR;
        }

        @Override
        public fw bt() {
            return ((ay) ComboDisplay.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
