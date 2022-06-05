package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public class sf {
    @NotNull
    private final gk hG;
    @NotNull
    private final nu gZ;
    @NotNull
    private final rt hC;
    private int hJ;

    private sf(@NotNull gk gk2, @NotNull nu nu2, @NotNull rt rt2) {
        this.hG = gk2;
        this.gZ = nu2;
        this.hC = rt2;
    }

    @Nullable
    public static sf ay(@NotNull nn nn2) {
        fi fi2 = new fi();
        nu nu2 = new nu();
        rt rt2 = new rt(nn2);
        if if_ = if.K();
        wc wc2 = new wc(if_);
        zs zs2 = nn2.ww();
        String string = zs2.yw();
        if (string == null) {
            return null;
        }
        gk gk2 = gk.ay(fi2, nu2.je().dy(), rt2.ys().R(), wc2, zs2);
        if_.ay(gk2);
        sf sf2 = new sf(gk2, nu2, rt2);
        nu2.ay(sf2);
        new gh(gk2).init();
        nj nj2 = new nj(rt2.ex(), gk2, rt2);
        vc.bo.ay(nj2::ay);
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (entityPlayerSP == null) {
                gk2.bD().clear();
            } else {
                gk2.bD().keySet().removeIf(uUID -> !uUID.equals(entityPlayerSP.func_110124_au()));
            }
        });
        sw.ti.ay(uj2 -> {
            if (uj2 != sw.uj.START) {
                return;
            }
            if (++sf2.hJ != 20) {
                return;
            }
            sf2.hJ = 0;
            NetHandlerPlayClient netHandlerPlayClient = Minecraft.getMinecraft().getConnection();
            if (netHandlerPlayClient == null) {
                return;
            }
            Collection collection = netHandlerPlayClient.getPlayerInfoMap();
            HashSet<UUID> hashSet = new HashSet<UUID>(collection.size());
            for (NetworkPlayerInfo networkPlayerInfo : collection) {
                hashSet.add(networkPlayerInfo.getGameProfile().getId());
            }
            nf nf2 = gk2.lx();
            if (nf2 != null) {
                nf2.rf(hashSet);
            }
        });
        return sf2;
    }

    @NotNull
    public gk if() {
        return this.hG;
    }

    @NotNull
    public nu hq() {
        return this.gZ;
    }

    @NotNull
    public rt vx() {
        return this.hC;
    }
}
