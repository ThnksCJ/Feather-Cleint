package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ml
implements da {
    @SerializedName(value="choices")
    @NotNull
    private final Map<Integer, ay> bn;

    public ml(@NotNull Map<Integer, ay> map) {
        this.bn = map;
    }

    @NotNull
    public Map<Integer, ay> il() {
        return this.bn;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_HUD_SELECTION;
    }

    public static class ay {
        @SerializedName(value="slug")
        @NotNull
        private final String slug;
        @SerializedName(value="name")
        @NotNull
        private final String name;
        @SerializedName(value="icon")
        @NotNull
        private final String icon;

        public ay(@NotNull String string, @NotNull String string2, @NotNull String string3) {
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
}
