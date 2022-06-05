package net.digitalingot.feather.mixin.core;

import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.ViewFrustum;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = {RenderGlobal.class})
public interface nl {
    @Accessor
    ViewFrustum getViewFrustum();

    @Accessor
    List<Object> getRenderInfos();
}
