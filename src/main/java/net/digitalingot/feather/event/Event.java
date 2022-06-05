package net.digitalingot.feather.event;

import net.minecraftforge.common.MinecraftForge;

public interface Event {
    default void vn() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
