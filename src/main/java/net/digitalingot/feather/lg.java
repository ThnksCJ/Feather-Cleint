package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.interfaces.mu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class lg
        implements mu {
    @SerializedName(value = "dataType")
    @NotNull
    private final String nm;
    @SerializedName(value = "range")
    private final int[] vm;
    @SerializedName(value = "step")
    @Nullable
    private final Integer eb;

    public lg(int n, int n2, @Nullable Integer n3) {
        this.nm = "int";
        this.vm = new int[]{n, n2};
        this.eb = n3;
    }

    @NotNull
    public String ft() {
        return this.nm;
    }

    public int[] ej() {
        return this.vm;
    }

    @Nullable
    public Integer bx() {
        return this.eb;
    }
}
