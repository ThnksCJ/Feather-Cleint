package net.digitalingot.feather;

import net.digitalingot.feather.je;
import net.digitalingot.feather.kw;
import net.digitalingot.feather.mods.impl.Voice;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class tx
implements ey {
    @NotNull
    private final Voice eO;
    private gm yC;
    @NotNull
    private final ue Af;

    public tx(@NotNull Voice zv2) {
        this.eO = zv2;
        this.Af = new ue(zv2);
    }

    @Override
    public float qh() {
        return (float)((Voice.rf)this.eO.xd()).yR;
    }

    @Override
    public float cx() {
        return (float)((Voice.rf)this.eO.xd()).yU;
    }

    @Override
    public float qv() {
        return (float)((Voice.rf)this.eO.xd()).yV;
    }

    @Override
    @NotNull
    public je.ay uu() {
        return ((Voice.rf)this.eO.xd()).yH.toCapnProto();
    }

    @Override
    @NotNull
    public List<UUID> np() {
        return this.yC.qa().hi().stream().map(ij::ba).collect(Collectors.toList());
    }

    @Override
    public boolean dx() {
        return ((Voice.rf)this.eO.xd()).yN != Voice.rf.rf.OFF;
    }

    @Override
    @Nullable
    public je.uj[] uj(byte[] byArray) {
         @Nullable je.uj[] ujArray = this.dp();
        if (ujArray != null) {
            return ujArray;
        }
        je.uj uj2 = this.Af.ay(byArray);
        if (uj2 == null) {
            return null;
        }
        return new je.uj[]{uj2};
    }

    @Override
    @Nullable
    public je.uj[] dp() {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (!minecraft.inGameHasFocus) {
            return null;
        }
        boolean bl = this.eO.as();
        boolean bl2 = this.eO.kr();
        je.uj[] ujArray = bl2 && bl ? new je.uj[]{je.uj.PROXIMITY, je.uj.PARTY} : (bl ? new je.uj[]{je.uj.PROXIMITY} : (bl2 ? new je.uj[]{je.uj.PARTY} : null));
        return ujArray;
    }

    @Override
    @Nullable
    public ey.ay ef() {
        Minecraft minecraft = Minecraft.getMinecraft();
        EntityPlayerSP entityPlayerSP = minecraft.player;
        if (entityPlayerSP == null) {
            return null;
        }
        kw kw2 = new kw((float)entityPlayerSP.field_70169_q, (float)entityPlayerSP.field_70167_r, (float)entityPlayerSP.field_70166_s);
        boolean bl = minecraft.gameSettings.thirdPersonView != 0;
        float f = minecraft.player.field_71109_bG;
        float f2 = minecraft.player.field_70726_aT;
        return new ey.ay(kw2, bl, f, f2);
    }

    @Override
    @Nullable
    public kw sb(UUID uUID) {
        Minecraft minecraft = Minecraft.getMinecraft();
        EntityPlayerSP entityPlayerSP = minecraft.player;
        if (entityPlayerSP == null) {
            return null;
        }
        EntityPlayer entityPlayer = minecraft.world.func_152378_a(uUID);
        if (entityPlayer == null) {
            return null;
        }
        return new kw((float)entityPlayer.field_70169_q, (float)entityPlayer.field_70167_r, (float)entityPlayer.field_70166_s);
    }

    @Override
    public void rf(@NotNull gm gm2) {
        this.yC = gm2;
    }
}
