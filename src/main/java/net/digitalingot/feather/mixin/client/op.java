package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={Minecraft.class})
public interface op {
    @Invoker(value="updateFramebufferSize")
    void invokeUpdateFramebufferSize();
}
