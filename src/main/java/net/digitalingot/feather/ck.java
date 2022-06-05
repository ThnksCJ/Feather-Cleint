package net.digitalingot.feather;

import net.digitalingot.feather.enums.gi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ck {
    private static ck EY;
    @NotNull
    private final gi EZ;
    @NotNull
    private List<cr> xc = Collections.emptyList();
    private boolean Fa;

    public ck(@NotNull gi gi2) {
        this.EZ = gi2;
    }

    @Nullable
    public static ck oQ() {
        return EY;
    }

    @NotNull
    public static Optional<ck> oR() {
        return Optional.ofNullable(EY);
    }

    public static boolean oS() {
        return ck.oR().map(ck2 -> ck2.oT() == gi.HYPIXEL).orElse(false);
    }

    public static void ay(@Nullable ck ck2) {
        EY = ck2;
    }

    @NotNull
    public gi oT() {
        return this.EZ;
    }

    @NotNull
    public List<cr> cy() {
        return this.xc;
    }

    public void rl(@NotNull List<cr> list) {
        this.xc = Collections.unmodifiableList(list);
    }

    public boolean oU() {
        return this.Fa;
    }

    public void ja(boolean bl) {
        this.Fa = bl;
    }
}
