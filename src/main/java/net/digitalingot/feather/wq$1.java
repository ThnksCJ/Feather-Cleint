package net.digitalingot.feather;

import net.digitalingot.feather.enums.li;
import net.digitalingot.feather.enums.qd;

class wq$1 {
    static final int[] bl;
    static final int[] vf;
    static final int[] lw;

    static {
        lw = new int[li.values().length];
        wq$1.lw[li.HUD_EDITOR.ordinal()] = 1;
        vf = new int[qd.values().length];
        wq$1.vf[qd.MC_SETTINGS.ordinal()] = 1;
        wq$1.vf[qd.REALMS.ordinal()] = 2;
        wq$1.vf[qd.REPLAY_MOD.ordinal()] = 3;
        bl = new int[fm.values().length];
        wq$1.bl[fm.SINGLEPLAYER.ordinal()] = 1;
        wq$1.bl[fm.MULTIPLAYER.ordinal()] = 2;
        wq$1.bl[fm.COSMETICS.ordinal()] = 3;
        wq$1.bl[fm.QUIT_GAME.ordinal()] = 4;
    }
}
