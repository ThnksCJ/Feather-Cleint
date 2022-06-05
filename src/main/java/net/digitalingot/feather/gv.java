package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;

public interface gv {
    gb<gv> eq = yd.ay(gv.class, (T[] gvArray) -> guiScreen -> {
        for (gv gv2 : gvArray) {
            gv2.postInitialization(guiScreen);
        }
    });

    void postInitialization(GuiScreen var1);
}
