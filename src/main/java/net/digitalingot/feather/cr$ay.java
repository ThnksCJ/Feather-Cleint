package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.Waypoint;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class cr$ay {
    @SerializedName(value="x")
    private final int cj;
    @SerializedName(value="y")
    private final int va;
    @SerializedName(value="z")
    private final int Bf;

    public cr$ay(int n, int n2, int n3) {
        this.cj = n;
        this.va = n2;
        this.Bf = n3;
    }

    public double nl(@NotNull Entity entity) {
        double d = (double)this.cj - entity.prevPosX;
        double d2 = (double)this.va - entity.prevPosY;
        double d3 = (double)this.Bf - entity.prevPosZ;
        return Math.sqrt(d * d + d2 * d2 + d3 * d3);
    }

    public int kk() {
        return this.cj;
    }

    public int tp() {
        return this.va;
    }

    public int E() {
        return this.Bf;
    }

    @NotNull
    public static cr$ay ay(@NotNull Waypoint.Location location) {
        return new cr$ay(location.getX(), location.getY(), location.getZ());
    }
}
