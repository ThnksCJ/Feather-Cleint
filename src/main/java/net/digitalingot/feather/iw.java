package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.gd;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iw
        extends mn<Hypixel.ay> {
    private static final Pattern tT = Pattern.compile("(:?(SHOUT|SPECTATOR|TEAM|) )?.+\\\\S{1,16}: .*(?:gg|gf|good game|good fight|good round).*", 2);

    iw(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public void initialize() {
        gd.bo.ay(iTextComponent -> {
            if (!this.gc()) {
                return iTextComponent;
            }
            Matcher matcher = tT.matcher(iTextComponent.getUnformattedText());
            return matcher.find(0) ? null : iTextComponent;
        });
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uO;
    }
}
