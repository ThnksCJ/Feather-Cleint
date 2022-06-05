package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bb
implements da {
    @SerializedName(value="settings")
    @Nullable
    private final ay uv;
    @SerializedName(value="equipped")
    @Nullable
    private final rf iz;

    public bb(@Nullable ay ay2, @Nullable rf rf2) {
        this.uv = ay2;
        this.iz = rf2;
    }

    @Nullable
    public ay qi() {
        return this.uv;
    }

    @Nullable
    public rf qd() {
        return this.iz;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.UPDATE_COSMETICS;
    }
}
