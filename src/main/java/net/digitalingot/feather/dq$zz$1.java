package net.digitalingot.feather;

import com.google.common.cache.CacheLoader;
import net.digitalingot.feather.mods.impl.NickHider;
import org.jetbrains.annotations.NotNull;

class dq$zz$1
extends CacheLoader<String, String> {
    final NickHider.zz.ay cJ;

    dq$zz$1(NickHider.zz.ay ay2) {
        this.cJ = ay2;
    }

    @Override
    @NotNull
    public String load(@NotNull String string) {
        return this.cJ.load(string);
    }
}
