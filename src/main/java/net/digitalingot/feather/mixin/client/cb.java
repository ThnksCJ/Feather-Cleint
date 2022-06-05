package net.digitalingot.feather.mixin.client;

import net.minecraftforge.fml.client.SplashProgress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.transformer.meta.MixinProxy;

import java.util.concurrent.Semaphore;

@Mixin(value = {SplashProgress.class}, remap = false)
public interface cb {
    @Accessor(value = "done", remap = false)
    @MixinProxy(sessionId = "7905d428-2b07-4200-8c61-7047355b89d7")
    static boolean isDone() {
        return SplashProgress.isDone_$md$5b89d7$0();
    }

    @Accessor(value = "pause", remap = false)
    @MixinProxy(sessionId = "7905d428-2b07-4200-8c61-7047355b89d7")
    static boolean isPaused() {
        return SplashProgress.isPaused_$md$5b89d7$1();
    }

    @Accessor(value = "mutex", remap = false)
    @MixinProxy(sessionId = "7905d428-2b07-4200-8c61-7047355b89d7")
    static Semaphore getMutex() {
        return SplashProgress.getMutex_$md$5b89d7$2();
    }
}
