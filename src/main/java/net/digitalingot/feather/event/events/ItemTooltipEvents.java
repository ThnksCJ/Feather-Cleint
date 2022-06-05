package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.bv;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@SideOnly(value = Side.CLIENT)
public class ItemTooltipEvents
        implements Event {
    @SubscribeEvent
    public void ay(ItemTooltipEvent itemTooltipEvent) {
        ItemStack itemStack = itemTooltipEvent.getItemStack();
        List list = itemTooltipEvent.getToolTip();
        bv.bo.mg().showTooltip(itemStack, list);
    }
}
