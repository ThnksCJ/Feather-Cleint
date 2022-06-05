package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class on
        implements vt<bb, po, jg> {
    @NotNull
    private final nu ap;

    public on(@NotNull nu nu2) {
        this.ap = nu2;
    }

    @Override
    public void ay(bb bb2, Consumer<po> consumer, Consumer<jg> consumer2) {
        bb.rf rf2;
        bb.ay ay2 = bb2.qi();
        if (ay2 != null) {
            this.ap.je().mq().ay(ay2.getSlug(), ay2.fm());
        }
        if ((rf2 = bb2.qd()) != null) {
            List<sb> list = rf2.values().stream().filter(Objects::nonNull).map(string -> this.ap.je().sd((String) string)).collect(Collectors.toList());
            UUID uUID = Minecraft.getMinecraft().getSession().getProfile().getId();
            this.ap.cr().put(uUID, list);
            this.ap.lx().pv(list);
        }
        consumer.accept(new po("success"));
    }
}
