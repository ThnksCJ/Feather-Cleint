package net.digitalingot.feather;

import net.digitalingot.feather.lr;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class wt
        extends xu {
    public wt(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.NOT_IN_PARTY);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        lr lr2 = this.hC.ww(stringArray.length == 0 ? null : stringArray[0]);
        if (lr2 == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.error.inviteNotFound", new Object[0]));
            return;
        }
        this.hG.lx().rf(lr2.U(), true);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.accept.success");
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
