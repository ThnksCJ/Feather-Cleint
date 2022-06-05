package net.digitalingot.feather;

import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class rq
        implements da {
    @Override
    @NotNull
    public ao xp() {
        return ao.REMOVE_RENDER_MOD;
    }
}
