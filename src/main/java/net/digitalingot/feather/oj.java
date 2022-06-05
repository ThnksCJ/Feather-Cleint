package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public class oj
implements da {
    @SerializedName(value="selected")
    @NotNull
    private final UUID vx;
    @SerializedName(value="list")
    @NotNull
    private final List<ay> qb;

    public oj(@NotNull UUID uUID, @NotNull List<ay> list) {
        this.vx = uUID;
        this.qb = list;
    }

    @NotNull
    public UUID en() {
        return this.vx;
    }

    @NotNull
    public List<ay> tq() {
        return this.qb;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_ACCOUNT_LIST;
    }

    public static class ay {
        @SerializedName(value="mcID")
        @NotNull
        private final UUID hj;
        @SerializedName(value="mcUsername")
        @NotNull
        private final String hs;

        public static ay ay(vi.ay ay2) {
            return new ay(ay2.zx(), ay2.getName());
        }

        public ay(@NotNull UUID uUID, @NotNull String string) {
            this.hj = uUID;
            this.hs = string;
        }

        @NotNull
        public UUID ba() {
            return this.hj;
        }

        @NotNull
        public String yb() {
            return this.hs;
        }
    }
}
