package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import javax.sound.sampled.FloatControl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@sv(aw = qc.VOICE, jf = @bx(vu = "Voice", jm = "https://assets.feathercdn.net/game/mods/voice.svg", mz = "", lq = {}))
@pq(we = {@xd(bp = ay.class)})
public class Voice
        extends HUDMod<rf> {
    @Nullable
    private gm yC;
    private boolean yD;
    private boolean yE;

    @Override
    public void initialize() {
        ot ot2 = new ot(this);
        vc.bo.ay(ot2::ay);
        qo.ay(() -> ((rf) this.vz).yL, () -> {
            this.yE = true;
        }, () -> {
            this.yE = false;
        });
        qo.ay(() -> ((rf) this.vz).yK, () -> {
            this.yD = true;
        }, () -> {
            this.yD = false;
        });
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            this.yE = false;
            this.yD = false;
        });
        mq.bo.ay(() -> Minecraft.getMinecraft().addScheduledTask(() -> {
            if (this.gc()) {
                this.xc();
            }
        }));
        wz.bo.ay(nf2 -> Minecraft.getMinecraft().addScheduledTask(() -> {
            if (this.gc()) {
                this.du();
            }
        }));
    }

    @Override
    public void au() {
        this.du();
    }

    @Override
    public void jl() {
        this.yD = false;
        this.yE = false;
        this.xc();
    }

    private void xc() {
        if (this.yC != null) {
            this.yC.close();
            this.yC = null;
        }
    }

    private void du() {
        if (this.yC != null) {
            return;
        }
        General rh2 = zz.nw().xn().rf(General.class);
        if (rh2.ex() == null) {
            return;
        }
        zs zs2 = rh2.ex().ww();
        String string = zs2.yw();
        if (string == null) {
            return;
        }
        sf sf2 = rh2.qy();
        if (sf2 == null) {
            return;
        }
        oq oq2 = sf2.vx().ys();
        tx tx2 = new tx(this);
        lo lo2 = new lo(((rf) this.vz).yQ, ((rf) this.vz).yT);
        this.yC = gm.ay(zs2, oq2, tx2, lo2);
    }

    @Nullable
    public gm uo() {
        return this.yC;
    }

    public boolean kr() {
        return this.yE;
    }

    public boolean as() {
        return this.yD;
    }

    @rm(wm = true)
    public static class zv$rf
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.CENTER_LEFT, dz = 0.0, ev = -101.0)
        public ci iO;
        @de(vi = 10)
        public iv i = new iv("General");
        @au(wd = "receiveMode", vu = "Receive Mode", pr = "everyone", yp = @de(vi = 11))
        public ay yH;
        @au(wd = "hud", vu = "Enable HUD Indicator", pr = "true", yp = @de(vi = 12))
        public boolean yI;
        @de(vi = 20)
        public iv yJ = new iv("Key Settings");
        @au(wd = "keyProximityPTT", vu = "Proximity - Push to Talk", pr = "86", yp = @de(vi = 21))
        public km yK;
        @au(wd = "keyPartyPTT", vu = "Party - Push to Talk", pr = "80", yp = @de(vi = 22))
        public km yL;
        @de(vi = 30)
        public iv yM = new iv("Voice Activation");
        @au(wd = "voiceActivationType", vu = "Type", pr = "off", yp = @de(vi = 31))
        public rf yN;
        @au(wd = "voiceActivationThreshold", vu = "Threshold", pr = "-30", yp = @de(vi = 32), nu = @ra(wd = "voiceActivationType", ee = {"proximity", "party"}))
        @in(hd = -70.0, lf = 0.0)
        public double yO;
        @de(vi = 40)
        public iv yP = new iv("Capture");
        @au(wd = "microphone", vu = "Device", pr = "Default", yp = @de(vi = 41))
        @dg
        @qk(wd = "microphones")
        public String yQ;
        @au(wd = "microphoneAmplification", vu = "Amplification", pr = "1.0", yp = @de(vi = 42))
        @in
        public double yR;
        @de(vi = 50)
        public iv yS = new iv("Playback");
        @au(wd = "speaker", vu = "Device", pr = "Default", yp = @de(vi = 51))
        @dg
        @qk(wd = "speakers")
        public String yT;
        @au(wd = "speakerAmplification", vu = "Amplification", pr = "1.0", yp = @de(vi = 52))
        @in
        public double yU;
        @au(wd = "maxVolume", vu = "Max Volume", pr = "80", yp = @de(vi = 53))
        @in(hd = 10.0, lf = 100.0)
        public double yV;

        @qk(wd = "microphones")
        public static List<String> zk() {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Default");
            arrayList.addAll(lo.cu());
            return arrayList;
        }

        @qk(wd = "speakers")
        public static List<String> ow() {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Default");
            arrayList.addAll(lo.sa());
            return arrayList;
        }

        public enum rf {
            OFF,
            PROXIMITY,
            PARTY

        }

        public enum ay {
            EVERYONE,
            PARTY_ONLY;


            public je.ay toCapnProto() {
                switch (1. yF[this.ordinal()]){
                    case 1: {
                        return je.ay.EVERYONE;
                    }
                    case 2: {
                        return je.ay.PARTY_ONLY;
                    }
                }
                throw new IllegalArgumentException();
            }
        }
    }

    public class ay
            extends kb {
        @Override
        public void zq() {
            if (Voice.this.yC == null) {
                return;
            }
            Voice.this.yE = false;
            Voice.this.yD = false;
            Voice.this.yC.vh().zz(((rf) Voice.this.vz).yQ, ((rf) Voice.this.vz).yT);
            for (ht ht2 : Voice.this.yC.rz().values()) {
                FloatControl floatControl = ht2.qs();
                floatControl.setValue((float) (((rf) Voice.this.vz).yV * 40.0 / 100.0 - 35.0));
                ht2.dn();
            }
        }

        @Override
        public boolean tv() {
            return ((rf) Voice.this.vz).yI;
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
                this.ay(oi2.ba(), oi2.getName(), 0.0f, (float) i * 15.0f, 32, 6.5f);
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
                double d2 = (double) ((float) i * 360.0f / (float) n) * Math.PI / 180.0;
                float f13 = (float) Math.cos(d2);
                float f14 = (float) Math.sin(d2);
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
                d = (double) ((float) n2 * 360.0f / (float) n) * Math.PI / 180.0;
                f9 = (float) Math.cos(d);
                f8 = (float) Math.sin(d);
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
                d = (double) ((float) n2 * 360.0f / (float) n) * Math.PI / 180.0;
                f9 = f3 + (float) Math.cos(d) * f3;
                f8 = f3 + (float) Math.sin(d) * f3;
                wa2.zz(f + f9, f2 + f8, 0.0f).uj(0.0f, 1.0f, 0.0f, 1.0f).pe();
            }
            wa2.ok();
            fp.aH();
            vr.nR().ay(string, f + f3 * 2.0f + 3.0f, f2 + f3 - (float) (Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2), -1, true);
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
            return ((rf) Voice.this.vz).iO;
        }
    }
}
