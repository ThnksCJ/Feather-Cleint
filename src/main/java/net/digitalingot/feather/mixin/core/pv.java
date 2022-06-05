package net.digitalingot.feather.mixin.core;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = {GuiScreen.class})
public interface pv {
    @Accessor(value = "buttonList")
    List<GuiButton> getRenderables();
}
