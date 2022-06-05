package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.be;
import net.digitalingot.feather.interfaces.it;
import net.digitalingot.feather.interfaces.zx;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;

public enum bd {
    INSTANCE;

    private static final Minecraft MINECRAFT;

    static {
        MINECRAFT = Minecraft.getMinecraft();
    }

    private qx renderLayer;
    private boolean init;
    private boolean needsUpdate;
    private HUDMod<? extends zi>[] enabledHudModules;
    @Nullable
    private up renderMod;
    private be renderModule;

    private static boolean isModLayoutOpen() {
        return bd.MINECRAFT.currentScreen instanceof ov;
    }

    private static List<HUDMod<? extends zi>> getEnabledHudModules() {
        ej ej2 = zz.nw().xn();
        return ej2.qq().values().stream().filter(ux2 -> ux2.gc() && ux2.xd().nv()).filter(ux2 -> ux2 instanceof HUDMod).map(ux2 -> (HUDMod) ux2).collect(Collectors.toList());
    }

    private void onInit() {
        this.cacheHudMods();
        sw.ti.ay(uj2 -> {
            if (uj2 == sw.uj.START) {
                this.onClientTick();
            }
        });
        it.bo.ay((ux2, bl) -> this.onModLoadedStateChanged(ux2));
        zx.kt.ay(void_ -> this.onRender(qx.HUD_OVERLAY));
    }

    private void cacheHudMods() {
        List<HUDMod<? extends zi>> list = bd.getEnabledHudModules();
        this.enabledHudModules = (HUDMod[]) Array.newInstance(HUDMod.class, list.size());
        list.toArray(this.enabledHudModules);
    }

    private void onClientTick() {
        if (this.needsUpdate) {
            this.cacheHudMods();
            this.needsUpdate = false;
        }
    }

    private void onRender(qx qx2) {
        if (bd.MINECRAFT.player == null || bd.MINECRAFT.world == null) {
            return;
        }
        if (bd.isModLayoutOpen() && qx2 != qx.MOD_LAYOUT) {
            return;
        }
        if (vs.cb()) {
            return;
        }
        if (bd.MINECRAFT.gameSettings.showDebugInfo) {
            return;
        }
        this.renderLayer = qx2;
        for (HUDMod<? extends zi> ft2 : this.enabledHudModules) {
            this.renderModule(ft2, qx2);
        }
    }

    private void renderModule(@NotNull HUDMod<?> ft2, qx qx2) {
        for (kb kb2 : ft2.im()) {
            this.renderElement(kb2, qx2);
        }
    }

    private void renderElement(@NotNull kb kb2, qx qx2) {
        if (!kb2.te().xv()) {
            return;
        }
        if (!kb2.tv()) {
            return;
        }
        ya ya2 = kb2.pl();
        ya2.nW();
        float f = (float) kb2.te().yx();
        GL11.glPushMatrix();
        GL11.glTranslated(kb2.hh(), kb2.ix(), 0.0);
        GL11.glScalef(f, f, 1.0f);
        kb2.ay(qx2);
        GL11.glPopMatrix();
        ya2.nV();
    }

    public void onRenderModPreview() {
        if (this.renderMod != null) {
            be be2 = this.renderModule;
            up.ay ay2 = this.renderMod.gr();
            double d = iz.bA();
            double d2 = 1.0;
            int n = 8;
            int n2 = ay2.oz().kk() - ay2.td().kk();
            int n3 = ay2.oz().tp() - ay2.td().tp();
            if ((double) (be2.br() + n * 2) > (double) n2 / d) {
                d2 = 1.0 / (double) (be2.br() + n * 2) * ((double) n2 / d);
            }
            int n4 = (int) ((double) be2.br() * d2);
            int n5 = (int) ((double) (ay2.td().kk() + n2 / 2) / d - (double) (n4 / 2));
            int n6 = (int) ((double) (ay2.td().tp() + n3 / 2) / d - (double) (be2.to() / 2) * d2);
            GL11.glPushMatrix();
            GL11.glTranslated(n5, n6, 0.0);
            GL11.glScalef((float) d2, (float) d2, 1.0f);
            be2.ms();
            GL11.glPopMatrix();
        }
    }

    private void onModLoadedStateChanged(Mod<?> ux2) {
        if (ux2 instanceof HUDMod) {
            this.needsUpdate = true;
        }
    }

    public void init() {
        Preconditions.checkState(!this.init);
        this.onInit();
        this.init = true;
    }

    public void setRenderMod(@Nullable up up2) {
        this.renderMod = up2;
        if (up2 != null) {
            this.renderModule = (be) zz.nw().xn().ay(this.renderMod.jt());
            if (this.renderModule instanceof HUDMod) {
                ((HUDMod) this.renderModule).zq();
            }
        } else {
            this.renderModule = null;
        }
    }

    public qx getRenderLayer() {
        return this.renderLayer;
    }

    public void setRenderLayer(qx qx2) {
        this.renderLayer = qx2;
    }
}
