package net.digitalingot.feather;

import com.google.gson.JsonElement;
import net.digitalingot.feather.jg;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class hs
implements vt<nk, po, jg> {
    @NotNull
    private final ig qt;

    public hs(@NotNull ig ig2) {
        this.qt = ig2;
    }

    @Override
    public void ay(nk nk2, Consumer<po> consumer, Consumer<jg> consumer2) {
        for (String string : nk2.hl()) {
            sb sb2 = this.qt.sd(string);
            if (sb2 == null) {
                throw new IllegalArgumentException("Cosmetic with specified slug \"" + string + "\" not found");
            }
            JsonElement jsonElement = sb2.it();
            if (jsonElement == null) continue;
            oh oh2 = gw.GSON.fromJson(sb2.it(), oh.class);
            this.qt.mq().mw().put(string, oh2);
        }
        this.qt.mq().pd();
        consumer.accept(new po("success"));
    }
}
