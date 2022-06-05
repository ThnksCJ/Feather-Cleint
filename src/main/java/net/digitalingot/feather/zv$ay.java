package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.mods.impl.Voice;
import net.digitalingot.feather.oi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

import javax.sound.sampled.FloatControl;
import java.util.List;
import java.util.UUID;

public class zv$ay
extends kb {
    @Override
    public void zq() {
        if (Voice.this.yC == null) {
            return;
        }
        Voice.this.yE = false;
        Voice.this.yD = false;
        Voice.this.yC.vh().zz(((Voice.rf)((Voice) Voice.this).vz).yQ, ((Voice.rf)((Voice) Voice.this).vz).yT);
        for (ht ht2 : Voice.this.yC.rz().values()) {
            FloatControl floatControl = ht2.qs();
            floatControl.setValue((float)(((Voice.rf)((Voice) Voice.this).vz).yV * 40.0 / 100.0 - 35.0));
            ht2.dn();
        }
    }

    @Override
    public boolean tv() {
        return ((Voice.rf)((Voice) Voice.this).vz).yI;
    }

    @Override
    public void ay(qx qx2) {
        if (Voice.this.yC == null) {
            return;
        }
        List<oi> list = Voice.this.yC.rs();
        fp.aE();
        fp.uj(770, 771, 1, 0);
        int n = 32;
        float f = 6.5f;
        for (int i = 0; i < list.size(); ++i) {
            oi oi2 = list.get(i);
            this.ay(oi2.ba(), oi2.getName(), 0.0f, (float)i * 15.0f, 32, 6.5f);
        }
        fp.aF();
    }

    private void ay(UUID uUID, String string, float f, float f2, int n, float f3) {
        double d;
        int n2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        fp.aG();
        wa wa2 = wa.Fl;
        NetworkPlayerInfo networkPlayerInfo = Minecraft.getMinecraft().getConnection().getPlayerInfo(uUID);
        if (networkPlayerInfo == null) {
            return;
        }
        ResourceLocation resourceLocation = networkPlayerInfo.getLocationSkin();
        Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
        wa2.ay(6, DefaultVertexFormats.POSITION_TEX);
        float f10 = 0.1875f;
        float f11 = 0.1875f;
        float f12 = 0.0625f;
        for (int i = 0; i <= n; ++i) {
            double d2 = (double)((float)i * 360.0f / (float)n) * Math.PI / 180.0;
            float f13 = (float)Math.cos(d2);
            float f14 = (float)Math.sin(d2);
            f9 = f + f3 + f13 * f3;
            f8 = f2 + f3 + f14 * f3;
            f7 = f12 * f13;
            f6 = f12 * f14;
            f5 = f10 + f7;
            f4 = f11 + f6;
            wa2.zz(f9, f8, 0.0f).zz(f5, f4).pe();
        }
        wa2.ok();
        float f15 = 0.6875f;
        float f16 = 0.1875f;
        wa2.ay(6, DefaultVertexFormats.POSITION_TEX);
        for (n2 = 0; n2 <= n; ++n2) {
            d = (double)((float)n2 * 360.0f / (float)n) * Math.PI / 180.0;
            f9 = (float)Math.cos(d);
            f8 = (float)Math.sin(d);
            f7 = f + f3 + f9 * f3;
            f6 = f2 + f3 + f8 * f3;
            f5 = f12 * f9;
            f4 = f12 * f8;
            float f17 = f15 + f5;
            float f18 = f16 + f4;
            wa2.zz(f7, f6, 0.0f).zz(f17, f18).pe();
        }
        wa2.ok();
        wa2.ay(3, DefaultVertexFormats.POSITION_COLOR);
        for (n2 = 0; n2 <= n; ++n2) {
            d = (double)((float)n2 * 360.0f / (float)n) * Math.PI / 180.0;
            f9 = f3 + (float)Math.cos(d) * f3;
            f8 = f3 + (float)Math.sin(d) * f3;
            wa2.zz(f + f9, f2 + f8, 0.0f).uj(0.0f, 1.0f, 0.0f, 1.0f).pe();
        }
        wa2.ok();
        fp.aH();
        vr.nR().ay(string, f + f3 * 2.0f + 3.0f, f2 + f3 - (float)(Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2), -1, true);
    }

    @Override
    public int df() {
        return 125;
    }

    @Override
    public int hu() {
        return 50;
    }

    @Override
    public ci te() {
        return ((Voice.rf)((Voice) Voice.this).vz).iO;
    }
}
