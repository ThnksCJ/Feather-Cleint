package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;

@sv(aw = qc.ITEM_PHYSIC, jf = @bx(vu = "Item Physic", jm = "https://assets.feathercdn.net/game/mods/itemphysic.svg", mz = "", lq = {}))
public class vy
        extends Mod<ay> {
    private final vg wM = new vg(this);

    public vg za() {
        return this.wM;
    }

    public static class ay
            extends zi {
        @au(wd = "rotateSpeed", vu = "Rotate Speed", pr = "10", yp = @de(vi = 0))
        @mj
        public int wN;
    }
}
