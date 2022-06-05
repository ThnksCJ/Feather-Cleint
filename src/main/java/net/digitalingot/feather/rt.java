package net.digitalingot.feather;

import net.digitalingot.feather.lr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class rt {
    @NotNull
    private final oq hA;
    @NotNull
    private final nn xs;
    private long hB;

    public rt(@NotNull nn nn2) {
        this.hA = new oq(new is(nn2, this));
        this.xs = nn2;
    }

    @Nullable
    public lr ww(@Nullable String string) {
        lr lr2 = null;
        List<lr> list = this.hA.S();
        if (string == null) {
            lr2 = list.size() != 0 ? list.remove(0) : null;
        } else {
            UUID uUID = this.xs.rf(string);
            if (uUID == null) {
                return null;
            }
            Iterator<lr> iterator = list.iterator();
            while (iterator.hasNext()) {
                lr lr3 = iterator.next();
                if (!lr3.V().equals(uUID)) continue;
                lr2 = lr3;
                iterator.remove();
                break;
            }
        }
        return lr2;
    }

    @NotNull
    public oq ys() {
        return this.hA;
    }

    @NotNull
    public nn ex() {
        return this.xs;
    }

    public void uj(long l) {
        this.hB = l;
    }

    public boolean gy() {
        return System.currentTimeMillis() - this.hB < TimeUnit.SECONDS.toMillis(3L);
    }
}
