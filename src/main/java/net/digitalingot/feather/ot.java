package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.feather.mods.impl.Voice;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ot
extends kl {
    private static final an<General> CORE_PROVIDER = ej.ay(General.class);
    @NotNull
    private final Voice eO;

    public ot(@NotNull Voice zv2) {
        super("feathermute", Collections.singletonList("fmute"));
        this.eO = zv2;
    }

    @Override
    public void ay(@NotNull String[] stringArray) {
        String string;
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.base.usage", new Object[0]));
            return;
        }
        switch (string = stringArray[0].toLowerCase()) {
            case "add": 
            case "remove": {
                this.ay(entityPlayerSP, stringArray, string);
                break;
            }
            case "list": {
                List<ij> list = this.eO.uo().qa().hi();
                if (list.isEmpty()) {
                    dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.list.empty", new Object[0]));
                    break;
                }
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.list.heading", new Object[0]));
                for (ij ij2 : list) {
                    dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.list.entry", new Object[]{ij2.yb(), ij2.ba()}));
                }
                break;
            }
            default: {
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.base.usage", new Object[0]));
            }
        }
    }

    private void ay(@NotNull EntityPlayerSP entityPlayerSP, @NotNull String[] stringArray, @NotNull String string) {
        if (stringArray.length < 2) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.base.usage", new Object[0]));
            return;
        }
        String string2 = stringArray[1];
        UUID uUID = CORE_PROVIDER.nt().ex().rf(string2);
        if (uUID == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.invalidUsername", new Object[0]));
            return;
        }
        fb fb2 = this.eO.uo().qa();
        if (string.equals("add")) {
            if (fb2.iu(uUID)) {
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.add.success", new Object[]{string2}));
            } else {
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.add.failure", new Object[]{string2}));
            }
        } else if (fb2.ag(uUID)) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.remove.success", new Object[]{string2}));
        } else {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.feathermute.remove.failure", new Object[]{string2}));
        }
    }
}
