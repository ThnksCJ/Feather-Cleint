package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.init.Blocks;

@sv(aw= qc.CLEAR_WATER, jf=@bx(vu="Clear Water", jm="https://assets.feathercdn.net/game/mods/clearwater.svg", mz="Removes fog underwater so you can see clearer", lq={}))
public class ClearWater
extends Mod<ay> {
    private float I;
    private float J;

    @Override
    public void initialize() {
        mi.bo.ay((block, f) -> {
            if (this.gc()) {
                if (((ay)this.vz).O && block == Blocks.WATER) {
                    return Float.valueOf(this.I);
                }
                if (((ay)this.vz).L && block == Blocks.LAVA) {
                    return Float.valueOf(this.J);
                }
            }
            return null;
        });
    }

    @Override
    public void zq() {
        this.I = ClearWater.dl(((ay)this.vz).P);
        this.J = ClearWater.dl(((ay)this.vz).M);
    }

    private static float dl(int n) {
        return (float)n * 0.2f / 100.0f;
    }

    public static class ay
    extends zi {
        @de(vi=0)
        public iv K = new iv("Lava");
        @au(wd="lava", vu="Lava", yp=@de(vi=1))
        public boolean L;
        @au(wd="fogDensityLava", vu="Fog Density", nu=@ra(wd="lava"), yp=@de(vi=2))
        @mj
        public int M;
        @de(vi=10)
        public iv N = new iv("Water");
        @au(wd="water", vu="Water", pr="true", yp=@de(vi=11))
        public boolean O;
        @au(wd="fogDensityWater", vu="Fog Density", nu=@ra(wd="water"), yp=@de(vi=12))
        @mj
        public int P;
    }
}
