package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface hj {
    gb<hj> dw = yd.ay(hj.class, hjArray -> (entityPlayer, netHandlerPlayClient) -> {
        if (ay.mr) {
            return;
        }
        ay.mr = true;
        for (hj hj2 : hjArray) {
            hj2.on(entityPlayer, netHandlerPlayClient);
        }
    });
    gb<hj> ii = yd.ay(hj.class, hjArray -> (entityPlayer, netHandlerPlayClient) -> {
        if (!ay.mr) {
            return;
        }
        ay.mr = false;
        for (hj hj2 : hjArray) {
            hj2.on(entityPlayer, netHandlerPlayClient);
        }
    });

    void on(@NotNull EntityPlayer var1, @NotNull NetHandlerPlayClient var2);

    class ay {
        private static boolean mr;
    }
}
