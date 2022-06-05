package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.jetbrains.annotations.NotNull;

import javax.sound.sampled.TargetDataLine;
import java.io.Closeable;

public class hb
extends Thread
implements Closeable {
    @NotNull
    private final gm yC;
    @NotNull
    private final eo AA = new eo();
    private final TargetDataLine AB;
    private boolean AC;

    public hb(@NotNull gm gm2) {
        this.yC = gm2;
        this.AB = gm2.vh().jd();
        this.setDaemon(true);
        this.setName("feather-recording");
    }

    @Override
    public void run() {
        block0: {
            this.zb();
            if (this.AB == null) break block0;
            this.AB.close();
        }
    }

    private void zb() {
        while (true) {
            if (this.yC.vp().dx()) {
                this.lc();
                continue;
            }
            this.qn();
        }
    }

    private void qn() {
        Thread.sleep(10L);
        ey ey2 = this.yC.vp();
        je.uj[] ujArray = ey2.dp();
        if (ujArray == null) {
            return;
        }
        this.AC = true;
        do {
            byte[] byArray = this.ay(this.AB);
            this.ay(ujArray, byArray);
        } while ((ujArray = ey2.dp()) != null);
        this.AC = false;
        this.AB.stop();
        this.AB.flush();
    }

    private void lc() {
        byte[] byArray;
        ey ey2 = this.yC.vp();
        je.uj[] ujArray = ey2.uj(byArray = this.ay(this.AB));
        if (ujArray == null) {
            this.AC = false;
            return;
        }
        this.AC = true;
        this.ay(ujArray, byArray);
    }

    private byte[] ay(@NotNull TargetDataLine targetDataLine) {
        targetDataLine.start();
        while (targetDataLine.available() < 960) {
            Thread.sleep(2L);
        }
        byte[] byArray = new byte[960];
        targetDataLine.read(byArray, 0, 960);
        return byArray;
    }

    private void ay(je.uj[] ujArray, byte[] byArray) {
        ws.ay(byArray, this.yC.vp().qh());
        wr wr2 = this.yC.qw();
        if (wr2 == null) {
            return;
        }
        byte[] byArray2 = this.AA.bu(byArray);
        for (je.uj uj2 : ujArray) {
            wr2.rf(byArray2, uj2);
        }
    }

    @Override
    public void close() {
        if (this.AB != null) {
            this.AB.close();
        }
        this.interrupt();
    }

    public boolean ew() {
        return this.AC;
    }
}
