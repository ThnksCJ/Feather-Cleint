package net.digitalingot.feather;

import net.digitalingot.feather.enums.li;
import net.digitalingot.feather.enums.qd;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiWorldSelection;

import java.util.Arrays;
import java.util.function.Consumer;

public class wq
        implements vt<yz, po, jg> {
    @Override
    public void ay(yz yz2, Consumer<po> consumer, Consumer<jg> consumer2) {
        Minecraft minecraft = Minecraft.getMinecraft();
        fm fm3 = Arrays.stream(fm.values()).filter(fm2 -> fm2.getSlug().equals(yz2.og())).findAny().orElse(null);
        if (fm3 != null) {
            switch (1. bl[fm3.ordinal()]){
                case 1: {
                    minecraft.displayGuiScreen(new GuiWorldSelection(new GuiMainMenu()));
                    break;
                }
                case 2: {
                    minecraft.displayGuiScreen(new GuiMultiplayer(new GuiMainMenu()));
                    break;
                }
                case 3: {
                    mm.cv();
                    break;
                }
                case 4: {
                    Minecraft.getMinecraft().shutdown();
                }
            }
            consumer.accept(new po("success"));
            return;
        }
        qd qd3 = Arrays.stream(qd.values()).filter(qd2 -> qd2.getSlug().equals(yz2.og())).findAny().orElse(null);
        if (qd3 != null) {
            switch (1. vf[qd3.ordinal()]){
                case 1: {
                    minecraft.displayGuiScreen(new GuiOptions(new GuiMainMenu(), minecraft.gameSettings));
                    break;
                }
                case 2: {
                    throw new IllegalStateException("Realms only supported on the latest minecraft version");
                }
                case 3: {
                    vs.bo();
                }
            }
            consumer.accept(new po("success"));
            return;
        }
        li li3 = Arrays.stream(li.values()).filter(li2 -> li2.getSlug().equals(yz2.og())).findAny().orElse(null);
        if (li3 != null) {
            switch (1. lw[li3.ordinal()]){
                case 1: {
                    Minecraft.getMinecraft().displayGuiScreen(new ov());
                }
            }
            consumer.accept(new po("success"));
            return;
        }
        throw new IllegalStateException("Selection not found");
    }
}
