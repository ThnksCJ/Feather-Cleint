package net.digitalingot.feather;

import net.digitalingot.feather.enums.ao;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class nu {
    private sf eX;
    @NotNull
    private final ig dl;
    @NotNull
    private final Map<UUID, List<sb>> gX = new HashMap<UUID, List<sb>>();
    private int gY = 0;

    public nu() {
        this.dl = ig.ay(this);
        gw gw2 = zz.nw().pv();
        gw2.ay(ao.RESET_COSMETICS_SETTINGS, new hs(this.dl));
        gw2.ay(ao.UPDATE_COSMETICS, new on(this));
        op.rf(this);
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            UUID uUID = Minecraft.getMinecraft().getSession().getProfile().getId();
            this.gX.keySet().removeIf(uUID2 -> !uUID2.equals(uUID));
            nf nf2 = this.lx();
            if (nf2 != null) {
                nf2.bJ();
            }
        });
        sw.ti.ay(uj2 -> {
            if (uj2 != sw.uj.START) {
                return;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (entityPlayerSP == null) {
                return;
            }
            if (++this.gY != 20) {
                return;
            }
            this.gY = 0;
            nf nf2 = this.lx();
            if (nf2 == null) {
                return;
            }
            World world = entityPlayerSP.field_70170_p;
            if (world == null) {
                return;
            }
            List list = world.getPlayers(EntityPlayer.class, entityPlayer -> entityPlayer != entityPlayerSP);
            ArrayList<UUID> arrayList = new ArrayList<UUID>(list.size());
            for (EntityPlayer entityPlayer2 : list) {
                if (entityPlayer2 == entityPlayerSP) continue;
                arrayList.add(entityPlayer2.func_110124_au());
            }
            nf2.ay(arrayList, this.gX.keySet());
        });
    }

    public void ay(@NotNull sf sf2) {
        this.eX = sf2;
    }

    @Nullable
    public nf lx() {
        return this.eX.if().lx();
    }

    @NotNull
    public ig je() {
        return this.dl;
    }

    @NotNull
    public Map<UUID, List<sb>> cr() {
        return this.gX;
    }
}
