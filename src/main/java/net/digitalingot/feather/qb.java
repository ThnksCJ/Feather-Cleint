package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.ny;
import net.digitalingot.feather.interfaces.qg;
import net.digitalingot.feather.lr;
import net.digitalingot.feather.ps;
import net.digitalingot.feather.vx;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public class qb
        implements qg {
    @NotNull
    private final ny BG;
    @NotNull
    private final oq hA;

    qb(@NotNull ny ny2, @NotNull oq oq2) {
        this.BG = ny2;
        this.hA = oq2;
    }

    @Override
    public void ay(UUID uUID, List<UUID> list, ps.rf rf2) {
        vx vx2 = new vx(uUID, list, rf2);
        this.hA.rf(vx2);
        this.BG.ay(vx2);
    }

    @Override
    public void ay(int n, UUID uUID) {
        lr lr2 = new lr(n, uUID);
        this.hA.S().add(lr2);
        this.BG.ay(lr2);
    }

    @Override
    public void nl(UUID uUID) {
        this.BG.nl(uUID);
    }

    @Override
    public void fq() {
        this.hA.rf(null);
        this.BG.fq();
    }
}
