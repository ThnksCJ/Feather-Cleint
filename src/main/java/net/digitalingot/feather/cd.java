package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.qc;

import java.util.List;

public class cd {
    @SerializedName(value="compact")
    private Boolean ya;
    @SerializedName(value="favorites")
    private Boolean xq;
    @SerializedName(value="favoriteMods")
    private List<qc> ha;
    @SerializedName(value="renderMods")
    private List<qc> hg;
    @SerializedName(value="modPreview")
    private Boolean ad;
    @SerializedName(value="modPreviewImage")
    private String zd;

    public cd(boolean bl, boolean bl2, List<qc> list, List<qc> list2, boolean bl3, String string) {
        this.ya = bl;
        this.xq = bl2;
        this.ha = list;
        this.hg = list2;
        this.ad = bl3;
        this.zd = string;
    }

    public Boolean ly() {
        return this.ya;
    }

    public void ay(Boolean bl) {
        this.ya = bl;
    }

    public Boolean xy() {
        return this.xq;
    }

    public void rf(Boolean bl) {
        this.xq = bl;
    }

    public List<qc> zh() {
        return this.ha;
    }

    public void bu(List<qc> list) {
        this.ha = list;
    }

    public List<qc> ni() {
        return this.hg;
    }

    public void kl(List<qc> list) {
        this.hg = list;
    }

    public Boolean md() {
        return this.ad;
    }

    public void uj(Boolean bl) {
        this.ad = bl;
    }

    public String sr() {
        return this.zd;
    }

    public void sb(String string) {
        this.zd = string;
    }
}
