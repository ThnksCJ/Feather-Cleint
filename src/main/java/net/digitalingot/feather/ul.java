package net.digitalingot.feather;

import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class ul {
    private final List<bc> ER = Collections.synchronizedList(new ArrayList(128));
    private final ExecutorService ES = Executors.newCachedThreadPool();

    public ul() {
        sw.ti.ay(uj2 -> {
            if (uj2 == sw.uj.START) {
                this.oI();
            }
        });
    }

    public <T> Future<T> ay(Supplier<T> supplier) {
        CompletableFuture completableFuture = new CompletableFuture();
        Minecraft.getMinecraft().addScheduledTask(() -> completableFuture.complete(supplier.get()));
        return completableFuture;
    }

    public vo ay(Runnable runnable, long l, long l2) {
        vo vo2 = new vo(runnable, true, l, l2);
        this.ER.add(vo2);
        return vo2;
    }

    public void ay(Runnable runnable, long l) {
        bc bc2 = new bc(runnable, true, l);
        this.ER.add(bc2);
    }

    public void rf(Runnable runnable, long l) {
        bc bc2 = new bc(runnable, false, l);
        this.ER.add(bc2);
    }

    private void oI() {
        Iterator<bc> iterator = this.ER.iterator();
        while (iterator.hasNext()) {
            bc bc2 = iterator.next();
            if (!bc2.oM()) continue;
            if (bc2 instanceof vo) {
                vo vo2 = (vo) bc2;
                if (vo2.oL()) {
                    iterator.remove();
                    continue;
                }
                vo2.ed(vo2.oJ());
                this.ay(vo2);
                continue;
            }
            iterator.remove();
            this.ay(bc2);
        }
    }

    private void ay(bc bc2) {
        if (bc2.oO()) {
            bc2.oN().run();
        } else {
            this.ES.execute(bc2.oN());
        }
    }
}
