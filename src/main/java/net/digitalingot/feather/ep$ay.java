package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.*;

import java.util.List;

public class ep$ay
        extends zi {
    @de(vi = 0)
    public iv uE = new iv("Auto Friend");
    @au(wd = "autoFriendEnabled", vu = "Enabled", yp = @de(vi = 1))
    public boolean uF;
    @au(wd = "friendMessages", vu = "Show Friend Messages", nu = @ra(wd = "autoFriendEnabled"), yp = @de(vi = 2))
    public boolean uG;
    @de(vi = 10)
    public iv uH = new iv("Auto Tip");
    @au(wd = "autoTipEnabled", vu = "Enabled", pr = "true", yp = @de(vi = 11))
    public boolean uI;
    @au(wd = "autoTipInterval", vu = "Interval", pr = "900", nu = @ra(wd = "autoTipEnabled"), yp = @de(vi = 12))
    @mj(yu = 0, js = 3600)
    public int uJ;
    @de(vi = 20)
    public iv uK = new iv("Auto GG");
    @au(wd = "autoGGEnabled", vu = "Enabled", yp = @de(vi = 21))
    public boolean uL;
    @au(wd = "autoGGDelay", vu = "Delay", pr = "20", nu = @ra(wd = "autoGGEnabled"), yp = @de(vi = 22))
    @mj(yu = 1)
    public int uM;
    @de(vi = 30)
    public iv uN = new iv("Anti GG");
    @au(wd = "antiGGEnabled", vu = "Enabled", yp = @de(vi = 31))
    public boolean uO;
    @de(vi = 40)
    public iv uP = new iv("Anti Lobby Join");
    @au(wd = "antiLobbyJoinEnabled", vu = "Enabled", yp = @de(vi = 41))
    public boolean uQ;
    @de(vi = 50)
    public iv uR = new iv("Level Head");
    @au(wd = "levelHeadEnabled", vu = "Enabled", pr = "false", yp = @de(vi = 51))
    public boolean uS;
    @au(wd = "levelHeadShowSelf", vu = "Show Self", nu = @ra(wd = "levelHeadEnabled"), yp = @de(vi = 52))
    public boolean uT = false;
    @au(wd = "levelHeadLevelColor", vu = "Nametag Color", pr = "false/255/255/0", nu = @ra(wd = "levelHeadEnabled"), yp = @de(vi = 53))
    public gp uU;
    @de(vi = 60)
    public iv uV = new iv("LevelHead Prefix");
    @au(wd = "levelHeadPrefixEnabled", vu = "Prefix", pr = "true", yp = @de(vi = 61))
    public boolean uW;
    @au(wd = "levelHeadPrefixText", vu = "Text", pr = "Level:", nu = @ra(wd = "levelHeadPrefixEnabled"), yp = @de(vi = 62))
    @jf(yu = 0, js = 32)
    public String uX;
    @au(wd = "levelHeadPrefixColor", vu = "Color", pr = "false/0/255/255", nu = @ra(wd = "levelHeadPrefixEnabled"), yp = @de(vi = 63))
    public gp uY;
    @de(vi = 64)
    public iv uZ = new iv("LevelHead Suffix");
    @au(wd = "levelHeadSuffixEnabled", vu = "Suffix", yp = @de(vi = 65))
    public boolean vd;
    @au(wd = "levelHeadSuffixText", vu = "Text", pr = "Level", nu = @ra(wd = "levelHeadSuffixEnabled"), yp = @de(vi = 66))
    @jf(yu = 0, js = 32)
    public String vA;
    @au(wd = "levelHeadSuffixColor", vu = "Color", pr = "false/0/255/255", nu = @ra(wd = "levelHeadSuffixEnabled"), yp = @de(vi = 67))
    public gp vB;
    @de(vi = 70)
    public iv vC = new iv("Oof Mod");
    @au(wd = "oofModEnabled", vu = "Enabled", pr = "false", yp = @de(vi = 71))
    public boolean vD;
    @au(wd = "selectedSound", vu = "Selected Sound", pr = "oof.wav", nu = @ra(wd = "oofModEnabled"), yp = @de(vi = 72))
    @qk(wd = "sounds")
    @dg
    public String vE;
    @au(wd = "volume", vu = "Volume", pr = "10", nu = @ra(wd = "oofModEnabled"), yp = @de(vi = 73))
    @mj(js = 30)
    public int vF;

    @qk(wd = "sounds")
    public static List<String> vm() {
        List<String> list = ua.vm();
        ua.vH = list;
        return list;
    }
}
