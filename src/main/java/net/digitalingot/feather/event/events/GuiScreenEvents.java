package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.gv;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class GuiScreenEvents
implements Event {
    @SubscribeEvent
    public void ay(GuiScreenEvent.InitGuiEvent initGuiEvent) {
        GuiScreen guiScreen = initGuiEvent.getGui();
        if (guiScreen == null) {
            return;
        }
        gv.eq.mg().postInitialization(guiScreen);
    }
}
