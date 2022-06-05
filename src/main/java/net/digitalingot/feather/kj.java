package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class kj
        implements da {
    @SerializedName(value = "level")
    private double qg;

    public kj(double d) {
        this.qg = d;
    }

    public double yz() {
        return this.qg;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.SET_SCALE_PERCENTAGE;
    }
}
