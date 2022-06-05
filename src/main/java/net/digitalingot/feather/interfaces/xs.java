package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.nw;
import net.digitalingot.feather.sb;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public interface xs {
    void ay(UUID var1, nw var2);

    void rf(List<ay> var1);

    class ay {
        @NotNull
        private final UUID hj;
        @NotNull
        private final List<sb> it;

        public ay(@NotNull UUID uUID, @NotNull List<sb> list) {
            this.hj = uUID;
            this.it = list;
        }

        @NotNull
        public UUID zx() {
            return this.hj;
        }

        @NotNull
        public List<sb> hl() {
            return this.it;
        }
    }
}
