package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.General;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class go {
    public static void ay(@NotNull et et2) {
        ne ne2 = et2.wq();
        boolean bl = ((General.ay)zz.nw().xn().rf(General.class).xd()).ps;
        String string = "Feather " + Minecraft.getMinecraft().getVersion().replace("-feather", "") + " (" + zz.nw().bu() + ")";
        ab ab2 = new ab(ne2.yg(), ne2.ub(), bl, string);
        zz.nw().pv().rf(ab2);
    }
}
