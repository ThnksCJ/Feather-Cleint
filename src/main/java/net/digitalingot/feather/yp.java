package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.nio.file.Files;
import java.util.function.Consumer;

public class yp
        implements vt<zh, po, jg> {
    @Override
    public void ay(zh zh2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        dr dr2 = ej2.hm().bf();
        gj gj2 = new gj(dr2, zh2.kq());
        gj gj3 = new gj(dr2, zh2.uz());
        if (gj3.zc().exists()) {
            throw new IllegalArgumentException("Profile already exists");
        }
        Files.copy(gj2.zc().toPath(), gj3.zc().toPath());
        consumer.accept(new po("success"));
    }
}
