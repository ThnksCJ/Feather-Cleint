package net.digitalingot.feather;

import net.digitalingot.feather.mixin.core.pv;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.resources.I18n;

public class nh {
    public void initialize() {
        gv.eq.ay(guiScreen -> {
            int n;
            if (!(guiScreen instanceof GuiIngameMenu)) {
                return;
            }
            pv pv2 = (pv)guiScreen;
            pv2.getRenderables().removeIf(nh::zs);
            String string = "Server List";
            String string2 = "Feather Settings";
            int n2 = guiScreen.height / 4 + 72 - 16;
            GuiButton guiButton = new GuiButton(99, guiScreen.width / 2 - 100, n2, 98, 20, string);
            dd.ay(guiScreen, guiButton);
            if (oo.xb()) {
                n = guiScreen.width - 108;
                n2 = 10;
            } else {
                n = guiScreen.width / 2;
                n += 2;
            }
            GuiButton guiButton2 = new GuiButton(100, n, n2, 98, 20, string2);
            dd.ay(guiScreen, guiButton2);
        });
    }

    private static boolean zs(Object object) {
        if (!(object instanceof GuiButton)) {
            return false;
        }
        GuiButton guiButton = (GuiButton)object;
        String string = guiButton.displayString;
        return string.equals(I18n.format("menu.shareToLan", new Object[0]));
    }
}
