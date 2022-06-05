package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class en
        implements da {
    @SerializedName(value = "channel")
    @NotNull
    private final ay ay;

    public en(@NotNull ay ay2) {
        this.ay = ay2;
    }

    @NotNull
    public ay rf() {
        return this.ay;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CALLBACK;
    }

    public enum ay {
        IDE(4),
        DEVELOPMENT(3),
        BETA(2),
        RELEASE(1);

        private final int priority;

        ay(int n2) {
            this.priority = n2;
        }

        public int getPriority() {
            return this.priority;
        }
    }
}
