package net.digitalingot.feather;

import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

public interface tf {
    gb<rf> lz = yd.ay(rf.class, rfArray -> () -> {
        for (rf rf2 : rfArray) {
            rf2.screenshot();
        }
    });
    gb<ay> eq = yd.ay(ay.class, ayArray -> (file, iTextComponent) -> {
        ITextComponent iTextComponent2 = iTextComponent;
        for (ay ay2 : ayArray) {
            iTextComponent2 = ay2.screenshot(file, iTextComponent2);
        }
        return iTextComponent2;
    });

    interface ay {
        @Nullable ITextComponent screenshot(@NotNull File var1, @Nullable ITextComponent var2);
    }

    interface rf {
        void screenshot();
    }
}
