package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;

import java.awt.*;

@sv(aw = qc.PING, jf = @bx(vu = "Ping", jm = "https://assets.feathercdn.net/game/mods/ping.svg", mz = "Display your ping to the server", lq = {ly.ay.HUD}))
@pq(we = {@xd(bp = ay.class)}, wy = pq.ay.ONLY_HUD_ELEMENT)
public class Ping
        extends HUDMod<rf> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();

    public int zd() {
        if (Ping.MINECRAFT.player == null) {
            return 0;
        }
        NetHandlerPlayClient netHandlerPlayClient = MINECRAFT.getConnection();
        if (netHandlerPlayClient == null) {
            return 0;
        }
        NetworkPlayerInfo networkPlayerInfo = netHandlerPlayClient.getPlayerInfo(Ping.MINECRAFT.player.func_146103_bH().getId());
        if (networkPlayerInfo == null) {
            return 0;
        }
        return networkPlayerInfo.getResponseTime();
    }

    @rm(wm = true)
    public static class rf
            extends zi {
        @de(vi = 0)
        public iv i = new iv("General");
        @au(wd = "badPingColorChangeRate", vu = "Bad Ping Color Change Rate", pr = "25", yp = @de(vi = 1))
        @mj(yu = 10, js = 40)
        public int qH;
        @de(vi = 10)
        public iv qI = new iv("HUD");
        @fl(yp = @de(vi = 11))
        @cy(yv = ho.TOP_RIGHT, jj = "HUD Enabled")
        public fw jQ;
        @au(wd = "dynamicColor", vu = "Dynamic Color", pr = "false", yp = @de(vi = 1))
        public boolean qJ;
        @de(vi = 20)
        public iv qK = new iv("Tab List");
        @au(wd = "tabList", vu = "Tablist", pr = "true", yp = @de(vi = 21))
        public boolean qL;
        @au(wd = "tabListDynamicColor", vu = "Tab List Dynamic Color", pr = "true", nu = @ra(wd = "tabList"), yp = @de(vi = 22))
        public boolean qM;
        @au(wd = "tabListColor", vu = "Tab List Color", pr = "255/255/255", nu = @ra(wd = "tabList"), yp = @de(vi = 23))
        public Color qN;
    }

    public class ay
            extends mo {
        @Override
        public Object so() {
            return Ping.this.zd() + " ms";
        }

        @Override
        public String ui() {
            return "888 ms";
        }

        @Override
        public boolean tj() {
            return Ping.this.zd() > 0;
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        protected void ga() {
            this.kw.ay(this.qv, this.rz, this.eg, this.rw(), this.bt().ki, this.bt().sa.sc());
        }

        private int rw() {
            return ((rf) Ping.this.vz).qJ ? this.xh(Ping.this.zd()) : this.bt().sa.aq();
        }

        public int xh(int n) {
            return Color.getHSBColor(Math.max((125.0f - (float) n * 10.0f / (float) ((rf) Ping.this.vz).qH) / 360.0f, 0.0f), 1.0f, 1.0f).getRGB();
        }

        @Override
        public fw bt() {
            return ((rf) Ping.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
