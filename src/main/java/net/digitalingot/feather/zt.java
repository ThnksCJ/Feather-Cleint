package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class zt
        implements da {
    @SerializedName(value = "categories")
    @NotNull
    private final sb.ay[] ky = sb.ay.values();
    @SerializedName(value = "cosmetics")
    @NotNull
    private final List<kn> it;

    public zt(@NotNull List<kn> list) {
        this.it = list;
    }

    @NotNull
    public sb.ay[] ax() {
        return this.ky;
    }

    @NotNull
    public List<kn> hl() {
        return this.it;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.BUILD_COSMETICS_MENU;
    }
}
