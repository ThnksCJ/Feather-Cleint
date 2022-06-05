package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.pm;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderWorldLastEvents
        implements Event {
    @SubscribeEvent
    public void ay(RenderWorldLastEvent renderWorldLastEvent) {
        pm.eq.mg().render();
    }
}
