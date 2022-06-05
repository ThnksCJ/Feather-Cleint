package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Keystrokes;

class lt$1 {
    static final int[] nY;
    static final int[] nZ;
    static final int[] oA;

    static {
        oA = new int[Keystrokes.sd.values().length];
        lt$1.oA[Keystrokes.sd.FORWARD.ordinal()] = 1;
        lt$1.oA[Keystrokes.sd.LEFT.ordinal()] = 2;
        lt$1.oA[Keystrokes.sd.BACK.ordinal()] = 3;
        lt$1.oA[Keystrokes.sd.RIGHT.ordinal()] = 4;
        lt$1.oA[Keystrokes.sd.JUMP.ordinal()] = 5;
        lt$1.oA[Keystrokes.sd.ATTACK.ordinal()] = 6;
        lt$1.oA[Keystrokes.sd.USE.ordinal()] = 7;
        nZ = new int[Keystrokes.bu.rf.values().length];
        lt$1.nZ[Keystrokes.bu.rf.NAMES.ordinal()] = 1;
        lt$1.nZ[Keystrokes.bu.rf.ARROWS.ordinal()] = 2;
        nY = new int[Keystrokes.bu.ay.values().length];
        lt$1.nY[Keystrokes.bu.ay.WITH_CLICKS.ordinal()] = 1;
        lt$1.nY[Keystrokes.bu.ay.SEPARATE.ordinal()] = 2;
    }
}
