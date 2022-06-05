package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.jt;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class tp
implements da {
    @SerializedName(value="pages")
    @NotNull
    private final List<jt> jy;

    public tp(@NotNull List<jt> list) {
        this.jy = list;
    }

    @NotNull
    public List<jt> ai() {
        return this.jy;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.PAGE_UPDATE;
    }
}
