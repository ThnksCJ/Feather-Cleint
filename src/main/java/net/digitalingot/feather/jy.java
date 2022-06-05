package net.digitalingot.feather;

import com.google.common.collect.ImmutableSet;
import net.digitalingot.feather.zp;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class jy
extends FallbackResourceManager {
    private final bn kl;

    public jy(bn bn2) {
        super(null);
        this.kl = bn2;
    }

    @NotNull
    public Set<String> getResourceDomains() {
        return ImmutableSet.of("feather_rt");
    }

    @NotNull
    public IResource getResource(@NotNull ResourceLocation resourceLocation) {
        xo xo2 = this.kl.rf(resourceLocation);
        if (xo2 == null) {
            throw new FileNotFoundException(resourceLocation.toString());
        }
        return new zp(xo2.wp());
    }

    @NotNull
    public List<IResource> getAllResources(ResourceLocation resourceLocation) {
        return Collections.emptyList();
    }
}
