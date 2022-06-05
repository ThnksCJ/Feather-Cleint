package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.Class4;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class ln
        implements Class4<ResourcePackRepository.Entry> {
    private final ResourceLocation FQ = new ResourceLocation("textures/misc/unknown_pack.png");

    @Override
    public void ay(vr vr2, ResourcePackRepository.Entry entry, float f, float f2, gp gp2, boolean bl) {
        vr2.ay(entry.getResourcePackName(), f, f2, gp2, bl);
    }

    @Override
    public void ay(vr vr2, ResourcePackRepository.Entry entry, float f, float f2, int n, boolean bl) {
        List list = Minecraft.getMinecraft().fontRenderer.listFormattedStringToWidth(entry.getTexturePackDescription(), 157);
        int n2 = 0;
        for (String string : list) {
            vr2.ay(string, f, f2 + (float) n2, n, bl, false);
            n2 += 12;
        }
    }

    public void ay(ResourcePackRepository.Entry entry) {
        entry.bindTexturePackIcon(Minecraft.getMinecraft().getTextureManager());
    }

    @Override
    public void py() {
        Minecraft.getMinecraft().getTextureManager().bindTexture(this.FQ);
    }

    @Override
    public void ay(vr vr2, int n, int n2, int n3) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        vr2.ay(n, n2, 0.0f, 0.0f, n3, n3, n3, n3, n3, n3);
    }

    @Override
    public void pv(Object object) {
        this.ay((ResourcePackRepository.Entry) object);
    }
}
