package net.digitalingot.feather;

import net.digitalingot.feather.mixin.core.ed;
import net.digitalingot.feather.mods.impl.FPS;

public class dh$rf
        extends mo {
    public dh$rf() {
        super("FPS: ", " FPS");
    }

    @Override
    public Object so() {
        return ed.getFPS();
    }

    @Override
    public boolean gf() {
        return ((FPS.ay) ((FPS) FPS.this).vz).jR;
    }

    @Override
    public fw bt() {
        return ((FPS.ay) ((FPS) FPS.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
