package net.digitalingot.feather.event.events;

import net.digitalingot.feather.ei;
import net.digitalingot.feather.event.Event;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class GuiOpenEvents
implements Event {
    @SubscribeEvent
    public void ay(GuiOpenEvent guiOpenEvent) {
        GuiScreen guiScreen = guiOpenEvent.getGui();
        if (guiScreen == null) {
            return;
        }
        GuiScreen guiScreen2 = ei.bo.mg().openScreen(guiScreen);
        guiOpenEvent.setGui(guiScreen2);
    }
}
