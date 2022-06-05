package net.digitalingot.feather;

import net.digitalingot.feather.enums.gg;
import net.digitalingot.feather.enums.ru;

import java.awt.*;

public class rh$ay
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

    enum ay {
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
