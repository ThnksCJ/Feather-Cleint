package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.text.DecimalFormat;

@sv(aw = qc.REACH_DISPLAY, jf = @bx(vu = "Reach Display", jm = "https://assets.feathercdn.net/game/mods/reachdisplay.svg", mz = "Shows the distance when hitting a player", lq = {ly.ay.PVP, ly.ay.HUD}))
@pq(we = {@xd(bp = ay.class)})
public class ReachDisplay
        extends HUDMod<rf> {
    private static final long rB = 2000L;
    private static final float rC = 0.0f;
    private static final String rD = "No hit";
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private final DecimalFormat rE = wk.yl("#.# blocks");
    private long jN;
    private float rF = 0.0f;
    private String rG;

    @Override
    public void initialize() {
        rd.bo.ay((entityPlayer, entity) -> {
            if (!this.gc()) {
                return;
            }
            if (ReachDisplay.MINECRAFT.objectMouseOver == null) {
                return;
            }
            if (ReachDisplay.MINECRAFT.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) {
                return;
            }
            if (ReachDisplay.MINECRAFT.objectMouseOver.entityHit == null) {
                return;
            }
            Entity entity2 = ReachDisplay.MINECRAFT.objectMouseOver.entityHit;
            Vec3d vec3d = ReachDisplay.MINECRAFT.objectMouseOver.hitVec;
            if (entity.getEntityId() != entity2.getEntityId()) {
                return;
            }
            if (entity.hurtResistantTime > 10) {
                return;
            }
            Entity entity3 = MINECRAFT.getRenderViewEntity();
            Vec3d vec3d2 = entity3.getPositionEyes(1.0f);
            float f = (float) vec3d.distanceTo(vec3d2);
            this.jN = System.currentTimeMillis();
            this.rF = f;
            this.ts();
        });
        sw.ti.ay(uj2 -> {
            if (uj2 != sw.uj.END || ReachDisplay.MINECRAFT.player == null || !this.gc()) {
                return;
            }
            if (this.rF != 0.0f && System.currentTimeMillis() > this.jN + 2000L) {
                this.rF = 0.0f;
                this.ts();
            }
        });
    }

    private void ts() {
        this.rG = this.rF == 0.0f ? rD : this.rE.format(this.rF);
    }

    @Override
    public void zq() {
        super.zq();
        wk.ay(this.rE, ((rf) this.vz).rJ);
        this.ts();
    }

    public static class rf
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.TOP_LEFT)
        public fw jQ;
        @de(vi = 10)
        public iv rI = new iv("Reach Display");
        @au(wd = "digits", vu = "Digits", pr = "1", yp = @de(vi = 11))
        @mj(js = 3)
        public int rJ;
    }

    public class ay
            extends mo {
        @Override
        public Object so() {
            return ReachDisplay.this.rG;
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        public fw bt() {
            return ((rf) ReachDisplay.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
