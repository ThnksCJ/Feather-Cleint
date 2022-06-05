package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class os {
    @SerializedName(value="slug")
    @NotNull
    private final String slug;
    @SerializedName(value="name")
    @NotNull
    private final String name;

    public os(@NotNull String string, @NotNull String string2) {
        this.slug = string;
        this.name = string2;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }

    @NotNull
    public String getName() {
        return this.name;
    }
}
