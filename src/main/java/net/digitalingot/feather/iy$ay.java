package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.rm;

@rm(wm = true)
public class iy$ay
        extends zi {
    @de(vi = 0)
    public iv xL = new iv("Screenshot");
    @au(wd = "autoCopyMode", vu = "Auto Copy Mode", pr = "dontCopy", yp = @de(vi = 1))
    public ay xM;
    @de(vi = 10)
    public iv xN = new iv("Screenshot Menu");
    @au(wd = "openOption", vu = "Show Open Option", pr = "true", yp = @de(vi = 11))
    public boolean xO;
    @au(wd = "copyOption", vu = "Show Copy Option", pr = "true", yp = @de(vi = 12))
    public boolean xP;
    @au(wd = "uploadOption", vu = "Show Upload Option", pr = "true", yp = @de(vi = 13))
    public boolean xQ;
    @au(wd = "tweetOption", vu = "Show Tweet Option", pr = "true", yp = @de(vi = 14))
    public boolean xR;

    public enum ay {
        DONT_COPY,
        COPY_FILE,
        COPY_URL

    }
}
