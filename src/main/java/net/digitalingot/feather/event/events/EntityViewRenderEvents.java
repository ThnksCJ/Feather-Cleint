package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.mi;
import net.minecraft.block.Block;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value = Side.CLIENT)
public class EntityViewRenderEvents
        implements Event {
    @SubscribeEvent
    public void ay(EntityViewRenderEvent.FogDensity fogDensity) {
        Block block = fogDensity.getState().getBlock();
        Float f = Float.valueOf(fogDensity.getDensity());
        f = mi.bo.mg().renderFogDensity(block, f.floatValue());
        if (f != null) {
            fogDensity.setCanceled(true);
            fogDensity.setDensity(f.floatValue());
        }
    }
}
