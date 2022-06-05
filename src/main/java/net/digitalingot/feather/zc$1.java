package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.ArmorStatus;

class zc$1 {
    static final int[] iH;
    static final int[] iI;
    static final int[] iJ;

    static {
        iJ = new int[ArmorStatus.ay.rf.values().length];
        zc$1.iJ[ArmorStatus.ay.rf.LEFT.ordinal()] = 1;
        zc$1.iJ[ArmorStatus.ay.rf.RIGHT.ordinal()] = 2;
        iI = new int[ArmorStatus.ay.ay.values().length];
        zc$1.iI[ArmorStatus.ay.ay.VALUE.ordinal()] = 1;
        zc$1.iI[ArmorStatus.ay.ay.PERCENT.ordinal()] = 2;
        iH = new int[ArmorStatus.ay.uj.values().length];
        zc$1.iH[ArmorStatus.ay.uj.VERTICAL.ordinal()] = 1;
        zc$1.iH[ArmorStatus.ay.uj.HORIZONTAL.ordinal()] = 2;
    }
}
