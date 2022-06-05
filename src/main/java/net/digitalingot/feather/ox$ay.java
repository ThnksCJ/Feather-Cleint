package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;

public class ox$ay
extends zi {
    @de(vi=10)
    public iv mD = new iv("Item Counter");
    @au(wd="displayMode", vu="Display Mode", pr="horizontal", yp=@de(vi=11))
    public ay mE;
    @au(wd="textAlignment", vu="Text Alignment", pr="top", yp=@de(vi=12))
    public rf mF;
    @fl(yp=@de(vi=20))
    @cy(yv= ho.BOTTOM_CENTER, dz=151.0)
    public ju mG;
    @de(vi=30)
    public iv mH = new iv("Arrows");
    @au(wd="arrows", vu="Arrows", pr="true", yp=@de(vi=31))
    public boolean mI;
    @au(wd="arrowsColor", vu="Color", nu=@ra(wd="arrows"), yp=@de(vi=32))
    public gp mJ;
    @de(vi=40)
    public iv mK = new iv("Food");
    @au(wd="food", vu="Food", pr="true", yp=@de(vi=41))
    public boolean mL;
    @au(wd="foodColor", vu="Color", nu=@ra(wd="food"), yp=@de(vi=42))
    public gp mM;
    @de(vi=50)
    public iv mN = new iv("Potions");
    @au(wd="potions", vu="Potions", pr="true", yp=@de(vi=51))
    public boolean mO;
    @au(wd="potionsColor", vu="Color", nu=@ra(wd="potions"), yp=@de(vi=52))
    public gp mP;
    @de(vi=60)
    public iv mQ = new iv("Golden Apples");
    @au(wd="goldenApples", vu="Golden Apples", pr="true", yp=@de(vi=61))
    public boolean mR;
    @au(wd="goldenApplesColor", vu="Color", nu=@ra(wd="goldenApples"), yp=@de(vi=62))
    public gp mS;
    @de(vi=70)
    public iv mT = new iv("God Apples");
    @au(wd="godApples", vu="God Apples", pr="true", yp=@de(vi=71))
    public boolean mU;
    @au(wd="godApplesColor", vu="Color", nu=@ra(wd="godApples"), yp=@de(vi=72))
    public gp mV;
    @de(vi=80)
    public iv mW = new iv("Soup");
    @au(wd="soup", vu="Soup", pr="true", yp=@de(vi=81))
    public boolean mX;
    @au(wd="soupColor", vu="Color", nu=@ra(wd="soup"), yp=@de(vi=82))
    public gp mY;

    public enum ay {
        HORIZONTAL,
        VERTICAL

    }

    public enum rf {
        BOTTOM,
        LEFT,
        RIGHT,
        TOP

    }
}
