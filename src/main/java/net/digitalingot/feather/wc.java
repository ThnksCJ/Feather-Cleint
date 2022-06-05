package net.digitalingot.feather;

import net.digitalingot.feather.fs;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class wc
implements va {
    @NotNull
    private final if Bo;

    public wc(@NotNull if if_) {
        this.Bo = if_;
    }

    @Override
    public void ay(@NotNull UUID uUID, @NotNull fs.ay ay2) {
        if.ay ay3 = this.Bo.N().remove(uUID);
        if (ay3 == null || ay3.fv() - TimeUnit.MINUTES.toMillis(10L) > System.currentTimeMillis()) {
            vm.Fq.error("Received P2P Join Request from {} while it was never accepted or the request has timed out", uUID);
            return;
        }
        gw gw2 = zz.nw().pv();
        gw2.rf(new yi(), new /* Unavailable Anonymous Inner Class!! */, null);
    }

    @Override
    public void rf(@NotNull UUID uUID, @NotNull fs.ay ay2) {
        if.rf rf2 = this.Bo.M().remove(uUID);
        if (rf2 == null || rf2.fv() - TimeUnit.MINUTES.toMillis(10L) > System.currentTimeMillis()) {
            vm.Fq.error("Received P2P Join Accepted from {} while it was never requested or the request has timed out", uUID);
            return;
        }
        lp lp2 = new lp(rf2.mo(), null, ay2.qk(), ay2.be());
        zz.nw().pv().rf(lp2, new /* Unavailable Anonymous Inner Class!! */, null);
    }

    static if ay(wc wc2) {
        return wc2.Bo;
    }
}
