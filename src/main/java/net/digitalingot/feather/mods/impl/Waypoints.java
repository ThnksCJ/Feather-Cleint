package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

@sv(aw = qc.WAYPOINTS, jf = @bx(vu = "Waypoints", jm = "https://assets.feathercdn.net/game/mods/waypoints.svg", mz = "", lq = {}))
public class Waypoints
        extends Mod<ay> {
    @NotNull
    private final Set<cr> Bh = new LinkedHashSet<cr>();
    @NotNull
    private final List<cr> Bi = new ArrayList<cr>();
    private File Bg;

    @Override
    public void initialize() {
        gw gw2 = zz.nw().pv();
        gw2.ay(ao.CREATE_UPDATE_WAYPOINT, new gy(this));
        gw2.ay(ao.DELETE_WAYPOINT, new fq(this));
        pm.eq.ay(() -> {
            if (!this.gc()) {
                return;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            RenderManager renderManager = minecraft.getRenderManager();
            Entity entity = renderManager.renderViewEntity;
            if (entity == null) {
                return;
            }
            double d = minecraft.gameSettings.getOptionFloatValue(GameSettings.Options.RENDER_DISTANCE);
            d *= 12.0;
            Iterator iterator = this.J().iterator();
            while (iterator.hasNext()) {
                double d2;
                cr cr2 = (cr) iterator.next();
                if (!cr2.B()) continue;
                double d3 = renderManager.viewerPosX;
                double d4 = renderManager.viewerPosY;
                double d5 = renderManager.viewerPosZ;
                double d6 = (double) cr2.de().kk() - d3;
                double d7 = (double) cr2.de().tp() - d4;
                double d8 = (double) cr2.de().E() - d5;
                double d9 = d2 = cr2.de().nl(entity);
                if (d2 > d) {
                    d6 = d6 / d2 * d;
                    d7 = d7 / d2 * d;
                    d8 = d8 / d2 * d;
                    d2 = d;
                }
                float f = ((float) d2 * 0.1f + 1.0f) * 0.0266f;
                GlStateManager.pushMatrix();
                GlStateManager.translate(d6, -d4, d8);
                GlStateManager.rotate(-90.0f, 1.0f, 0.0f, 0.0f);
                fp.aI();
                fp.aE();
                fp.uj(770, 771, 1, 0);
                fp.W();
                fp.mm(false);
                int n = 20;
                float f2 = 0.75f;
                float f3 = eb.bu((float) (d4 + 25.0), 100.0f, 256.0f);
                float f4 = (float) Math.PI * 2 / (float) n;
                Color color = cr2.ra().pg();
                if (cr2.ra().sc()) {
                    color = new Color(vr.nR().nT());
                }
                float f5 = (float) ((double) ((float) color.getRed() / 255.0f) + 0.5);
                float f6 = (float) ((double) ((float) color.getGreen() / 255.0f) + 0.5);
                float f7 = (float) ((double) ((float) color.getBlue() / 255.0f) + 0.5);
                float f8 = (float) ((d2 - 6.0) / 24.0 * ((double) ((float) color.getAlpha() / 255.0f) + 0.5));
                fp.ay(f5, f6, f7, f8);
                wa wa2 = wa.Fl;
                wa2.ay(5, DefaultVertexFormats.POSITION);
                for (int i = 0; i <= n; ++i) {
                    float f9;
                    float f10;
                    if (i == n) {
                        f10 = (float) Math.sin(0.0);
                        f9 = (float) Math.cos(0.0);
                    } else {
                        f10 = (float) Math.sin((float) i * f4);
                        f9 = (float) Math.cos((float) i * f4);
                    }
                    wa2.zz(f10 * f2, f9 * f2, 0.0f).pe();
                    wa2.zz(0.0f, 0.0f, f3).pe();
                }
                wa2.ok();
                GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.translate(0.0f, 0.0f, (float) (-cr2.de().tp()) - 0.001f);
                this.rf(0.85f, -0.07f, 26);
                fp.aF();
                fp.X();
                fp.aJ();
                GlStateManager.popMatrix();
                fp.mm(false);
                fp.aB();
                String string = cr2.getName() + " [" + (int) d9 + "m]";
                GlStateManager.pushMatrix();
                GlStateManager.translate(d6, d7 + 2.0, d8);
                GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(-Minecraft.getMinecraft().getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(Minecraft.getMinecraft().getRenderManager().playerViewX, 1.0f, 0.0f, 0.0f);
                GlStateManager.scale(-f, -f, f);
                GlStateManager.depthMask(false);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                Tessellator tessellator = Tessellator.getInstance();
                BufferBuilder bufferBuilder = tessellator.getBuffer();
                int n2 = 0;
                int n3 = fp.mq(string) / 2;
                GlStateManager.disableTexture2D();
                bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
                bufferBuilder.pos(-n3 - 1, -1 + n2, 0.0).color(0.0f, 0.0f, 0.0f, 0.5f).endVertex();
                bufferBuilder.pos(-n3 - 1, 8 + n2, 0.0).color(0.0f, 0.0f, 0.0f, 0.5f).endVertex();
                bufferBuilder.pos(n3 + 1, 8 + n2, 0.0).color(0.0f, 0.0f, 0.0f, 0.5f).endVertex();
                bufferBuilder.pos(n3 + 1, -1 + n2, 0.0).color(0.0f, 0.0f, 0.0f, 0.5f).endVertex();
                tessellator.draw();
                GlStateManager.enableTexture2D();
                vr.nR().ay(string, (float) (-n3), (float) n2, -1, false);
                GlStateManager.disableBlend();
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.popMatrix();
                fp.mm(true);
                fp.aA();
                fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            }
        });
        qo.ay(() -> ((ay) this.vz).Bl, () -> {
            if (!this.gc()) {
                return;
            }
            if (Minecraft.getMinecraft().player == null) {
                return;
            }
            wg.INSTANCE.show();
            xw.ay((boolean) true, (Waypoints) this);
        }, null);
        qo.ay(() -> ((ay) this.vz).Bm, () -> {
            if (!this.gc()) {
                return;
            }
            if (Minecraft.getMinecraft().player == null) {
                return;
            }
            wg.INSTANCE.show();
            xw.ay((boolean) false, (Waypoints) this);
        }, null);
        yb.bo.ay(string -> {
            if (!this.gc()) {
                return;
            }
            if (string.equals(qc.WAYPOINTS.getSlug())) {
                wg.INSTANCE.show();
                xw.ay((boolean) false, (Waypoints) this);
            }
        });
        em.bo.ay((entity, world) -> {
            if (!this.gc()) {
                return;
            }
            if (entity == Minecraft.getMinecraft().player) {
                this.F();
                xl.nl(this.Bi);
            }
        });
    }

    @Override
    public void au() {
        Object object;
        this.Bg = new File(zz.nw().iu(), "waypoints.json");
        if (this.Bg.exists()) {
            object = (Set) zd.xn(this.Bg).ay(new /* Unavailable Anonymous Inner Class!! */.getType());
            this.Bh.addAll((Collection<cr>) object);
        }
        if ((object = Minecraft.getMinecraft().player) != null && object.field_70170_p != null) {
            this.F();
            xl.nl(this.Bi);
        }
    }

    @Override
    public void jl() {
        this.Bh.clear();
        this.Bi.clear();
    }

    public void F() {
        this.Bi.clear();
        for (cr cr2 : this.Bh) {
            if (!cr2.ay(this)) continue;
            this.Bi.add(cr2);
        }
    }

    @Override
    public void ay(@NotNull cr cr2) {
        this.Bh.remove(cr2);
        this.Bh.add(cr2);
        this.F();
        this.ii();
    }

    public void rf(@NotNull cr cr2) {
        this.Bh.remove(cr2);
        this.F();
        this.ii();
    }

    private void ii() {
        this.Bg.getParentFile().mkdirs();
        zd.xn(this.Bg).oE().nl(this.Bh);
    }

    @Nullable
    public String G() {
        WorldClient worldClient = Minecraft.getMinecraft().world;
        if (worldClient == null) {
            return null;
        }
        return worldClient.func_72912_H().getWorldName();
    }

    @Nullable
    public String H() {
        if (Minecraft.getMinecraft().isSingleplayer()) {
            return null;
        }
        ServerData serverData = Minecraft.getMinecraft().getCurrentServerData();
        if (serverData == null) {
            return null;
        }
        return serverData.serverIP;
    }

    @NotNull
    public Set<cr> I() {
        return this.Bh;
    }

    @NotNull
    public Stream<cr> J() {
        List list = ck.oR().map(ck::cy).orElse(Collections.emptyList());
        return Stream.concat(this.Bi.stream(), list.stream());
    }

    private void rf(float f, float f2, int n) {
        float f3 = (float) (Math.PI * 2 / (double) n);
        wa wa2 = wa.Fl;
        wa2.ay(5, DefaultVertexFormats.POSITION);
        for (int i = 0; i <= n; ++i) {
            float f4;
            float f5;
            if (i == n) {
                f5 = (float) Math.cos(0.0);
                f4 = (float) Math.sin(0.0);
            } else {
                f5 = (float) Math.cos((float) i * f3);
                f4 = (float) Math.sin((float) i * f3);
            }
            wa2.zz(f5 * f, f4 * f, 0.0f).pe();
            wa2.zz(f5 * (f + f2), f4 * (f + f2), 0.0f).pe();
        }
        wa2.ok();
    }

    @rm(le = @xg(ae = "waypoints", vu = "Waypoints", jm = "https://assets.feathercdn.net/game/hudselection/waypoints.svg", un = 0))
    public static class ay
            extends zi {
        @de(vi = 0)
        public iv Bk = new iv("Key Settings");
        @au(wd = "waypointCreateKey", vu = "Create Waypoint", pr = "59", yp = @de(vi = 1))
        public km Bl;
        @au(wd = "waypointMenuKey", vu = "Menu", pr = "192", yp = @de(vi = 2))
        public km Bm;
    }
}
