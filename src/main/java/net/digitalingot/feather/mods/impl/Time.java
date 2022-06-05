package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@sv(aw = qc.TIME, jf = @bx(vu = "Time", jm = "https://assets.feathercdn.net/game/mods/time.svg", mz = "Display the current time", lq = {ly.ay.HUD}))
@pq(we = {@xd(bp = ay.class)})
public class Time
        extends HUDMod<rf> {
    private static final DateTimeFormatter sH = DateTimeFormatter.ofPattern("hh:mm a");
    private static final DateTimeFormatter sI = DateTimeFormatter.ofPattern("HH:mm");

    public static class rf
            extends zi {
        @de(vi = 0)
        public iv sK = new iv("Time");
        @au(wd = "timeFormat", vu = "Time Format", pr = "12", yp = @de(vi = 2))
        public ay sL;
        @fl(yp = @de(vi = 10))
        @cy(dz = 33.0, ev = 8.0)
        public fw jQ;

        public enum ay {
            HOUR_24,
            HOUR_12

        }
    }

    public class ay
            extends mo {
        @Override
        public Object so() {
            DateTimeFormatter dateTimeFormatter = ((rf) Time.this.vz).sL == rf.ay.HOUR_12 ? sH : sI;
            return LocalDateTime.now().format(dateTimeFormatter);
        }

        @Override
        public boolean gf() {
            return false;
        }

        @Override
        public fw bt() {
            return ((rf) Time.this.vz).jQ;
        }

        @Override
        public ci te() {
            return this.bt();
        }
    }
}
