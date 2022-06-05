package net.digitalingot.feather.mixin.core;

import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={Gui.class})
public interface ay {
    @Accessor(value="zLevel")
    float getBlitOffset();
}
