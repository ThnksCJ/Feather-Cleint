package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.gd;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class ob
        extends mn<Hypixel.ay> {
    @NotNull
    private static final Pattern tY = Pattern.compile("(:?1st(:? Killer| Place)?(:? - |:))|(:?Winner(:?s)?(:?:| - | #1))|(:?Winning Team(:?:| -) )|(:?Damage Dealt)|(:?Game over)|(:? won the game!)|(:?Last team standing!)");
    private static final Pattern tZ = Pattern.compile("\\S{1,16}: .*");
    private int hJ = -1;

    ob(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uL;
    }

    @Override
    public void initialize() {
        gd.bo.ay(iTextComponent -> {
            if (!this.gc()) {
                return iTextComponent;
            }
            String string = iTextComponent.getUnformattedText();
            if (string.isEmpty()) {
                return iTextComponent;
            }
            if (!this.dl(string) && this.hr(string)) {
                this.hJ = this.vM.xd().uM;
            }
            return iTextComponent;
        });
        sw.ti.ay(uj2 -> {
            if (!this.gc()) {
                return;
            }
            if (uj2 != sw.uj.START) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (entityPlayerSP == null) {
                return;
            }
            if (this.hJ == 0) {
                entityPlayerSP.sendChatMessage("/ac gg");
                this.hJ = -1;
            } else if (this.hJ > 0) {
                --this.hJ;
            }
        });
    }

    private boolean hr(String string) {
        return tY.matcher(string).find(0);
    }

    private boolean dl(String string) {
        return tZ.matcher(string).matches();
    }
}
