package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.xh;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class FOVUpdateEvent
implements Event {
    @SubscribeEvent
    public void ay(FOVUpdateEvent fOVUpdateEvent) {
        float f = fOVUpdateEvent.getFov();
        float f2 = fOVUpdateEvent.getNewfov();
        f2 = xh.bo.mg().updateFOV(f, f2);
        fOVUpdateEvent.setNewfov(f2);
    }
}
