package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Voice;

class zv$1 {
    static final int[] yF;

    static {
        yF = new int[Voice.rf.ay.values().length];
        zv$1.yF[Voice.rf.ay.EVERYONE.ordinal()] = 1;
        zv$1.yF[Voice.rf.ay.PARTY_ONLY.ordinal()] = 2;
    }
}
