package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.jetbrains.annotations.NotNull;

public class vv
extends mn<Hypixel.ay> {
    private static final long uy = 20L;
    private vo uA = null;

    vv(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uI;
    }

    @Override
    public void zq() {
        if (!this.gc()) {
            return;
        }
        this.af();
    }

    @Override
    public void au() {
        super.au();
        this.af();
    }

    @Override
    public void jl() {
        super.jl();
        this.zf();
    }

    private void zf() {
        if (this.uA != null) {
            this.uA.oK();
            this.uA = null;
        }
    }

    private void af() {
        this.zf();
        this.uA = rf.nn().ay(() -> {
            Minecraft minecraft = Minecraft.getMinecraft();
            NetHandlerPlayClient netHandlerPlayClient = minecraft.getConnection();
            if (netHandlerPlayClient != null && ck.oS()) {
                minecraft.player.sendChatMessage("/tip all");
            }
        }, 0L, (long) this.vM.xd().uJ * 20L);
    }
}
