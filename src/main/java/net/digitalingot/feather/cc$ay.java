package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.ServerAddress;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class cc$ay
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
        this.wl = super.df() + (((ServerAddress.rf) ((ServerAddress) ServerAddress.this).vz).pY ? this.bt().nd + 6 : 0);
        return this.wl;
    }

    @Override
    public int hu() {
        return ((ServerAddress.rf) ((ServerAddress) ServerAddress.this).vz).pY ? Math.max(super.hu(), this.bt().nd) : super.hu();
    }

    @Override
    protected void ga() {
        int n = this.bt().nd;
        if (((ServerAddress.rf) ((ServerAddress) ServerAddress.this).vz).pY) {
            int n2 = ((ServerAddress.rf) ((ServerAddress) ServerAddress.this).vz).pY ? n + 3 : 0;
            this.kw.ay(this.qv, (float) n2, (float) n / 2.0f - (float) Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f, this.bt().sa, this.bt().ki);
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
        return ((ServerAddress.rf) ((ServerAddress) ServerAddress.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
