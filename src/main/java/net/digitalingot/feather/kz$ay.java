package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.mj;
import net.digitalingot.feather.interfaces.ra;

public class kz$ay
        extends zi {
    @de(vi = 0)
    public iv i = new iv("General");
    @au(wd = "mode", vu = "Mode", pr = "full", yp = @de(vi = 1))
    public ay j;
    @au(wd = "showSide", vu = "Show Side Only", pr = "false", yp = @de(vi = 2), nu = @ra(wd = "mode", ee = {"full"}))
    public boolean k;
    @au(wd = "fillColor", vu = "Fill Color", pr = "false/255/255/255/125", yp = @de(vi = 3))
    public gp l;
    @de(vi = 10)
    public iv m = new iv("Outline");
    @au(wd = "outlineThickness", vu = "Thickness", pr = "25", yp = @de(vi = 11))
    @mj(yu = 1)
    public int n;
    @au(wd = "outlineColor", vu = "Color", pr = "false/255/255/255", yp = @de(vi = 12))
    public gp o;
    @au(wd = "showAlways", vu = "Show always", pr = "true", yp = @de(vi = 13))
    public boolean p;

    public enum ay {
        NONE,
        OUTLINE,
        FULL

    }
}
