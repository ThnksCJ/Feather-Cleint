package net.digitalingot.feather;

import net.digitalingot.feather.vx;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class uw
extends xu {
    public uw(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.LEADER);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.leader.usage", new Object[0]));
            return;
        }
        UUID uUID = this.xs.rf(stringArray[0]);
        if (uUID == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.targetNotFound", new Object[0]));
            return;
        }
        vx vx2 = this.hC.ys().T();
        if (!vx2.P().contains(uUID)) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.targetNotInParty", new Object[0]));
            return;
        }
        this.hG.lx().mm(uUID);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.leader.success", stringArray[0]);
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
