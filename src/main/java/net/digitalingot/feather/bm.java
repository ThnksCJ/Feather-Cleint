package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class bm
        implements da {
    @SerializedName(value = "selected")
    @NotNull
    private final String pn;
    @SerializedName(value = "list")
    @NotNull
    private final List<String> zo;

    public bm(@NotNull String string, @NotNull List<String> list) {
        this.pn = string;
        this.zo = list;
    }

    @NotNull
    public String cg() {
        return this.pn;
    }

    @NotNull
    public List<String> hx() {
        return this.zo;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_MOD_PROFILE_LIST;
    }
}
