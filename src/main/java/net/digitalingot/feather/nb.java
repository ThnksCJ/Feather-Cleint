package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public interface nb {
    gb<nb> eq = yd.ay(nb.class, (T[] nbArray) -> guiScreen -> {
        for (nb nb2 : nbArray) {
            nb2.render(guiScreen);
        }
    });

    void render(@NotNull GuiScreen var1);
}
