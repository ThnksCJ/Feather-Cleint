package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ai;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class kn {
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="slug")
    @NotNull
    private final String slug;
    @SerializedName(value="icon")
    @NotNull
    private final String icon;
    @SerializedName(value="category")
    @NotNull
    private final sb.ay yw;
    @SerializedName(value="form")
    @Nullable
    private final List<ai> gk;

    public kn(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull sb.ay ay2, @Nullable List<ai> list) {
        this.name = string;
        this.slug = string2;
        this.icon = string3;
        this.yw = ay2;
        this.gk = list;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }

    @NotNull
    public String getIcon() {
        return this.icon;
    }

    @NotNull
    public sb.ay jo() {
        return this.yw;
    }

    @Nullable
    public List<ai> li() {
        return this.gk;
    }
}
