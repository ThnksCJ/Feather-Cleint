package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class sh
implements da {
    @SerializedName(value="settings")
    @NotNull
    private final Map<String, oh> gs;
    @SerializedName(value="equipped")
    @NotNull
    private final Map<sb.ay, String> dv;

    public sh(@NotNull Map<String, oh> map, @NotNull Map<sb.ay, String> map2) {
        this.gs = map;
        this.dv = map2;
    }

    @NotNull
    public Map<String, oh> ab() {
        return this.gs;
    }

    @NotNull
    public Map<sb.ay, String> hw() {
        return this.dv;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_COSMETICS_SETTINGS;
    }
}
