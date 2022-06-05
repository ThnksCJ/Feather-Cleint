package net.digitalingot.feather;

import net.digitalingot.feather.lr;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class sn
        extends xu {
    protected sn(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, gk2, rt2);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        lr lr2 = this.hC.ww(stringArray.length == 0 ? null : stringArray[0]);
        if (lr2 == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.inviteNotFound", new Object[0]));
            return;
        }
        this.hG.lx().rf(lr2.U(), false);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.deny.success");
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
