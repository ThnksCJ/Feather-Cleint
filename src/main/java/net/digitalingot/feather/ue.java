package net.digitalingot.feather;

import net.digitalingot.feather.je;
import net.digitalingot.feather.mods.impl.Voice;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ue {
    private static final long yW = 100L;
    @NotNull
    private final Voice eO;
    private long yX = -1L;

    public ue(@NotNull Voice zv2) {
        this.eO = zv2;
    }

    @Nullable
    public je.uj ay(byte[] byArray) {
        if (((Voice.rf)this.eO.xd()).yN == Voice.rf.rf.OFF) {
            return null;
        }
        Minecraft minecraft = Minecraft.getMinecraft();
        if (!minecraft.inGameHasFocus) {
            return null;
        }
        if (!this.rf(byArray)) {
            return null;
        }
        switch (1.yY[((Voice.rf)this.eO.xd()).yN.ordinal()]) {
            case 1: {
                return je.uj.PROXIMITY;
            }
            case 2: {
                return je.uj.PARTY;
            }
        }
        return null;
    }

    private boolean rf(byte[] byArray) {
        long l = System.currentTimeMillis();
        double d = ws.zz(byArray);
        if (d > ((Voice.rf)this.eO.xd()).yO) {
            this.yX = l;
            return true;
        }
        return l - this.yX < 100L;
    }
}
