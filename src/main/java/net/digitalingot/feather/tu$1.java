package net.digitalingot.feather;

import net.minecraftforge.client.event.RenderGameOverlayEvent;

class tu$1 {
    static final int[] wj;

    static {
        wj = new int[RenderGameOverlayEvent.ElementType.values().length];
        tu$1.wj[RenderGameOverlayEvent.ElementType.ALL.ordinal()] = 1;
        tu$1.wj[RenderGameOverlayEvent.ElementType.CROSSHAIRS.ordinal()] = 2;
        tu$1.wj[RenderGameOverlayEvent.ElementType.FOOD.ordinal()] = 3;
    }
}
