package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.sw;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

@SideOnly(value = Side.CLIENT)
public class TickEvents
        implements Event {
    @SubscribeEvent
    public void ay(TickEvent.ClientTickEvent clientTickEvent) {
        sw.uj uj2 = this.ay(clientTickEvent.phase);
        sw.ti.mg().tick(uj2);
    }

    @SubscribeEvent
    public void ay(TickEvent.WorldTickEvent worldTickEvent) {
        sw.uj uj2 = this.ay(worldTickEvent.phase);
        sw.dd.mg().tick(uj2, worldTickEvent.world);
    }

    @SubscribeEvent
    public void ay(TickEvent.PlayerTickEvent playerTickEvent) {
        sw.uj uj2 = this.ay(playerTickEvent.phase);
        sw.gn.mg().tick(uj2, playerTickEvent.player);
    }

    @SubscribeEvent
    public void ay(TickEvent.RenderTickEvent renderTickEvent) {
        sw.uj uj2 = this.ay(renderTickEvent.phase);
        sw.sq.mg().tick(uj2, renderTickEvent.renderTickTime);
    }

    @NotNull
    private sw.uj ay(TickEvent.Phase phase) {
        return phase == TickEvent.Phase.END ? sw.uj.END : sw.uj.START;
    }
}
