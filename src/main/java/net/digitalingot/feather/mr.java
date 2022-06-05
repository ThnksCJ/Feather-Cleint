package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class mr
        implements vt<tp, po, jg> {
    @Nullable
    private static GuiScreen ll() {
        return Minecraft.getMinecraft().currentScreen;
    }

    private static void ds() {
        Minecraft.getMinecraft().displayGuiScreen(null);
    }

    @Override
    public void ay(tp tp2, Consumer<po> consumer, Consumer<jg> consumer2) {
        boolean bl = tp2.ai().isEmpty();
        wg.INSTANCE.getScreen().bu(!bl);
        if (bl && mr.ll() instanceof ok) {
            mr.ds();
        }
    }
}
