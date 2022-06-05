package net.digitalingot.feather.mixin.core;

import net.minecraft.util.text.TextComponentTranslation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = {TextComponentTranslation.class})
public interface rl {
    @Accessor(value = "lastTranslationUpdateTimeInMilliseconds")
    void setLastUpdate(long var1);
}
