package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

public class up
implements da {
    @SerializedName(value="mod")
    @NotNull
    private final qc jq;
    @SerializedName(value="box")
    @NotNull
    private final ay gt;

    public up(@NotNull qc qc2, @NotNull ay ay2) {
        this.jq = qc2;
        this.gt = ay2;
    }

    @NotNull
    public qc jt() {
        return this.jq;
    }

    @NotNull
    public ay gr() {
        return this.gt;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.RENDER_MOD;
    }
}
