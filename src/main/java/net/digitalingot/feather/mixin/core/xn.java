package net.digitalingot.feather.mixin.core;

import net.minecraft.util.text.TextComponentString;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={TextComponentString.class})
public interface xn {
    @Accessor(value="text")
    void setText(String var1);
}
