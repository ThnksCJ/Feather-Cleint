package net.digitalingot.feather;

import net.digitalingot.feather.ps;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class hk
extends xu {
    public hk(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.LEADER);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        String string;
        ps.rf rf2;
        String string2;
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
            return;
        }
        switch (string2 = stringArray[0].toLowerCase()) {
            case "normal": 
            case "n": {
                rf2 = ps.rf.EVERYONE;
                string = "feather.commands.featherparty.mode.successNormal";
                break;
            }
            case "proximity": 
            case "p": {
                rf2 = ps.rf.PROXIMITY;
                string = "feather.commands.featherparty.mode.successProximity";
                break;
            }
            default: {
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.mode.usage", new Object[0]));
                return;
            }
        }
        this.hG.lx().ay(rf2);
        String string3 = new TextComponentTranslation(string, new Object[0]);
        dd.ay(entityPlayerSP, (ITextComponent)string3);
    }
}
