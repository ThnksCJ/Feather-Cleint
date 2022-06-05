package net.digitalingot.feather;

import java.awt.*;

public class qp$ay
extends zi {
    @de(vi=0)
    public iv i = new iv("General");
    @au(wd="shinyPots", vu="Shiny Pots", yp=@de(vi=1))
    public boolean hY;
    @de(vi=10)
    public iv hZ = new iv("Armor");
    @au(wd="mode", vu="Mode", pr="defaultColor", yp=@de(vi=11))
    public ay iA;
    @au(wd="armorColor", vu="Color", pr="128/64/204", nu=@ra(wd="mode", ee={"customColor"}), yp=@de(vi=12))
    public Color iB;
    @de(vi=20)
    public iv iC = new iv("Item");
    @au(wd="item", vu="Mode", pr="defaultColor", yp=@de(vi=21))
    public ay iD = ay.DEFAULT_COLOR;
    @au(wd="itemColor", vu="Color", pr="128/64/204", nu=@ra(wd="item", ee={"customColor"}), yp=@de(vi=22))
    public Color iE;

    public enum ay {
        OFF,
        DEFAULT_COLOR,
        CUSTOM_COLOR,
        CHROMA

    }
}
