package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ol
extends mn<Hypixel.ay> {
    private static final Pattern tU = Pattern.compile("^.*\\[.+] \\S{1,16} joined the lobby!.*$");

    protected ol(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public void initialize() {
        gd.bo.ay(iTextComponent -> {
            if (!this.gc()) {
                return iTextComponent;
            }
            Matcher matcher = tU.matcher(az.uf(iTextComponent.getUnformattedText()));
            return matcher.matches() ? null : iTextComponent;
        });
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uQ;
    }
}
