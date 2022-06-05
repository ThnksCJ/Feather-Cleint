package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ai;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ly
implements Comparable<ly> {
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="slug")
    @NotNull
    private final qc wf;
    @SerializedName(value="icon")
    @NotNull
    private final String icon;
    @SerializedName(value="description")
    @NotNull
    private final String vo;
    @SerializedName(value="renderMod")
    private final Boolean xe;
    @SerializedName(value="categories")
    @NotNull
    private final ay[] ts;
    @SerializedName(value="form")
    @NotNull
    private final List<ai> gk;

    public ly(@NotNull String string, @NotNull qc qc2, @NotNull String string2, @NotNull String string3, Boolean bl, @NotNull ay[] ayArray, @NotNull List<ai> list) {
        this.name = string;
        this.wf = qc2;
        this.icon = string2;
        this.vo = string3;
        this.xe = bl;
        this.ts = ayArray;
        this.gk = list;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public qc lg() {
        return this.wf;
    }

    @NotNull
    public String getIcon() {
        return this.icon;
    }

    @NotNull
    public String xm() {
        return this.vo;
    }

    public boolean fs() {
        return this.xe;
    }

    @NotNull
    public ay[] um() {
        return this.ts;
    }

    @NotNull
    public List<ai> li() {
        return this.gk;
    }

    public int ay(@NotNull ly ly2) {
        return this.name.compareTo(ly2.getName());
    }

    @Override
    public int compareTo(@NotNull Object object) {
        return this.ay((ly)object);
    }

    public enum ay {
        HUD,
        HYPIXEL,
        PVP

    }
}
