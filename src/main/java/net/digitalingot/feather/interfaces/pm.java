package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

public interface pm {
    gb<pm> eq = yd.ay(pm.class, pmArray -> () -> {
        for (pm pm2 : pmArray) {
            pm2.render();
        }
    });

    void render();
}
