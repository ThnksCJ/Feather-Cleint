package net.digitalingot.feather.mixin.core;

import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(value={SimpleReloadableResourceManager.class})
public interface zs {
    @Accessor
    Map<String, FallbackResourceManager> getDomainResourceManagers();
}
