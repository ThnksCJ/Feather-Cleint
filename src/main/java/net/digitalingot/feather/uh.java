package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.xs;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public class uh
        implements xs {
    @NotNull
    private final nu gZ;

    public uh(@NotNull nu nu2) {
        this.gZ = nu2;
    }

    @Override
    public void ay(UUID uUID, nw nw2) {
    }

    @Override
    public void rf(List<xs.ay> list) {
        for (xs.ay ay3 : list) {
            this.gZ.cr().put(ay3.zx(), ay3.hl());
        }
        if (list.stream().anyMatch(ay2 -> ay2.zx().toString().replace("-", "").equals(Minecraft.getMinecraft().getSession().getPlayerID()))) {
            ww.rf(this.gZ);
        }
    }
}
