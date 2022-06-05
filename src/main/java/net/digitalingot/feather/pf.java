package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class pf
        extends xu {
    public pf(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.LEADER);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.invite.usage", new Object[0]));
            return;
        }
        String string = stringArray[0];
        UUID uUID = this.xs.rf(string);
        if (uUID == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.targetNotFound", new Object[0]));
            return;
        }
        this.hG.lx().xs(uUID);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.invite.success", string);
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
