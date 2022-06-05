package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.nb;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiScreenDrawEvents
        implements Event {
    @SubscribeEvent
    public void ay(GuiScreenEvent.DrawScreenEvent.Post post) {
        GuiScreen guiScreen = post.getGui();
        nb.eq.mg().render(guiScreen);
    }
}
