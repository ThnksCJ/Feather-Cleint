package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.ComboDisplay;

public class bf$rf
extends mo {
    @Override
    public Object so() {
        if (ComboDisplay.this.jO == 0) {
            return "No Combo";
        }
        return ((ComboDisplay.ay)((ComboDisplay) ComboDisplay.this).vz).jR ? "Combo: " + ComboDisplay.this.jO : ComboDisplay.this.jO + " Combo";
    }

    @Override
    public boolean gf() {
        return ((ComboDisplay.ay)((ComboDisplay) ComboDisplay.this).vz).jR;
    }

    @Override
    public fw bt() {
        return ((ComboDisplay.ay)((ComboDisplay) ComboDisplay.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
