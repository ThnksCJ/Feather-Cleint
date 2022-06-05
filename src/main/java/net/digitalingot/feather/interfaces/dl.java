package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface dl {
    gb<dl> bo = yd.ay(dl.class, (T[] dlArray) -> string -> {
        String string2 = string;
        for (dl dl2 : dlArray) {
            if ((string2 = dl2.sendChat(string2)) != null) continue;
            return null;
        }
        return string2;
    });

    @Nullable String sendChat(@NotNull String var1);
}
