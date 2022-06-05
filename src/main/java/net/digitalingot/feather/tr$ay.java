package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.mj;

import java.awt.*;

public class tr$ay
        extends zi {
    @de(vi = 0)
    public iv hM = new iv("Crosshair");
    @au(wd = "type", vu = "Type", pr = "cross", yp = @de(vi = 1))
    public ay hN;
    @au(wd = "size", vu = "Size", pr = "5", yp = @de(vi = 2))
    @mj(js = 50)
    public int size;
    @au(wd = "gap", vu = "Gap", pr = "3", yp = @de(vi = 3))
    @mj(js = 50)
    public int hO;
    @au(wd = "thickness", vu = "Thickness", pr = "1", yp = @de(vi = 4))
    @mj(yu = 1, js = 50)
    public int hP;
    @au(wd = "color", vu = "Color", pr = "false/255/255/255/255", yp = @de(vi = 5))
    public gp as;
    @de(vi = 10)
    public iv hQ = new iv("Dot");
    @au(wd = "dot", vu = "Dot", yp = @de(vi = 11))
    public boolean hR;
    @au(wd = "dotColor", vu = "Dot Color", pr = "255/255/255/255", yp = @de(vi = 12))
    public Color hS;
    @de(vi = 20)
    public iv hT = new iv("Outline");
    @au(wd = "outline", vu = "Outline", pr = "true", yp = @de(vi = 21))
    public boolean hU;
    @au(wd = "outlineThickness", vu = "Thickness", pr = "1", yp = @de(vi = 22))
    @mj(yu = 1, js = 50)
    public int n;
    @au(wd = "outlineColor", vu = "Color", pr = "0/0/0/255", yp = @de(vi = 23))
    public Color hV;

    @Override
    public Boolean ir() {
        return true;
    }

    public enum ay {
        CROSS,
        CIRCLE,
        SQUARE,
        DEFAULT,
        ARROW

    }
}
