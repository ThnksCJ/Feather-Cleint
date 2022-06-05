package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public abstract class zi {
    @au(wd="hudSelection", vu="Hud Selection", pr="true", yp=@de(vi=-2))
    public boolean vk;
    @au(wd="enabled", vu="Enabled", yp=@de(vi=-10))
    public transient boolean enabled;
    @SerializedName(value="favorite")
    public transient boolean bc;
    @SerializedName(value="canRenderMod")
    public transient boolean us;

    public boolean nv() {
        return this.enabled;
    }

    public Boolean ir() {
        return this.us ? null : Boolean.valueOf(false);
    }

    public boolean ns() {
        return this.bc;
    }
}
