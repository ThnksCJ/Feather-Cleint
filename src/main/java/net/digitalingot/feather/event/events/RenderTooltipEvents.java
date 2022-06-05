package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.jw;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderTooltipEvents
implements Event {
    public static int ou;
    public static int ov;

    @SubscribeEvent
    public void ay(RenderTooltipEvent.Color color) {
        jw.ne.mg().render(null, color.getStack(), color.getX(), color.getY(), ou, ov);
    }

    @SubscribeEvent
    public void ay(RenderTooltipEvent.PostBackground postBackground) {
        jw.pt.mg().render(null, postBackground.getStack(), postBackground.getX(), postBackground.getY(), postBackground.getWidth(), postBackground.getHeight());
    }
}
