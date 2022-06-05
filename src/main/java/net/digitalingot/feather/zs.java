package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Closeable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class zs
        implements Closeable {
    @NotNull
    private final nn xs;
    @Nullable
    private ScheduledExecutorService om = null;
    @Nullable
    private String sy;
    private long ja;
    @Nullable
    private String pb;
    private long rc;

    public zs(@NotNull nn nn2) {
        this.xs = nn2;
        this.on();
    }

    public void hs() {
        this.ja = 0L;
        this.rc = 0L;
        this.on();
    }

    private void on() {
        if (this.om != null) {
            this.om.shutdownNow();
            this.om = null;
        }
        this.om = Executors.newScheduledThreadPool(1);
        zs zs2 = this;
        this.om.scheduleWithFixedDelay(() -> {
            this.pb = zs2.aj();
        }, 29L, 29L, TimeUnit.MINUTES);
        this.om.scheduleWithFixedDelay(zs2::es, 23L, 23L, TimeUnit.HOURS);
    }

    @Nullable
    public String oh() {
        if (System.currentTimeMillis() > this.ja + TimeUnit.HOURS.toMillis(23L)) {
            this.es();
        }
        return this.sy;
    }

    void uj(@NotNull String string) {
        vm.Fq.info("Setting core backend token");
        this.ja = System.currentTimeMillis();
        this.sy = string;
    }

    private void es() {
        this.ja = System.currentTimeMillis();
        this.xs.es();
    }

    @Nullable
    public String yw() {
        if (System.currentTimeMillis() > this.rc + TimeUnit.SECONDS.toMillis(1770L)) {
            this.pb = this.aj();
        }
        return this.pb;
    }

    @Nullable
    private String aj() {
        this.rc = System.currentTimeMillis();
        vm.Fq.debug("Fetching new game token...");
        return this.xs.aj();
    }

    @Override
    public void close() {
        if (this.om != null) {
            this.om.shutdownNow();
            this.om = null;
        }
    }
}
