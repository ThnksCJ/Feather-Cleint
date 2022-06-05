package net.digitalingot.feather;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import net.digitalingot.feather.at;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.li;
import net.digitalingot.feather.enums.qd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class gw {
    @NotNull
    public static final Gson GSON = new GsonBuilder().addSerializationExclusionStrategy(new er()).enableComplexMapKeySerialization().setFieldNamingStrategy(new wx()).registerTypeAdapterFactory(new no()).registerTypeAdapter(Color.class, new ld()).registerTypeAdapter(gp.class, new sk()).registerTypeAdapter(InetSocketAddress.class, new xj()).registerTypeAdapter(byte[].class, new sg()).registerTypeAdapter(km.class, new zy()).registerTypeAdapter(qd.class, (Object)new at.ay()).registerTypeAdapter(fm.class, (Object)new at.rf()).registerTypeAdapter(li.class, (Object)new at.uj()).create();
    @NotNull
    private final Multimap<ao, vt<da, da, da>> cm = ArrayListMultimap.create();
    @NotNull
    private final Map<ay, nx<da, da>> mh = new ConcurrentHashMap<ay, nx<da, da>>();
    @NotNull
    private final AtomicInteger lx = new AtomicInteger();
    private final pj je = new pj();

    public <T extends da, S extends da, F extends da> void ay(@NotNull ao ao2, @NotNull vt<T, S, F> vt2) {
        this.cm.put(ao2, vt2);
    }

    public void ay(@NotNull da da2) {
        this.ay(da2, null, null, rf.RUST_LAUNCHER);
    }

    public <S extends da, F extends da> void rf(@NotNull da da2, @Nullable Consumer<S> consumer, @Nullable Consumer<F> consumer2) {
        this.ay(da2, consumer, consumer2, rf.RUST_LAUNCHER);
    }

    public void rf(@NotNull da da2) {
        this.ay(da2, null, null, rf.FRONTEND);
    }

    public <S extends da, F extends da> void uj(@NotNull da da2, @Nullable Consumer<S> consumer, @Nullable Consumer<F> consumer2) {
        this.ay(da2, consumer, consumer2, rf.FRONTEND);
    }

    private void ay(@NotNull da da2, @NotNull rf rf2) {
        this.ay(da2, null, null, rf2);
    }

    private void rf(@NotNull da da2, @NotNull rf rf2) {
        this.ay(da2, null, null, rf2);
    }

    private <S extends da, F extends da> void ay(@NotNull da da2, @Nullable Consumer<S> consumer, @Nullable Consumer<F> consumer2, @NotNull rf rf2) {
        Object object;
        int n = this.lx.incrementAndGet();
        if (consumer != null || consumer2 != null) {
            object = new ay(rf2, n);
            this.mh.put((ay)object, new nx<S, F>(consumer, consumer2));
        }
        object = GSON.toJsonTree(da2);
        pa pa2 = new pa(n, da2.xp(), (JsonElement)object, null, null);
        this.rf(pa2, rf2);
    }

    @VisibleForTesting
    public void ay(@NotNull pa pa2, @NotNull rf rf2) {
        block6: {
            block4: {
                Consumer<da> consumer;
                block5: {
                    if (pa2.nk() == null && pa2.bb() == null) break block4;
                    ay ay2 = new ay(rf2, pa2.zt());
                    nx<da, da> nx2 = this.mh.get(ay2);
                    if (nx2 == null) {
                        return;
                    }
                    Consumer<da> consumer2 = nx2.ib();
                    consumer = nx2.rn();
                    if (pa2.nk() == null || consumer2 == null) break block5;
                    Class<?> clazz = hi.ay(consumer2.getClass(), 0, 0);
                    da da3 = (da)GSON.fromJson(pa2.nk(), clazz);
                    consumer2.accept(da3);
                    break block6;
                }
                if (pa2.bb() == null || consumer == null) break block6;
                Class<?> clazz = hi.ay(consumer.getClass(), 0, 0);
                da da4 = (da)GSON.fromJson(pa2.bb(), clazz);
                consumer.accept(da4);
                break block6;
            }
            if (pa2.sh() != null) {
                ao ao2 = pa2.sh();
                Collection<vt<da, da, da>> collection = this.cm.get(ao2);
                if (collection.isEmpty()) {
                    return;
                }
                da da5 = pa2.ri() == null ? null : GSON.fromJson(pa2.ri(), ao2.getModel());
                for (vt<da, da, da> vt2 : collection) {
                    Consumer<da> consumer = da2 -> {
                        JsonElement jsonElement = GSON.toJsonTree(da2);
                        pa pa3 = new pa(pa2.zt(), null, null, jsonElement, null);
                        this.rf(pa3, rf2);
                    };
                    Consumer<da> consumer3 = da2 -> {
                        JsonElement jsonElement = GSON.toJsonTree(da2);
                        pa pa3 = new pa(pa2.zt(), null, null, null, jsonElement);
                        this.rf(pa3, rf2);
                    };
                    vt2.ay(da5, consumer, consumer3);
                }
            }
        }
    }

    private void rf(@NotNull pa pa2, @NotNull rf rf2) {
        String string = GSON.toJson(pa2);
        switch (1.cr[rf2.ordinal()]) {
            case 1: {
                bq.nl(string);
                break;
            }
            case 2: {
                this.je.nl(string);
            }
        }
    }

    @VisibleForTesting
    public enum rf {
        FRONTEND,
        RUST_LAUNCHER

    }

    static class ay {
        @NotNull
        private final rf ys;
        private final int id;

        ay(@NotNull rf rf2, int n) {
            this.ys = rf2;
            this.id = n;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || this.getClass() != object.getClass()) {
                return false;
            }
            ay ay2 = (ay)object;
            return this.id == ay2.id && this.ys == ay2.ys;
        }

        public int hashCode() {
            return Objects.hash(this.ys, this.id);
        }
    }
}
