package net.digitalingot.feather;

import com.google.common.collect.Maps;
import net.digitalingot.feather.interfaces.hl;
import net.digitalingot.feather.interfaces.xo;
import net.digitalingot.feather.mixin.core.zs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class bn {
    public static final String EE = "feather_rt";
    private final Map<ResourceLocation, xo> EF = Maps.newHashMap();

    public bn() {
        rf.nn().ay(this::oH, 1L);
        hl.bo.ay(this::oH);
    }

    public static ResourceLocation vq(String string) {
        return new ResourceLocation(EE, string);
    }

    private static Map<String, FallbackResourceManager> getDomainResourceManagers() {
        zs zs2 = (zs) Minecraft.getMinecraft().getResourceManager();
        return zs2.getDomainResourceManagers();
    }

    public void ay(ResourceLocation resourceLocation, xo xo2) {
        this.EF.put(resourceLocation, xo2);
    }

    public xo rf(ResourceLocation resourceLocation) {
        return this.EF.get(resourceLocation);
    }

    public void uj(ResourceLocation resourceLocation) {
        this.EF.remove(resourceLocation);
    }

    private void oH() {
        bn.getDomainResourceManagers().put(EE, new jy(this));
    }
}
