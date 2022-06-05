package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.mods.impl.Waypoints;
import net.digitalingot.featherserverapi.proto.models.Waypoint;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public class cr {
    @SerializedName(value="name")
    @NotNull
    private String name;
    @SerializedName(value="toggled")
    private boolean dN;
    @SerializedName(value="color")
    @NotNull
    private gp as;
    @SerializedName(value="server")
    @Nullable
    private String Bd;
    @SerializedName(value="world")
    private String Be;
    @SerializedName(value="location")
    @NotNull
    private ay kr;

    public cr(@NotNull String string, boolean bl, @NotNull gp gp2, @NotNull ay ay2) {
        this.name = string;
        this.dN = bl;
        this.as = gp2;
        this.kr = ay2;
    }

    public boolean ay(@NotNull Waypoints ys2) {
        String string = ys2.G();
        if (string == null) {
            return false;
        }
        if (!string.equals(this.Be)) {
            return false;
        }
        String string2 = ys2.H();
        if (string2 == null) {
            return true;
        }
        return string2.equals(this.Bd);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public void do(@NotNull String string) {
        this.name = string;
    }

    public void nw(boolean bl) {
        this.dN = bl;
    }

    public boolean B() {
        return this.dN;
    }

    public void rf(@NotNull gp gp2) {
        this.as = gp2;
    }

    @NotNull
    public gp ra() {
        return this.as;
    }

    public void ve(@Nullable String string) {
        this.Bd = string;
    }

    @Nullable
    public String C() {
        return this.Bd;
    }

    public void lm(String string) {
        this.Be = string;
    }

    public String D() {
        return this.Be;
    }

    public void ay(@NotNull ay ay2) {
        this.kr = ay2;
    }

    @NotNull
    public ay de() {
        return this.kr;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cr cr2 = (cr)object;
        return this.name.equals(cr2.name);
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    @NotNull
    public static cr ay(@NotNull Waypoint waypoint) {
        return new cr(waypoint.getName(), true, gp.ay(waypoint.getColor()), ay.ay(waypoint.getLocation()));
    }

    public static class ay {
        @SerializedName(value="x")
        private final int cj;
        @SerializedName(value="y")
        private final int va;
        @SerializedName(value="z")
        private final int Bf;

        public ay(int n, int n2, int n3) {
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
        public static ay ay(@NotNull Waypoint.Location location) {
            return new ay(location.getX(), location.getY(), location.getZ());
        }
    }
}
