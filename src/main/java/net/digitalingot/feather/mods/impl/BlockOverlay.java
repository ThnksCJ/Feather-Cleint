package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.awt.*;

@sv(aw= qc.BLOCK_OVERLAY, jf=@bx(vu="Block Overlay", jm="https://assets.feathercdn.net/game/mods/blockoverlay.svg", mz="Add overlay and outline to blocks", lq={}))
public class BlockOverlay
extends Mod<ay> {
    @Override
    public void initialize() {
        Minecraft minecraft = Minecraft.getMinecraft();
        ql.cb.ay(() -> {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            Color color;
            WorldClient worldClient;
            IBlockState iBlockState;
            Block block;
            if (!this.gc()) {
                return wi.PASS;
            }
            if (((ay)this.vz).j == ay.ay.NONE) {
                return wi.FAIL;
            }
            RayTraceResult rayTraceResult = minecraft.objectMouseOver;
            EnumFacing enumFacing = null;
            BlockPos blockPos = rayTraceResult.getBlockPos();
            if (blockPos == null) {
                return wi.FAIL;
            }
            if (((ay)this.vz).k) {
                enumFacing = rayTraceResult.sideHit;
            }
            if ((block = (iBlockState = (worldClient = minecraft.world).getBlockState(blockPos)).getBlock()) == null || block == Blocks.AIR || block == Blocks.WATER || block == Blocks.LAVA) {
                return wi.FAIL;
            }
            if (block == Blocks.FLOWING_WATER || block == Blocks.FLOWING_LAVA) {
                return wi.FAIL;
            }
            RenderManager renderManager = minecraft.getRenderManager();
            double d = renderManager.viewerPosX;
            double d2 = renderManager.viewerPosY;
            double d3 = renderManager.viewerPosZ;
            fp.aE();
            fp.uj(770, 771, 1, 0);
            fp.aI();
            fp.mm(false);
            AxisAlignedBB axisAlignedBB = iBlockState.func_185918_c((World)worldClient, blockPos);
            axisAlignedBB = axisAlignedBB.expand(-0.002, -0.002, -0.002).expand(0.002, 0.002, 0.002).offset(-d, -d2, -d3);
            if (((ay)this.vz).j == ay.ay.FULL) {
                Color color2 = ((ay)this.vz).l.pg();
                color = ((ay)this.vz).l.sc() ? new Color(vr.nR().nT()) : color2;
                f5 = (float)color.getRed() / 255.0f;
                f4 = (float)color.getGreen() / 255.0f;
                f3 = (float)color.getBlue() / 255.0f;
                f2 = (float)color.getAlpha() / 255.0f;
                BlockOverlay.ay(axisAlignedBB, enumFacing, f5, f4, f3, f2);
            }
            if ((f = (float)((ay)this.vz).n / 20.0f) != 1.0f) {
                fp.pv(f);
            }
            color = ((ay)this.vz).o.sc() ? new Color(vr.nR().nT()) : ((ay)this.vz).o.pg();
            f5 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f3 = (float)color.getBlue() / 255.0f;
            f2 = (float)((ay)this.vz).o.pg().getAlpha() / 255.0f;
            RenderGlobal.drawSelectionBoundingBox(axisAlignedBB, f5, f4, f3, f2);
            fp.mm(true);
            fp.aJ();
            fp.aF();
            if (f != 1.0f) {
                fp.pv(1.0f);
            }
            return wi.FAIL;
        });
    }

    private static void ay(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing, float f, float f2, float f3, float f4) {
        wa wa2 = wa.Fl;
        wa2.ay(5, DefaultVertexFormats.POSITION_COLOR);
        BlockOverlay.ay(wa2, enumFacing, (float)axisAlignedBB.minX, (float)axisAlignedBB.minY, (float)axisAlignedBB.minZ, (float)axisAlignedBB.maxX, (float)axisAlignedBB.maxY, (float)axisAlignedBB.maxZ, f, f2, f3, f4);
        wa2.ok();
    }

    private static void ay(wa wa2, EnumFacing enumFacing, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        if (enumFacing == null || enumFacing == EnumFacing.WEST) {
            wa2.zz(f, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f5, f6).uj(f7, f8, f9, f10).pe();
        }
        if (enumFacing == EnumFacing.EAST) {
            wa2.zz(f4, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f3).uj(f7, f8, f9, f10).pe();
        }
        if (enumFacing == null || enumFacing == EnumFacing.SOUTH) {
            wa2.zz(f, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f3).uj(f7, f8, f9, f10).pe();
        }
        if (enumFacing == null || enumFacing == EnumFacing.NORTH) {
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f3).uj(f7, f8, f9, f10).pe();
        }
        if (enumFacing == null || enumFacing == EnumFacing.DOWN) {
            wa2.zz(f, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f2, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f5, f3).uj(f7, f8, f9, f10).pe();
        }
        if (enumFacing == null || enumFacing == EnumFacing.UP) {
            wa2.zz(f, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f3).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
            wa2.zz(f4, f5, f6).uj(f7, f8, f9, f10).pe();
        }
    }

    public static classkz$ay
    extends zi {
        @de(vi=0)
        public iv i = new iv("General");
        @au(wd="mode", vu="Mode", pr="full", yp=@de(vi=1))
        public ay j;
        @au(wd="showSide", vu="Show Side Only", pr="false", yp=@de(vi=2), nu=@ra(wd="mode", ee={"full"}))
        public boolean k;
        @au(wd="fillColor", vu="Fill Color", pr="false/255/255/255/125", yp=@de(vi=3))
        public gp l;
        @de(vi=10)
        public iv m = new iv("Outline");
        @au(wd="outlineThickness", vu="Thickness", pr="25", yp=@de(vi=11))
        @mj(yu=1)
        public int n;
        @au(wd="outlineColor", vu="Color", pr="false/255/255/255", yp=@de(vi=12))
        public gp o;
        @au(wd="showAlways", vu="Show always", pr="true", yp=@de(vi=13))
        public boolean p;

        public static enum ay {
            NONE,
            OUTLINE,
            FULL

        }
    }
}
