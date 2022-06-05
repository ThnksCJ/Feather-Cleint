package net.digitalingot.feather.enums;

import net.digitalingot.feather.fp;
import net.digitalingot.feather.mods.impl.Keystrokes;

enum lt$sd {
    FORWARD(Keystrokes.uj.THIRD, "W", "+"),
    LEFT(Keystrokes.uj.THIRD, "A", "<"),
    BACK(Keystrokes.uj.THIRD, "S", "-"),
    RIGHT(Keystrokes.uj.THIRD, "D", ">"),
    JUMP(Keystrokes.uj.FULL, "JUMP", ""),
    CPS(Keystrokes.uj.FULL, "", ""),
    ATTACK(Keystrokes.uj.HALF, "LMB", "<--"),
    USE(Keystrokes.uj.HALF, "RMB", "-->");

    private final Keystrokes.uj bounds;
    private final String name;
    private final int nameWidth;
    private final String arrow;
    private final int arrowWidth;

    lt$sd(Keystrokes.uj uj2, String string2, String string3) {
        this.bounds = uj2;
        this.name = string2;
        this.nameWidth = fp.mq(string2);
        this.arrow = string3;
        this.arrowWidth = fp.mq(string3);
    }

    private String getText(Keystrokes.bu bu2) {
        switch (Keystrokes .1.nZ[this.getDisplayMode(bu2).ordinal()]) {
            case 1: {
                return this.name;
            }
            case 2: {
                return this.arrow;
            }
        }
        return null;
    }

    private int getTextWidth(Keystrokes.bu bu2) {
        switch (Keystrokes .1.nZ[this.getDisplayMode(bu2).ordinal()]) {
            case 1: {
                return this.nameWidth;
            }
            case 2: {
                return this.arrowWidth;
            }
        }
        return 0;
    }

    private Keystrokes.bu.rf getDisplayMode(Keystrokes.bu bu2) {
        switch (Keystrokes .1.oA[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return bu2.oX;
            }
            case 5: {
                return bu2.oW;
            }
            case 6: 
            case 7: {
                return bu2.oV;
            }
        }
        throw new AssertionError();
    }

    static String access$2900(lt$sd sd2, Keystrokes.bu bu2) {
        return sd2.getText(bu2);
    }

    static Keystrokes.uj access$3000(lt$sd sd2) {
        return sd2.bounds;
    }

    static int access$3400(lt$sd sd2, Keystrokes.bu bu2) {
        return sd2.getTextWidth(bu2);
    }
}
