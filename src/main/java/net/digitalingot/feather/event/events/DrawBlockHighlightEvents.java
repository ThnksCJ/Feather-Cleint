package net.digitalingot.feather.event.events;

import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.ql;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DrawBlockHighlightEvents
        implements Event {
    @SubscribeEvent
    public void ay(DrawBlockHighlightEvent drawBlockHighlightEvent) {
        wi wi2 = ql.cb.mg().drawHighlightBlock();
        if (wi2 == wi.FAIL) {
            drawBlockHighlightEvent.setCanceled(true);
        }
    }
}
