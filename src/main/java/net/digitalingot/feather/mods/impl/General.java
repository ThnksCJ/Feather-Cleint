package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.gg;
import net.digitalingot.feather.enums.gi;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.ru;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.network.NetworkManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.net.InetSocketAddress;
import java.util.UUID;

@sv(aw= qc.CORE, jf=@bx(vu="General", jm="https://assets.feathercdn.net/game/sidebar/general.svg", mz="General", lq={}, mc=@bx.ay(vu="General", yp=@de(vi=0))))
public class General
extends Mod<ay> {
    @NotNull
    private final pr eW = new pr(this);
    private Minecraft minecraft;
    @Nullable
    private sf eX;
    @Nullable
    private nn xs;
    private int eY;
    private boolean eZ;
    private boolean fo;
    private boolean fA;

    @Override
    public void initialize() {
        if (net.digitalingot.feather.ay.rf() != en.ay.IDE) {
            net.digitalingot.feather.ay.ay();
        }
        qo.initialize();
        vi.ay(this);
        pn.Fh.tu();
        pt.ay(((ay)this.vz).fC);
        ym.initialize();
        jz.initialize();
        this.xs = new nn();
        this.eX = sf.ay(this.xs);
        this.minecraft = Minecraft.getMinecraft();
        if (this.minecraft.currentScreen != null && this.minecraft.currentScreen instanceof GuiMainMenu) {
            ds.zz(true);
            ok ok2 = wg.INSTANCE.getScreen();
            ok2.sd(true);
            this.minecraft.displayGuiScreen(ok2);
        }
        ei.bo.ay(guiScreen -> {
            ok ok2 = wg.INSTANCE.getScreen();
            if (guiScreen instanceof GuiMainMenu) {
                if (!ok2.zj()) {
                    ds.zz(true);
                    ok2.sd(true);
                }
                return ok2;
            }
            if (ok2.zj()) {
                ds.zz(false);
                ok2.sd(false);
            }
            return guiScreen;
        });
        vc.bo.ay(void_ -> {
            if (rf.nl()) {
                return;
            }
            new pu().ay(void_);
        });
        vc.bo.ay(void_ -> new ie().ay(void_));
        cv.ds.ay((void_, uj2) -> {
            if (uj2 == cv.uj.ALL) {
                cv.fj.mg().render(void_, uj2);
            }
        });
        yb.bo.ay(string -> {
            if (!this.gc()) {
                return;
            }
            if (string.equals("cosmetics")) {
                wg.INSTANCE.show();
                mm.cv();
            }
        });
        hj.dw.ay((entityPlayer, netHandlerPlayClient) -> {
            if (vs.cb()) {
                return;
            }
            NetworkManager networkManager = netHandlerPlayClient.getNetworkManager();
            if (networkManager.isLocalChannel()) {
                return;
            }
            if (Minecraft.getMinecraft().isSingleplayer()) {
                return;
            }
            this.eY = 40;
            InetSocketAddress inetSocketAddress = (InetSocketAddress)networkManager.getRemoteAddress();
            String string = inetSocketAddress.getHostName();
            String string2 = string = string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
            if (string.toLowerCase().contains("hypixel.net")) {
                ck.ay(new ck(gi.HYPIXEL));
            } else {
                ck.ay(new ck(gi.OTHER));
            }
        });
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            ck.ay(null);
            zz.nw().xn().gj();
            ej ej2 = zz.nw().xn();
            kt.ay(ej2);
        });
        sw.ti.ay(uj2 -> {
            if (this.eY > 0 && --this.eY == 0) {
                pn.Fh.oZ();
            }
        });
        qo.ay(() -> ((ay)this.vz).fY, () -> {
            if (this.minecraft.currentScreen != null) {
                return;
            }
            this.minecraft.displayGuiScreen(new ov());
        }, null);
        zr.ll.ay((entity, ay2) -> {
            UUID uUID = entity.getUniqueID();
            Integer n = this.eW.zs(uUID);
            if (n != null) {
                ay2.sb(ay2.pz() + 4);
                ay2.ig(4);
            }
        });
        zr.ds.ay((entity, ay2) -> {
            int n = ay2.pz();
            int n2 = ay2.ro();
            this.eW.ay(entity, n, n2);
        });
        new nh().initialize();
        this.eZ = ((ay)this.vz).fG;
        this.fo = ((ay)this.vz).fH;
        this.fA = ((ay)this.vz).fD;
    }

    @Override
    public void jl() {
        if (this.xs != null) {
            this.xs.close();
            this.xs = null;
        }
    }

    @Override
    public void zq() {
        wg.INSTANCE.getScreen().lz();
        et et2 = zz.nw().rl();
        cd cd2 = et2.wq().ub();
        cd2.uj(((ay)this.vz).fT);
        cd2.sb(((ay)this.vz).fU.getURL());
        go.ay(et2);
        pt.ay(((ay)this.vz).fC);
        if (((ay)this.vz).fG != this.eZ || ((ay)this.vz).fH != this.fo) {
            this.minecraft.refreshResources();
            this.eZ = ((ay)this.vz).fG;
            this.fo = ((ay)this.vz).fH;
        }
        if (((ay)this.vz).fD != this.fA) {
            this.fA = ((ay)this.vz).fD;
            Minecraft.getMinecraft().toggleFullscreen();
            Minecraft.getMinecraft().toggleFullscreen();
        }
    }

    @Nullable
    public sf qy() {
        return this.eX;
    }

    @Nullable
    public nn ex() {
        return this.xs;
    }

    @NotNull
    public pr tb() {
        return this.eW;
    }

    public static classrh$ay
    extends zi {
        @de(vi=0)
        public iv fB = new iv("General Settings");
        @au(wd="mainColor", vu="Main Color", pr="221/53/56", yp=@de(vi=1))
        public Color fC;
        @au(wd="borderlessFullscreen", vu="Borderless Fullscreen", yp=@de(vi=2))
        public boolean fD;
        @au(wd="fullBright", vu="Full Bright", pr="true", yp=@de(vi=3))
        public boolean fE;
        @au(wd="alwaysNametag", vu="Nametag in perspective", pr="true", yp=@de(vi=4))
        public boolean fF;
        @au(wd="clearGlass", vu="Clear Glass", pr="false", yp=@de(vi=5))
        public boolean fG;
        @au(wd="clearColoredGlass", vu="Clear Colored Glass", pr="false", nu=@ra(wd="clearGlass"), yp=@de(vi=6))
        public boolean fH;
        @au(wd="disableAdvancements", vu="Disable Advancements", pr="false", yp=@de(vi=7))
        public boolean fI;
        @au(wd="minViewBobbing", vu="Minimal View Bobbing", pr="true", yp=@de(vi=8))
        public boolean fJ;
        @au(wd="removeCrosshairInPerspective", vu="No Crosshair in Perspective", pr="false", yp=@de(vi=9))
        public boolean fK;
        @au(wd="fireHeight", vu="Fire Height", pr="0.3", yp=@de(vi=10))
        @in(hd=0.0, lf=1.0)
        public double fL;
        @de(vi=20)
        public iv fM = new iv("Chroma Settings");
        @au(wd="chromaMode", vu="Type", pr="normal", yp=@de(vi=21))
        public gg fN;
        @au(wd="chromaSpeed", vu="Speed", pr="10", nu=@ra(wd="chromaMode", ee={"breathing"}), yp=@de(vi=22))
        @in(hd=1.0, lf=25.0)
        public double fO;
        @de(vi=30)
        public iv fP = new iv("Mods");
        @au(wd="showModsInChat", vu="Show Mods in Chat", yp=@de(vi=31))
        public boolean fQ;
        @au(wd="showModsInInventory", vu="Show Mods in Inventory", pr="true", yp=@de(vi=32))
        public boolean fR;
        @de(vi=40)
        public iv fS = new iv("Mod Preview");
        @au(wd="modPreview", vu="Mod Preview", pr="true", yp=@de(vi=41))
        public boolean fT;
        @au(wd="modPreviewBackground", vu="Background", pr="mountains", yp=@de(vi=42), nu=@ra(wd="modPreview"))
        public ay fU;
        @de(vi=50)
        public iv fV = new iv("UI");
        @au(wd="uiQuality", vu="Quality", pr="ultra", yp=@de(vi=52))
        public ru fW;
        @au(wd="militaryTime", vu="24 Hour Close", yp=@de(vi=53))
        public boolean ps;
        @de(vi=60)
        public iv fX = new iv("HUD Editor");
        @au(wd="keyHudEditor", vu="Open HUD Editor", pr="10016", yp=@de(vi=61))
        public km fY;
        @au(wd="snappingLineColor", vu="Line Color", pr="128/255/255/255", yp=@de(vi=62))
        public Color fZ;
        @au(wd="snappingLineWidth", vu="Line Width", pr="1", yp=@de(vi=63))
        @mj(yu=1, js=7)
        public int gl;
        @au(wd="snappingMagnetRadius", vu="Magnet Radius", pr="6", yp=@de(vi=64))
        @mj(yu=1, js=15)
        public int gA;
        @de(vi=70)
        public iv gB = new iv("Blur Settings");
        @au(wd="menusBlur", vu="Menu", pr="false", yp=@de(vi=72))
        public boolean gC;
        @de(vi=80)
        public iv gD = new iv("Sound");
        @au(wd="portalSound", vu="Portal Sounds", pr="true", yp=@de(vi=81))
        public boolean gE;
        @de(vi=90)
        public iv gF = new iv("Keybinds");
        @au(wd="customDropStack", vu="Custom Dropstack", pr="17", yp=@de(vi=91))
        public km gG;
        @de(vi=100)
        public iv gH = new iv("Unfocused FPS Limiter");
        @au(wd="limitFps", vu="Limit FPS when unfocused", pr="true", yp=@de(vi=101))
        public boolean gI;
        @au(wd="unfocusedFps", vu="Unfocused FPS", pr="60", yp=@de(vi=102))
        @mj(yu=30, js=240)
        public int gJ;

        @Override
        public boolean nv() {
            return true;
        }

        static enum ay {
            MOUNTAINS("https://assets.feathercdn.net/game/modpreview/background1.webp"),
            OCEAN("https://assets.feathercdn.net/game/modpreview/background2.webp"),
            SKYBLOCK("https://assets.feathercdn.net/game/modpreview/background3.webp"),
            STONE("https://assets.feathercdn.net/game/modpreview/stone.webp");

            private final String url;

            ay(String string2) {
                this.url = string2;
            }

            public String getURL() {
                return this.url;
            }
        }
    }
}
