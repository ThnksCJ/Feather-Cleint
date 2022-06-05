package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.interfaces.*;

import java.awt.*;

@rm(wm = true)
public class aq$rf
        extends zi {
    @de(vi = 0)
    public iv i = new iv("General");
    @au(wd = "badPingColorChangeRate", vu = "Bad Ping Color Change Rate", pr = "25", yp = @de(vi = 1))
    @mj(yu = 10, js = 40)
    public int qH;
    @de(vi = 10)
    public iv qI = new iv("HUD");
    @fl(yp = @de(vi = 11))
    @cy(yv = ho.TOP_RIGHT, jj = "HUD Enabled")
    public fw jQ;
    @au(wd = "dynamicColor", vu = "Dynamic Color", pr = "false", yp = @de(vi = 1))
    public boolean qJ;
    @de(vi = 20)
    public iv qK = new iv("Tab List");
    @au(wd = "tabList", vu = "Tablist", pr = "true", yp = @de(vi = 21))
    public boolean qL;
    @au(wd = "tabListDynamicColor", vu = "Tab List Dynamic Color", pr = "true", nu = @ra(wd = "tabList"), yp = @de(vi = 22))
    public boolean qM;
    @au(wd = "tabListColor", vu = "Tab List Color", pr = "255/255/255", nu = @ra(wd = "tabList"), yp = @de(vi = 23))
    public Color qN;
}
