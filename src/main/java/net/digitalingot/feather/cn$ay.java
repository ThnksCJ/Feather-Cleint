package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cn$ay
        extends mo {
    @Override
    public Object so() {
        DateTimeFormatter dateTimeFormatter = ((Time.rf) ((Time) Time.this).vz).sL == Time.rf.ay.HOUR_12 ? sH : sI;
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    @Override
    public boolean gf() {
        return false;
    }

    @Override
    public fw bt() {
        return ((Time.rf) ((Time) Time.this).vz).jQ;
    }

    @Override
    public ci te() {
        return this.bt();
    }
}
