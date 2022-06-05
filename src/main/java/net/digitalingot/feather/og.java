package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class og {
    @SerializedName(value = "field")
    @NotNull
    private final String si;
    @SerializedName(value = "values")
    @Nullable
    private final List<String> jn;

    public og(@NotNull String string, @Nullable List<String> list) {
        this.si = string;
        this.jn = list;
    }

    @NotNull
    public String sv() {
        return this.si;
    }

    @Nullable
    public List<String> ux() {
        return this.jn;
    }
}
