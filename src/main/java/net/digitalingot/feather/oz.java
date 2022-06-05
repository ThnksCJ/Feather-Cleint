package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class oz
        implements da {
    @SerializedName(value = "mod")
    public qc qr;
    @SerializedName(value = "hudEditButton")
    private boolean zp;

    public oz(qc qc2, boolean bl) {
        this.qr = qc2;
        this.zp = bl;
    }

    public qc lb() {
        return this.qr;
    }

    public boolean os() {
        return this.zp;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.OPEN_FEATHER_MODS;
    }
}
