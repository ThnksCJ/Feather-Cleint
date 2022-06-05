package net.digitalingot.feather.interfaces;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

import java.util.UUID;

public interface ve {
    gb<ay> wq = yd.ay(ay.class, (T[] ayArray) -> gameProfile -> {
        for (ay ay2 : ayArray) {
            ay2.onAdded(gameProfile);
        }
    });
    gb<rf> ub = yd.ay(rf.class, (T[] rfArray) -> uUID -> {
        for (rf rf2 : rfArray) {
            rf2.onRemoved(uUID);
        }
    });

    @FunctionalInterface
    interface rf {
        void onRemoved(UUID var1);
    }

    @FunctionalInterface
    interface ay {
        void onAdded(GameProfile var1);
    }
}
