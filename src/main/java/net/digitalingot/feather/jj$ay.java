package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.mj;
import net.digitalingot.feather.interfaces.ra;

public class jj$ay
        extends zi {
    @de(vi = 0)
    public iv i = new iv("General Options");
    @au(wd = "decimals", vu = "Decimal Points", pr = "2", yp = @de(vi = 1))
    @mj(js = 4)
    public int dR;
    @de(vi = 10)
    public iv cq = new iv("Style Options");
    @au(wd = "staticColor", vu = "Static Color", pr = "false", yp = @de(vi = 11))
    public boolean dS;
    @au(wd = "timeColor", vu = "Time Color", nu = @ra(wd = "staticColor"), yp = @de(vi = 12))
    public gp dT;
    @au(wd = "textShadow", vu = "Text Shadow", pr = "false", yp = @de(vi = 13))
    public boolean ki;
}
