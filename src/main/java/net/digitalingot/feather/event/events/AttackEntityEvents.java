package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.rd;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value = Side.CLIENT)
public class AttackEntityEvents
        implements Event {
    @SubscribeEvent
    public void ay(AttackEntityEvent attackEntityEvent) {
        boolean bl = Minecraft.getMinecraft().isCallingFromMinecraftThread();
        if (!bl) {
            return;
        }
        EntityPlayer entityPlayer = attackEntityEvent.getEntityPlayer();
        Entity entity = attackEntityEvent.getTarget();
        rd.bo.mg().attack(entityPlayer, entity);
    }
}
