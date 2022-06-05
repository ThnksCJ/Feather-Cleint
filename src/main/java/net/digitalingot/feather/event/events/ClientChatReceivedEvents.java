package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.gd;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class ClientChatReceivedEvents
implements Event {
    @SubscribeEvent
    public void ay(ClientChatReceivedEvent clientChatReceivedEvent) {
        byte by = clientChatReceivedEvent.getType().getId();
        if (by == 2) {
            return;
        }
        ITextComponent iTextComponent = clientChatReceivedEvent.getMessage();
        iTextComponent = gd.bo.mg().receiveMessage(iTextComponent);
        if (iTextComponent == null) {
            clientChatReceivedEvent.setCanceled(true);
            return;
        }
        clientChatReceivedEvent.setMessage(iTextComponent);
    }
}
