package net.digitalingot.feather;

import net.digitalingot.feather.je;
import net.digitalingot.feather.mt;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

class zn
implements dj {
    @NotNull
    private final gm yC;

    public zn(@NotNull gm gm2) {
        this.yC = gm2;
    }

    @Override
    public void zw() {
    }

    @Override
    public void ay(UUID uUID, long l, byte[] byArray, je.uj uj2) {
        mt mt2 = new mt(uj2, l, byArray);
        this.yC.ay(uUID, mt2);
    }
}
