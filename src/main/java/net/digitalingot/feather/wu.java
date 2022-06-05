package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class wu
implements mu {
    @SerializedName(value="dataTypes")
    @NotNull
    private final String nm;
    @SerializedName(value="range")
    private final double[] ar;
    @SerializedName(value="step")
    @Nullable
    private final Double nz;

    public wu(double d, double d2, @Nullable Double d3) {
        this.nm = "decimal";
        this.ar = new double[]{d, d2};
        this.nz = d3;
    }

    @NotNull
    public String ft() {
        return this.nm;
    }

    public double[] bd() {
        return this.ar;
    }

    @Nullable
    public Double an() {
        return this.nz;
    }
}
