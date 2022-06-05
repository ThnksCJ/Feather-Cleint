package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;

import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.List;

public class lo {
    private static final AudioFormat An = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 24000.0f, 16, 1, 2, 24000.0f, false);
    private static final AudioFormat Ao = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 24000.0f, 16, 2, 4, 24000.0f, false);
    @Nullable
    private String Ap;
    @Nullable
    private String Aq;

    public lo(@Nullable String string, @Nullable String string2) {
        this.Ap = string2 != null && !string2.isEmpty() ? string2 : null;
        this.Aq = string != null && !string.isEmpty() ? string : null;
    }

    public static List<String> cu() {
        return lo.kl(TargetDataLine.class);
    }

    public static List<String> sa() {
        return lo.kl(SourceDataLine.class);
    }

    private static List<String> kl(Class<?> clazz) {
        Mixer.Info[] infoArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Mixer.Info info : infoArray = AudioSystem.getMixerInfo()) {
            Line.Info info2;
            Mixer mixer = AudioSystem.getMixer(info);
            if (!mixer.isLineSupported(info2 = new Line.Info(clazz))) continue;
            arrayList.add(info.getName());
        }
        return arrayList;
    }

    public void zz(@Nullable String string, @Nullable String string2) {
        this.Ap = string2 != null && !string2.isEmpty() ? string2 : null;
        this.Aq = string != null && !string.isEmpty() ? string : null;
    }

    @Nullable
    private TargetDataLine lv(@Nullable String string) {
        TargetDataLine targetDataLine;
        if (string != null && !string.equals("Default") && (targetDataLine = this.jo(string)) != null) {
            return targetDataLine;
        }
        return this.bu(TargetDataLine.class);
    }

    @Nullable
    private SourceDataLine bv(@Nullable String string) {
        SourceDataLine sourceDataLine;
        if (string != null && !string.equals("Default") && (sourceDataLine = this.it(string)) != null) {
            return sourceDataLine;
        }
        return this.bu(SourceDataLine.class);
    }

    @Nullable
    private <T> T bu(Class<T> clazz) {
        DataLine.Info info = new DataLine.Info(clazz, null);
        return clazz.cast(AudioSystem.getLine(info));
    }

    @Nullable
    private TargetDataLine jo(String string) {
        return this.ay(TargetDataLine.class, string);
    }

    @Nullable
    private SourceDataLine it(String string) {
        return this.ay(SourceDataLine.class, string);
    }

    @Nullable
    private <T extends Line> T ay(Class<T> clazz, String string) {
        Mixer.Info[] infoArray;
        for (Mixer.Info info : infoArray = AudioSystem.getMixerInfo()) {
            Line line;
            Line.Info info2;
            Mixer mixer = AudioSystem.getMixer(info);
            if (!mixer.isLineSupported(info2 = new Line.Info(clazz)) || !info.getName().equals(string) || !clazz.isAssignableFrom((line = mixer.getLine(info2)).getClass()))
                continue;
            return (T) line;
        }
        return null;
    }

    @Nullable
    public TargetDataLine jd() {
        TargetDataLine targetDataLine;
        block1:
        {
            targetDataLine = this.lv(this.Aq);
            if (targetDataLine == null) break block1;
            if (targetDataLine.isOpen()) {
                targetDataLine.close();
            }
            targetDataLine.open(An);
        }
        return targetDataLine;
    }

    @Nullable
    public SourceDataLine nd() {
        SourceDataLine sourceDataLine;
        block1:
        {
            sourceDataLine = this.bv(this.Ap);
            if (sourceDataLine == null) break block1;
            if (sourceDataLine.isOpen()) {
                sourceDataLine.close();
            }
            sourceDataLine.open(Ao);
        }
        return sourceDataLine;
    }
}
