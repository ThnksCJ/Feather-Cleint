package net.digitalingot.feather.mixin.core;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = {EntityRenderer.class})
public interface sd {
    @Invoker(value = "loadShader")
    void feather$loadShader(ResourceLocation var1);

    @Accessor(value = "shaderGroup")
    ShaderGroup feather$getEffect();
}
