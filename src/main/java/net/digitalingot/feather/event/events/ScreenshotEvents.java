package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.interfaces.tf;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ScreenshotEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.MixinEnvironment;

import java.io.File;

@SideOnly(value = MixinEnvironment.Side.CLIENT)
public class ScreenshotEvents
        implements Event {
    @SubscribeEvent
    public void ay(ScreenshotEvent screenshotEvent) {
        File file = screenshotEvent.getScreenshotFile();
        ITextComponent iTextComponent = screenshotEvent.getResultMessage();
        ITextComponent iTextComponent2 = tf.eq.mg().screenshot(file, iTextComponent);
        screenshotEvent.setResultMessage(iTextComponent2);
    }
}
