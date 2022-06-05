package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ai;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ns
implements da {
    @SerializedName(value="tabs")
    @NotNull
    private final List<ay> jc;

    public ns(@NotNull List<ay> list) {
        this.jc = list;
    }

    @NotNull
    public List<ay> ke() {
        return this.jc;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.BUILD_SIDEBAR_SETTINGS;
    }

    public static class ay {
        @SerializedName(value="name")
        @NotNull
        private final String name;
        @SerializedName(value="slug")
        @NotNull
        private final qc wf;
        @SerializedName(value="sidebar")
        @NotNull
        private final String cf;
        @SerializedName(value="icon")
        @NotNull
        private final String icon;
        @SerializedName(value="description")
        @NotNull
        private final String vo;
        @SerializedName(value="form")
        @NotNull
        private final List<ai> gk;

        public ay(@NotNull String string, @NotNull qc qc2, @NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull List<ai> list) {
            this.name = string;
            this.wf = qc2;
            this.cf = string2;
            this.icon = string3;
            this.vo = string4;
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
        public String rm() {
            return this.cf;
        }

        @NotNull
        public String getIcon() {
            return this.icon;
        }

        @NotNull
        public String xm() {
            return this.vo;
        }

        @NotNull
        public List<ai> li() {
            return this.gk;
        }
    }
}
