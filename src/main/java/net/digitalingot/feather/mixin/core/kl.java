package net.digitalingot.feather.mixin.core;

import net.minecraft.util.FoodStats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = {FoodStats.class})
public interface kl {
    @Accessor
    float getFoodExhaustionLevel();
}
