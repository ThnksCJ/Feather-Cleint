package net.digitalingot.feather.event.events;

import net.digitalingot.feather.em;
import net.digitalingot.feather.event.Event;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class EntityJoinWorldEvents
implements Event {
    @SubscribeEvent
    public void ay(EntityJoinWorldEvent entityJoinWorldEvent) {
        Entity entity = entityJoinWorldEvent.getEntity();
        World world = entityJoinWorldEvent.getWorld();
        em.bo.mg().joinLevel(entity, world);
    }
}
