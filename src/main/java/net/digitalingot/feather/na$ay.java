package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.mods.impl.Direction;

import java.awt.*;

public class na$ay
extends zi {
    @fl(yp=@de(vi=0))
    @cy(yv= ho.TOP_CENTER, ev=30.0)
    public ci iO;
    @de(vi=10)
    public iv kW = new iv("Direction");
    @au(wd="type", vu="Type", pr="default", yp=@de(vi=11))
    public Direction.uj kX;
    @au(wd="markerSize", vu="Marker Size", pr="3", yp=@de(vi=12))
    @mj(yu=1, js=9)
    public int kY;
    @au(wd="shadow", vu="Shadow", pr="true", yp=@de(vi=13))
    public boolean kZ;
    @au(wd="visibleDegrees", vu="Visible Degrees", pr="200", yp=@de(vi=14))
    @mj(yu=45, js=360)
    public int lA;
    @au(wd="width", vu="Width", pr="200", yp=@de(vi=15))
    @mj(yu=50, js=300)
    public int wl;
    @de(vi=20)
    public iv lB = new iv("Colors");
    @au(wd="backgroundColor", vu="Background Color", pr="7/7/7/100", yp=@de(vi=21))
    public Color kv;
    @au(wd="directionColor", vu="Direction Color", pr="false/255/255/255", yp=@de(vi=22))
    public gp lC;
    @au(wd="markerColor", vu="Marker Color", pr="255/255/255", yp=@de(vi=23))
    public Color lD;
}
