package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface gd {
    gb<gd> bo = yd.ay(gd.class, (T[] gdArray) -> iTextComponent -> {
        ITextComponent iTextComponent2 = iTextComponent;
        for (gd gd2 : gdArray) {
            if ((iTextComponent2 = gd2.receiveMessage(iTextComponent2)) != null) continue;
            return null;
        }
        return iTextComponent2;
    });

    @Nullable ITextComponent receiveMessage(@NotNull ITextComponent var1);
}
