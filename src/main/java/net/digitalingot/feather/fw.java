package net.digitalingot.feather;

import net.digitalingot.feather.enums.ic;
import net.digitalingot.feather.interfaces.*;

import java.awt.*;

public class fw
        extends ci {
    @wv
    @de(vi = 0)
    public iv cq = new iv("Style");
    @wv
    @au(wd = "backgroundColor", vu = "Background", pr = "7/7/7/146", nu = @ra(wd = "displayMode", ee = {"background"}), yp = @de(vi = 2))
    public Color kv;
    @wv
    @au(wd = "backgroundWidth", vu = "Background Width", pr = "60", nu = @ra(wd = "displayMode", ee = {"background"}), yp = @de(vi = 3))
    @mj(yu = 40, js = 70)
    public int jd;
    @wv
    @au(wd = "backgroundHeight", vu = "Background Height", pr = "20", nu = @ra(wd = "displayMode", ee = {"background"}), yp = @de(vi = 4))
    @mj(yu = 10, js = 25)
    public int nd;
    @wv
    @au(wd = "border", vu = "Border", pr = "false", yp = @de(vi = 7), nu = @ra(wd = "displayMode", ee = {"background"}))
    public boolean pi;
    @wv
    @au(wd = "borderColor", vu = "Border Color", pr = "75/75/75/255", nu = @ra(wd = "border"), yp = @de(vi = 8))
    public Color hi;
    @wv
    @au(wd = "borderThickness", vu = "Border Thickness", pr = "25", nu = @ra(wd = "border"), yp = @de(vi = 9))
    @mj(yu = 1)
    public int xt;
    @wv
    @au(wd = "displayMode", vu = "Display Mode", pr = "background", yp = @de(vi = 1))
    public ic cu;
    @wv
    @au(wd = "textColor", vu = "Text", pr = "false/255/255/255", yp = @de(vi = 10))
    public gp sa;
    @wv
    @au(wd = "textShadow", vu = "Text Shadow", pr = "false", yp = @de(vi = 11))
    public boolean ki;
}
