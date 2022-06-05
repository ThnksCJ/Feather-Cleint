package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public abstract class xu {
    @NotNull
    protected final nn xs;
    @NotNull
    protected final gk hG;
    @NotNull
    protected final rt hC;
    @NotNull
    private final ay hH;

    protected xu(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        this(nn2, rt2, gk2, ay.NONE);
    }

    protected xu(@NotNull nn nn2, @NotNull rt rt2, @NotNull gk gk2, @NotNull ay ay2) {
        this.xs = nn2;
        this.hC = rt2;
        this.hG = gk2;
        this.hH = ay2;
    }

    public abstract void ay(EntityPlayerSP var1, String[] var2);

    @NotNull
    public ay wc() {
        return this.hH;
    }

    public enum ay {
        NONE,
        NOT_IN_PARTY,
        IN_PARTY,
        LEADER

    }
}
