package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public interface ei {
    gb<ei> bo = yd.ay(ei.class, (T[] eiArray) -> guiScreen -> {
        GuiScreen guiScreen2 = guiScreen;
        for (ei ei2 : eiArray) {
            guiScreen2 = ei2.openScreen(guiScreen2);
        }
        return guiScreen2;
    });

    @NotNull GuiScreen openScreen(@NotNull GuiScreen var1);
}
