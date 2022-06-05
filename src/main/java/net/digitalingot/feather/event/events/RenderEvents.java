package net.digitalingot.feather.event.events;

import net.digitalingot.feather.cv;
import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.zx;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

@SideOnly(value=Side.CLIENT)
public class RenderEvents
implements Event {
    @SubscribeEvent
    public void ay(RenderGameOverlayEvent.Pre pre) {
        RenderGameOverlayEvent.ElementType elementType = pre.getType();
        cv.uj uj2 = this.ay(elementType);
        if (uj2 == null) {
            return;
        }
        wi wi2 = cv.ll.mg().render(null, uj2);
        if (wi2 == wi.FAIL) {
            pre.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void ay(RenderGameOverlayEvent.Post post) {
        RenderGameOverlayEvent.ElementType elementType = post.getType();
        cv.uj uj2 = this.ay(elementType);
        if (uj2 == null) {
            return;
        }
        cv.ds.mg().render(null, uj2);
    }

    @SubscribeEvent
    public void ay(RenderGameOverlayEvent.Text text) {
        zx.kt.mg().render(null);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
    }

    @Nullable
    private cv.uj ay(RenderGameOverlayEvent.ElementType elementType) {
        switch (1.wj[elementType.ordinal()]) {
            case 1: {
                return cv.uj.ALL;
            }
            case 2: {
                return cv.uj.CROSSHAIRS;
            }
            case 3: {
                return cv.uj.FOOD;
            }
        }
        return null;
    }
}
