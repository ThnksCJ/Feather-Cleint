package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.je;

import java.util.ArrayList;
import java.util.List;

@rm(wm = true)
public class zv$rf
        extends zi {
    @fl(yp = @de(vi = 0))
    @cy(yv = ho.CENTER_LEFT, dz = 0.0, ev = -101.0)
    public ci iO;
    @de(vi = 10)
    public iv i = new iv("General");
    @au(wd = "receiveMode", vu = "Receive Mode", pr = "everyone", yp = @de(vi = 11))
    public ay yH;
    @au(wd = "hud", vu = "Enable HUD Indicator", pr = "true", yp = @de(vi = 12))
    public boolean yI;
    @de(vi = 20)
    public iv yJ = new iv("Key Settings");
    @au(wd = "keyProximityPTT", vu = "Proximity - Push to Talk", pr = "86", yp = @de(vi = 21))
    public km yK;
    @au(wd = "keyPartyPTT", vu = "Party - Push to Talk", pr = "80", yp = @de(vi = 22))
    public km yL;
    @de(vi = 30)
    public iv yM = new iv("Voice Activation");
    @au(wd = "voiceActivationType", vu = "Type", pr = "off", yp = @de(vi = 31))
    public rf yN;
    @au(wd = "voiceActivationThreshold", vu = "Threshold", pr = "-30", yp = @de(vi = 32), nu = @ra(wd = "voiceActivationType", ee = {"proximity", "party"}))
    @in(hd = -70.0, lf = 0.0)
    public double yO;
    @de(vi = 40)
    public iv yP = new iv("Capture");
    @au(wd = "microphone", vu = "Device", pr = "Default", yp = @de(vi = 41))
    @dg
    @qk(wd = "microphones")
    public String yQ;
    @au(wd = "microphoneAmplification", vu = "Amplification", pr = "1.0", yp = @de(vi = 42))
    @in
    public double yR;
    @de(vi = 50)
    public iv yS = new iv("Playback");
    @au(wd = "speaker", vu = "Device", pr = "Default", yp = @de(vi = 51))
    @dg
    @qk(wd = "speakers")
    public String yT;
    @au(wd = "speakerAmplification", vu = "Amplification", pr = "1.0", yp = @de(vi = 52))
    @in
    public double yU;
    @au(wd = "maxVolume", vu = "Max Volume", pr = "80", yp = @de(vi = 53))
    @in(hd = 10.0, lf = 100.0)
    public double yV;

    @qk(wd = "microphones")
    public static List<String> zk() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Default");
        arrayList.addAll(lo.cu());
        return arrayList;
    }

    @qk(wd = "speakers")
    public static List<String> ow() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Default");
        arrayList.addAll(lo.sa());
        return arrayList;
    }

    public enum rf {
        OFF,
        PROXIMITY,
        PARTY

    }

    public enum ay {
        EVERYONE,
        PARTY_ONLY;


        public je.ay toCapnProto() {
            switch (zv .1.yF[this.ordinal()]){
                case 1: {
                    return je.ay.EVERYONE;
                }
                case 2: {
                    return je.ay.PARTY_ONLY;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
