package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;

import java.awt.*;

@sv(aw = qc.HITBOX, jf = @bx(vu = "Hitbox", jm = "https://assets.feathercdn.net/game/mods/hitbox.svg", mz = "Adds hitboxes around entities", lq = {}))
public class Hitbox
        extends Mod<ay> {
    @Override
    public void initialize() {
        yk.eq.ay((entity, d, d2, d3) -> {
            if (!this.gc()) {
                return;
            }
            if (entity.isInvisible()) {
                return;
            }
            Color color = this.bu(entity);
            if (color == null) {
                return;
            }
            fp.mm(false);
            fp.aI();
            fp.Z();
            fp.aG();
            fp.aF();
            AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
            AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX - entity.posX + d, axisAlignedBB.minY - entity.posY + d2, axisAlignedBB.minZ - entity.posZ + d3, axisAlignedBB.maxX - entity.posX + d, axisAlignedBB.maxY - entity.posY + d2, axisAlignedBB.maxZ - entity.posZ + d3);
            float f = (float) color.getRed() / 255.0f;
            float f2 = (float) color.getGreen() / 255.0f;
            float f3 = (float) color.getBlue() / 255.0f;
            float f4 = (float) color.getAlpha() / 255.0f;
            RenderGlobal.drawSelectionBoundingBox(axisAlignedBB2, f, f2, f3, f4);
            fp.aJ();
            fp.Y();
            fp.aH();
            fp.aF();
            fp.mm(true);
        });
    }

    private Color bu(Entity entity) {
        gp gp2 = null;
        boolean bl = entity instanceof IProjectile;
        gp2 = bl ? (((ay) this.vz).aS ? ((ay) this.vz).aT : null) : (entity instanceof EntityItem ? (((ay) this.vz).aV ? ((ay) this.vz).aW : null) : (entity instanceof EntityAnimal ? (((ay) this.vz).aP ? ((ay) this.vz).aQ : null) : (entity instanceof EntityMob ? (((ay) this.vz).aM ? ((ay) this.vz).aN : null) : (entity instanceof EntityPlayer ? (((ay) this.vz).aJ ? ((ay) this.vz).aK : null) : ((ay) this.vz).aH))));
        if (gp2 == null) {
            return null;
        }
        return gp2.sc() ? new Color(vr.nR().nT()) : gp2.pg();
    }

    public static class ay
            extends zi {
        @de(vi = 0)
        public iv i = new iv("General");
        @au(wd = "mainColor", vu = "Main Color", pr = "", yp = @de(vi = 1))
        public gp aH;
        @de(vi = 10)
        public iv aI = new iv("Player Hitboxes");
        @au(wd = "playerHitboxes", vu = "Player Hitboxes", pr = "true", yp = @de(vi = 11))
        public boolean aJ;
        @au(wd = "playerHitboxColor", vu = "Color", nu = @ra(wd = "playerHitboxes"), yp = @de(vi = 12))
        public gp aK;
        @de(vi = 20)
        public iv aL = new iv("Monster Hitboxes");
        @au(wd = "monsterHitboxes", vu = "Monster Hitboxes", pr = "true", yp = @de(vi = 21))
        public boolean aM;
        @au(wd = "monsterHitboxColor", vu = "Color", nu = @ra(wd = "monsterHitboxes"), yp = @de(vi = 22))
        public gp aN;
        @de(vi = 30)
        public iv aO = new iv("Animal Hitboxes");
        @au(wd = "animalHitboxes", vu = "Animal Hitboxes", pr = "true", yp = @de(vi = 31))
        public boolean aP;
        @au(wd = "animalHitboxColor", vu = "Color", nu = @ra(wd = "animalHitboxes"), yp = @de(vi = 32))
        public gp aQ;
        @de(vi = 40)
        public iv aR = new iv("Projectile Hitboxes");
        @au(wd = "projectileHitboxes", vu = "Projectile Hitboxes", pr = "true", yp = @de(vi = 41))
        public boolean aS;
        @au(wd = "projectileHitboxColor", vu = "Color", nu = @ra(wd = "projectileHitboxes"), yp = @de(vi = 42))
        public gp aT;
        @de(vi = 50)
        public iv aU = new iv("Item Drop Hitboxes");
        @au(wd = "itemDropHitboxes", vu = "Item Drop Hitboxes", pr = "true", yp = @de(vi = 51))
        public boolean aV;
        @au(wd = "itemDropHitboxColor", vu = "Color", nu = @ra(wd = "itemDropHitboxes"), yp = @de(vi = 52))
        public gp aW;
    }
}
