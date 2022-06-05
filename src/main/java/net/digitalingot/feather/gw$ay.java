package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

class gw$ay {
    @NotNull
    private final gw.rf ys;
    private final int id;

    gw$ay(@NotNull gw.rf rf2, int n) {
        this.ys = rf2;
        this.id = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        gw$ay ay2 = (gw$ay) object;
        return this.id == ay2.id && this.ys == ay2.ys;
    }

    public int hashCode() {
        return Objects.hash(this.ys, this.id);
    }
}
