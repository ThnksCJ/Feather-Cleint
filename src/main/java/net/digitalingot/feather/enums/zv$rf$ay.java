package net.digitalingot.feather.enums;

import net.digitalingot.feather.je;

public enum zv$rf$ay {
    EVERYONE,
    PARTY_ONLY;


    public je.ay toCapnProto() {
        switch (zv.1.yF[this.ordinal()]) {
            case 1: {
                return je.ay.EVERYONE;
            }
            case 2: {
                return je.ay.PARTY_ONLY;
            }
        }
        throw new IllegalArgumentException();
    }
}
