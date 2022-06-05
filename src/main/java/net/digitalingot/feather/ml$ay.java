package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class ml$ay {
    @SerializedName(value="slug")
    @NotNull
    private final String slug;
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="icon")
    @NotNull
    private final String icon;

    public ml$ay(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        this.slug = string;
        this.name = string2;
        this.icon = string3;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getIcon() {
        return this.icon;
    }
}
