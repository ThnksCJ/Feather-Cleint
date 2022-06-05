package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

@sv(aw= qc.SCREENSHOT, jf=@bx(vu="Screenshot", jm="https://assets.feathercdn.net/game/mods/screenshot.svg", mz="", lq={}))
public class Screenshot
extends Mod<ay> {
    @Override
    public void initialize() {
        ma ma2 = new ma();
        vc.bo.ay(ma2::ay);
        tf.eq.ay((file, iTextComponent) -> {
            if (!this.gc()) {
                return iTextComponent;
            }
            file = file.getCanonicalFile();
            this.sd(file);
            return of.ay((File)file, (ay) this.vz);
        });
    }

    private void sd(@NotNull File file) {
        switch (1.xK[((ay)this.vz).xM.ordinal()]) {
            case 1: {
                ForkJoinPool.commonPool().execute(() -> {
                    String string = sx.nn((File)file);
                    Minecraft.getMinecraft().addScheduledTask(() -> uv.yk((String)string));
                });
                break;
            }
            case 2: {
                Minecraft.getMinecraft().addScheduledTask(() -> me.uj((File)file));
            }
        }
    }

    @rm(wm=true)
    public static class iy$ay
    extends zi {
        @de(vi=0)
        public iv xL = new iv("Screenshot");
        @au(wd="autoCopyMode", vu="Auto Copy Mode", pr="dontCopy", yp=@de(vi=1))
        public ay xM;
        @de(vi=10)
        public iv xN = new iv("Screenshot Menu");
        @au(wd="openOption", vu="Show Open Option", pr="true", yp=@de(vi=11))
        public boolean xO;
        @au(wd="copyOption", vu="Show Copy Option", pr="true", yp=@de(vi=12))
        public boolean xP;
        @au(wd="uploadOption", vu="Show Upload Option", pr="true", yp=@de(vi=13))
        public boolean xQ;
        @au(wd="tweetOption", vu="Show Tweet Option", pr="true", yp=@de(vi=14))
        public boolean xR;

        public static enum ay {
            DONT_COPY,
            COPY_FILE,
            COPY_URL

        }
    }
}
