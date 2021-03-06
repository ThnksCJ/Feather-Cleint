package net.digitalingot.feather;

import net.digitalingot.feather.vx;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class ta
        extends xu {
    public ta(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.LEADER);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.remove.usage", new Object[0]));
            return;
        }
        String string = stringArray[0];
        UUID uUID = this.xs.rf(string);
        vx vx2 = this.hC.ys().T();
        if (vx2.P().contains(uUID)) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.targetNotFound", new Object[0]));
            return;
        }
        this.hG.lx().om(uUID);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.remove.success", string);
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
