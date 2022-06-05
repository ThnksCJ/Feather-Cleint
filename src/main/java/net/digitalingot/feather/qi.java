package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class qi {
    @SerializedName(value = "favorites")
    private List<String> gg;
    @SerializedName(value = "lastUsed")
    private List<String> re;

    public qi(List<String> list, List<String> list2) {
        this.gg = list;
        this.re = list2;
    }

    public List<String> nc() {
        return this.gg;
    }

    public void zz(List<String> list) {
        this.gg = list;
    }

    public List<String> yh() {
        return this.re;
    }

    public void sd(List<String> list) {
        this.re = list;
    }
}
