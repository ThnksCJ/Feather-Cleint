package net.digitalingot.feather.event.events;

import net.digitalingot.feather.event.Event;
import net.digitalingot.feather.lv;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@SideOnly(value = Side.CLIENT)
public class InputEvents
        implements Event {
    private static final Minecraft minecraft = Minecraft.getMinecraft();

    @SubscribeEvent
    public void ay(InputEvent.MouseInputEvent mouseInputEvent) {
        int n = Mouse.getEventButton();
        int n2 = Mouse.getEventButtonState() ? 1 : 0;
        int n3 = 0;
        lv.zl.mg().mouseInput(n, n2, n3);
    }

    @SubscribeEvent
    public void ay(InputEvent.KeyInputEvent keyInputEvent) {
        int n = Keyboard.getEventKey();
        int n2 = 0;
        int n3 = Keyboard.getEventKeyState() ? 1 : 0;
        int n4 = 0;
        lv.vs.mg().keyInput(n, n2, n3, n4);
    }
}
