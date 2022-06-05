package net.digitalingot.feather;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.jetbrains.annotations.NotNull;

class dq$zz {
    private final LoadingCache<String, String> cI;

    private dq$zz(long l, final ay ay2) {
        this.cI = CacheBuilder.newBuilder().maximumSize(l).build(new CacheLoader<String, String>(){

            @Override
            @NotNull
            public String load(@NotNull String string) {
                return ay2.load(string);
            }
        });
    }

    public String es(String string) {
        return this.cI.getUnchecked(string);
    }

    public void gm() {
        this.cI.invalidateAll();
    }

    public interface ay {
        @NotNull String load(@NotNull String var1);
    }
}
