package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qd;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class td
implements da {
    @SerializedName(value="main")
    private final List<fm> rw;
    @SerializedName(value="header")
    private final List<qd> ah;

    public td(@NotNull List<fm> list, @NotNull List<qd> list2) {
        this.rw = list;
        this.ah = list2;
    }

    @NotNull
    public List<fm> bm() {
        return this.rw;
    }

    @NotNull
    public List<qd> ji() {
        return this.ah;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_HOMEPAGE_SELECTIONS;
    }
}
