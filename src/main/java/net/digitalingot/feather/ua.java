package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.gd;
import net.digitalingot.feather.interfaces.rw;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ua
        extends mn<Hypixel.ay> {
    private static final File vG = new File(Minecraft.getMinecraft().mcDataDir, "feather/misc/oofmod");
    public static List<String> vH;
    private Clip vI;
    private String vJ;
    private Pattern vK;
    private Pattern vL;

    ua(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @NotNull
    public static List<String> vm() {
        String[] stringArray = vG.list();
        if (stringArray == null) {
            return new ArrayList<String>(Collections.singletonList("oof.wav"));
        }
        List<String> list = Arrays.stream(stringArray).filter(string -> string.endsWith(".wav")).collect(Collectors.toList());
        if (!list.contains("oof.wav")) {
            list.add("oof.wav");
        }
        return list;
    }

    @Override
    public boolean jn() {
        return this.vM.xd().vD;
    }

    @Override
    public void initialize() {
        this.ph();
        gd.bo.ay(iTextComponent -> {
            String string;
            if (!this.gc()) {
                return iTextComponent;
            }
            if (!ck.oS()) {
                return iTextComponent;
            }
            if (!Minecraft.getMinecraft().getSession().getUsername().equals(this.vJ)) {
                this.ph();
            }
            String string2 = iTextComponent.getUnformattedText();
            Matcher matcher = this.vK.matcher(string2);
            String[] stringArray = string2.split(" ");
            Matcher matcher2 = this.vL.matcher(stringArray.length > 0 ? stringArray[0] : string2.trim());
            if (matcher2.matches() && matcher.find() && !(string = matcher.group(1)).equals(this.vJ)) {
                this.qj();
            }
            return iTextComponent;
        });
        this.av();
    }

    @Override
    public void zq() {
        this.av();
        if (this.vI != null) {
            this.vI.close();
        }
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(vG, this.vM.xd().vE));
        this.vI = AudioSystem.getClip();
        this.vI.open(audioInputStream);
        FloatControl floatControl = (FloatControl) this.vI.getControl(FloatControl.Type.MASTER_GAIN);
        floatControl.setValue((float) this.vM.xd().vF - 30.0f);
    }

    public boolean eb() {
        return !new HashSet<String>(ua.vm()).equals(new HashSet<String>(vH));
    }

    private void ph() {
        this.vJ = Minecraft.getMinecraft().getSession().getUsername();
        String string = "(\\w{1,16}).+ (by|of|to|for|with) (" + this.vJ + ")";
        String string2 = "^[a-zA-Z0-9_-]{3,16}$";
        this.vK = Pattern.compile(string);
        this.vL = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
    }

    private void av() {
        File file = new File(vG, "oof.wav");
        if (!file.exists()) {
            vG.mkdirs();
            zd.yd("assets/feather/sounds/oof.wav").ay((rw) zd.xn(file).oE());
        }
    }

    private void qj() {
        if (this.vI != null) {
            this.vI.setFramePosition(0);
            this.vI.start();
        }
    }
}
