package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;

import java.awt.*;

public class lj$rf
extends zi {
    @fl(yp=@de(vi=0))
    @cy(yv= ho.TOP_RIGHT, dz=1.0, ev=15.0)
    public fw jQ;
    @de(vi=10)
    public iv cq = new iv("General Style");
    @au(wd="showIcon", vu="Show Icon", pr="true", yp=@de(vi=11))
    public boolean pY;
    @au(wd="showBackground", vu="Show Background", pr="true", yp=@de(vi=12))
    public boolean pZ;
    @au(wd="backgroundColor", vu="Background Color", pr="0/0/0/100", nu=@ra(wd="showBackground"), yp=@de(vi=13))
    public Color kv;
    @de(vi=20)
    public iv qz = new iv("Title Style");
    @au(wd="titleColor", vu="Text Color", pr="false/255/255/255/255", yp=@de(vi=21))
    public gp qA;
    @au(wd="titleShadow", vu="Text Shadow", pr="true", yp=@de(vi=22))
    public boolean qB;
    @de(vi=30)
    public iv qC = new iv("Description Style");
    @au(wd="showDescription", vu="Show Description", pr="true", yp=@de(vi=31))
    public boolean qD;
    @au(wd="descriptionColor", vu="Text Color", pr="128/128/128", nu=@ra(wd="showDescription"), yp=@de(vi=32))
    public Color qE;
    @au(wd="descriptionShadow", vu="Text Shadow", pr="true", nu=@ra(wd="showDescription"), yp=@de(vi=33))
    public boolean qF;
}
