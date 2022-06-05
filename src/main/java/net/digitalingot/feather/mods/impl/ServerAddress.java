package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

@sv(aw= qc.SERVER_ADDRESS, jf=@bx(vu="Server Address", jm="https://assets.feathercdn.net/game/mods/serveraddress.svg", mz="Shows the server address", lq={ly.ay.HUD}))
@pq(we={@xd(bp=ay.class)})
public class ServerAddress
extends HUDMod<rf> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final ResourceLocation sD = new ResourceLocation("textures/misc/unknown_server.png");
    private String sE;

    public static class rf
    extends zi {
        @de(vi=0)
        public iv i = new iv("General Options");
        @au(wd="showIcon", vu="Show icon", pr="true", nu=@ra(wd="displayMode", ee={"background", "justText"}), yp=@de(vi=1))
        public boolean pY;
        @fl(yp=@de(vi=10))
        @cy
        @wv(rh={@aw(ie="backgroundWidth", pr="75", js=150)})
        public fw jQ;
    }

    public class ay
    extends mo {
        private ResourceLocation sF;

        @Override
        public boolean tj() {
            return MINECRAFT.getCurrentServerData() != null;
        }

        @Override
        public Object so() {
            return MINECRAFT.getCurrentServerData() != null ? MINECRAFT.getCurrentServerData().serverIP : null;
        }

        @Override
        public String ui() {
            return "feathermc.com";
        }

        @Override
        public int df() {
            this.wl = super.df() + (((rf) ServerAddress.this.vz).pY ? this.bt().nd + 6 : 0);
            return this.wl;
        }

        @Override
        public int hu() {
            return ((rf) ServerAddress.this.vz).pY ? Math.max(super.hu(), this.bt().nd) : super.hu();
        }

        @Override
        protected void ga() {
            int n = this.bt().nd;
            if (((rf) ServerAddress.this.vz).pY) {
                int n2 = ((rf) ServerAddress.this.vz).pY ? n + 3 : 0;
                this.kw.ay(this.qv, (float)n2, (float)n / 2.0f - (float)Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f, this.bt().sa, this.bt().ki);
                if (!(MINECRAFT.getCurrentServerData() == null || ServerAddress.this.sE != null && ServerAddress.this.sE.equals(MINECRAFT.getCurrentServerData().serverIP))) {
                    ServerAddress.this.sE = MINECRAFT.getCurrentServerData().serverIP;
                    this.sF = ServerAddress.this.sE != null && !ServerAddress.this.sE.isEmpty() ? new ResourceLocation("servers/" + ServerAddress.this.sE + "/icon") : null;
                }
                fp.ay(0, this.sF == null ? sD : this.sF);
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(770, 771);
                this.kw.ay(0, 0, 0.0f, 0.0f, n, n, n, n, n, n);
            } else {
                super.ga();
            }
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        public fw bt() {
            return ((rf) ServerAddress.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
