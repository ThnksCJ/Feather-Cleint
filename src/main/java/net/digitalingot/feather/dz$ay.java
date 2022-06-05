package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;

import java.awt.*;

public class dz$ay
        extends zi {
    @au(wd = "weatherMode", vu = "Weather Mode", pr = "default", yp = @de(vi = 0))
    public ay dU;
    @au(wd = "fallingColor", vu = "Rain / Snow Color", pr = "255/255/255", yp = @de(vi = 1))
    public Color dV;

    public enum ay {
        DEFAULT,
        CLEAR,
        RAIN,
        THUNDER

    }
}
