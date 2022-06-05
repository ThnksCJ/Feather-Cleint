package net.digitalingot.feather;

import io.netty.util.AttributeKey;

public class cl {
    public static final boolean yZ = jb.sd("FEATHER_VOICE_LOOPBACK", "false").equals("true");
    public static final long zA = Long.parseLong(jb.sd("FEATHER_LOOPBACK_DELAY", "200"));
    public static final long zB = Long.parseLong(jb.sd("FEATHER_LOOPBACK_DELAY_JITTER", "100"));
    public static final AttributeKey<fn> zC = AttributeKey.valueOf("control-connection");
    public static final AttributeKey<wr> zD = AttributeKey.valueOf("voice-connection");
    public static final String zE = jb.sd("FEATHER_VOICE_IPS", "https://game-client.feathermc.com/voice-list");
    public static final int zF = 5432;
    public static final String zG = jb.sd("FEATHER_CONTROL_SERVER", "voice.lb.feathermc.com");
    public static final int zH = 5433;
    public static final int zI = 3;
    public static final int zJ = 1;
    public static final int zK = 24000;
    public static final int zL = 20;
    public static final int zM = 480;
    public static final int zN = 960;
    public static final double zO = 32.0;
    public static final double zP = 16.0;
}
