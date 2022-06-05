package net.digitalingot.feather.mixin.core;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.transformer.meta.MixinProxy;

@Mixin(value={Minecraft.class})
public interface ed {
    @Accessor
    @Mutable
    void setSession(Session var1);

    @Accessor(value="debugFPS")
    @MixinProxy(sessionId="7905d428-2b07-4200-8c61-7047355b89d7")
    static int getFPS() {
        return Minecraft.getFPS_$md$5b89d7$0();
    }
}
