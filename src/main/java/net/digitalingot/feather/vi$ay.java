package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.UUID;

public class vi$ay {
    @SerializedName(value = "email")
    private final String eR;
    @SerializedName(value = "uuid")
    private final UUID hj;
    @SerializedName(value = "name")
    private final String name;
    @SerializedName(value = "authToken")
    private final String eS;

    public vi$ay(String string, UUID uUID, String string2, String string3) {
        this.eR = string;
        this.hj = uUID;
        this.name = string2;
        this.eS = string3;
    }

    public String th() {
        return this.eR;
    }

    public UUID zx() {
        return this.hj;
    }

    public String getName() {
        return this.name;
    }

    public String wr() {
        return this.eS;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        vi$ay ay2 = (vi$ay) object;
        return Objects.equals(this.eR, ay2.eR) && Objects.equals(this.hj, ay2.hj) && Objects.equals(this.name, ay2.name) && Objects.equals(this.eS, ay2.eS);
    }

    public int hashCode() {
        return Objects.hash(this.eR, this.hj, this.name, this.eS);
    }
}
