package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.mj;
import net.digitalingot.feather.interfaces.rm;

import java.awt.*;

@rm(wm = true)
public class tm$ay
        extends zi {
    @de(vi = 0)
    public iv i = new iv("General");
    @au(wd = "animationSpeed", vu = "Animation Speed", pr = "10", yp = @de(vi = 1))
    @mj(yu = 1, js = 25)
    public int wX;
    @au(wd = "tooltipFoodValues", vu = "Tooltip Food Values", pr = "shiftOnly", yp = @de(vi = 2))
    public ay wY;
    @de(vi = 10)
    public iv wZ = new iv("Food Exhaustion");
    @au(wd = "foodExhaustionColor", vu = "Color", pr = "128/128/128", yp = @de(vi = 11))
    public Color xx;
    @au(wd = "foodExhaustionUnderlay", vu = "Underlay", pr = "true", yp = @de(vi = 12))
    public boolean xA;
    @de(vi = 20)
    public iv xB = new iv("Food Gain");
    @au(wd = "foodGainOverlay", vu = "Gain Overlay", pr = "true", yp = @de(vi = 21))
    public boolean xC;
    @de(vi = 30)
    public iv xD = new iv("Red Saturation");
    @au(wd = "redSaturationGainOverlay", vu = "Gain Overlay", yp = @de(vi = 31))
    public boolean xE;
    @au(wd = "redSaturationOverlay", vu = "Overlay", pr = "true", yp = @de(vi = 32))
    public boolean xF;
    @au(wd = "redTooltipSaturation", vu = "Tooltip Saturation", yp = @de(vi = 33))
    public boolean xG;
    @de(vi = 40)
    public iv xH = new iv("Saturation");
    @au(wd = "saturationGainOverlay", vu = "Gain Overlay", pr = "true", yp = @de(vi = 41))
    public boolean xI;
    @au(wd = "saturationOverlay", vu = "Overlay", pr = "true", yp = @de(vi = 42))
    public boolean xJ;

    public enum ay {
        NEVER,
        SHIFT_ONLY,
        ALWAYS

    }
}
