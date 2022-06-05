package net.digitalingot.feather;

import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Locale;

public class ie
extends kl {
    private static File gK = null;
    private static Recording gL = null;

    public ie() {
        super("jfr", Collections.emptyList());
        Path path = Minecraft.getMinecraft().mcDataDir.toPath();
        path = path.resolve("feather");
        gK = path.resolve("jfr").toFile();
        gK.mkdir();
    }

    @Override
    public void ay(@NotNull String[] stringArray) {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.jfr.usage", new Object[0]));
            return;
        }
        if (!FlightRecorder.isAvailable()) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.jfr.notAvailable", new Object[0]));
            return;
        }
        String string = stringArray[0].toLowerCase(Locale.ROOT);
        if (string.equalsIgnoreCase("start")) {
            this.ay(entityPlayerSP);
        } else if (string.equalsIgnoreCase("stop")) {
            this.rf(entityPlayerSP);
        } else {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.jfr.usage", new Object[0]));
            return;
        }
    }

    private void ay(EntityPlayerSP entityPlayerSP) {
        if (gL != null) {
            return;
        }
        Recording recording = null;
        String string = "";
        recording = new Recording();
        string = "recording-" + String.valueOf(recording.getId()) + ".jfr";
        Path path = new File(gK, string).toPath();
        recording.setDestination(path);
        recording.start();
        gL = recording;
        dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.jfr.recordingStarted", new Object[]{string}));
    }

    private void rf(EntityPlayerSP entityPlayerSP) {
        if (gL == null) {
            return;
        }
        gL.stop();
        gL.close();
        gL = null;
        dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.jfr.recordingStopped", new Object[0]));
    }
}
