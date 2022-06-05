package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;

class ho$1 {
    static final int[] jh;

    static {
        jh = new int[ho.values().length];
        ho$1.jh[ho.TOP_RIGHT.ordinal()] = 1;
        ho$1.jh[ho.BOTTOM_RIGHT.ordinal()] = 2;
        ho$1.jh[ho.CENTER_RIGHT.ordinal()] = 3;
        ho$1.jh[ho.TOP_CENTER.ordinal()] = 4;
        ho$1.jh[ho.BOTTOM_CENTER.ordinal()] = 5;
        ho$1.jh[ho.BOTTOM_LEFT.ordinal()] = 6;
        ho$1.jh[ho.CENTER_LEFT.ordinal()] = 7;
    }
}
