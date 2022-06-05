package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public class oo {
    private static final boolean jp;

    public static boolean xb() {
        return jp;
    }

    public static boolean ay(@NotNull GuiScreen guiScreen) {
        return guiScreen.getClass().getName().startsWith("gg.essential.gui");
    }

    static {
        Class.forName("net.digitalingot.feather.enums.gg.essential.Essential");
        jp = true;
    }
}
