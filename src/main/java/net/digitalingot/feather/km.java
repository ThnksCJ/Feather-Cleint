package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.StringJoiner;

public class km {
    @SerializedName(value="keys")
    private final int[] ry;

    public km(int[] nArray) {
        this.ry = Arrays.stream(nArray).boxed().sorted(new db()).mapToInt(n -> n).toArray();
    }

    @NotNull
    public String getName() {
        StringJoiner stringJoiner = new StringJoiner(" + ");
        for (int n : this.ry) {
            stringJoiner.add(fz.oh(n).getName());
        }
        return stringJoiner.toString();
    }

    public boolean xj() {
        if (this.ry.length == 0) {
            return false;
        }
        for (int n : this.ry) {
            if (n == 0 || !(n >= 100000 ? !dv.wz(n - 100001) : !bu.ay(n))) continue;
            return false;
        }
        return true;
    }

    public int[] zy() {
        return this.ry;
    }
}
