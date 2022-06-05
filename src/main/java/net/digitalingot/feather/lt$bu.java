package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;

import java.awt.*;

public class lt$bu
extends zi {
    @fl(yp=@de(vi=0))
    @cy(yv= ho.BOTTOM_CENTER, dz=126.0, ev=-2.5)
    public ci iO;
    @de(vi=10)
    public iv oU = new iv("Keystrokes");
    @au(wd="clicksDisplayMode", vu="Clicks Display Mode", pr="names", yp=@de(vi=11))
    public rf oV;
    @au(wd="jumpDisplayMode", vu="Jump Display Mode", pr="arrows", yp=@de(vi=12))
    public rf oW;
    @au(wd="keysDisplayMode", vu="Keys Display Mode", pr="names", yp=@de(vi=13))
    public rf oX;
    @au(wd="fadeTime", vu="Fade Time", pr="300", yp=@de(vi=14))
    @in(lf=2500.0)
    public double oY;
    @de(vi=20)
    public iv oZ = new iv("CPS");
    @au(wd="cpsDisplayMode", vu="Display Mode", pr="separate", yp=@de(vi=21))
    public ay pe;
    @au(wd="cpsDigits", vu="Digits", yp=@de(vi=22))
    @mj(js=2)
    public int px = 0;
    @au(wd="cpsReversed", vu="Reversed Text", yp=@de(vi=23))
    public boolean py;
    @de(vi=30)
    public iv lB = new iv("Colors");
    @au(wd="backgroundColor", vu="Background", pr="7/7/7/146", yp=@de(vi=31))
    public Color kv;
    @au(wd="backgroundActiveColor", vu="Background Active", pr="255/255/255/53", yp=@de(vi=32))
    public Color pA;
    @au(wd="textColor", vu="Text Color", pr="false/255/255/255/255", yp=@de(vi=33))
    public gp sa;
    @au(wd="textActiveColor", vu="Text Active", pr="false/0/145/237", yp=@de(vi=34))
    public gp pB;
    @au(wd="textShadow", vu="Text Shadow", pr="false", yp=@de(vi=35))
    public boolean ki;

    public enum rf {
        NONE,
        NAMES,
        ARROWS

    }

    public enum ay {
        NONE,
        WITH_CLICKS,
        SEPARATE

    }
}
