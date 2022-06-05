package net.digitalingot.feather.mods.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

@sv(aw= qc.TIME_CHANGER, jf=@bx(vu="Time Changer", jm="https://assets.feathercdn.net/game/mods/timechanger.svg", mz="Change the time locally", lq={}))
public class TimeChanger
extends Mod<ay> {
    private static final int xX = 21000;
    private boolean xY;
    private long xZ = 21600L;
    private long yr = 64800L;
    private int yy;

    @Override
    public void initialize() {
        if (((ay)this.vz).yB) {
            ForkJoinPool.commonPool().execute(this::vz);
        }
    }

    @Override
    public void zq() {
        this.yy = 21000 - (int)((float)((ay)this.vz).yA / 100.0f * 21000.0f);
        if (((ay)this.vz).yB && !this.xY) {
            ForkJoinPool.commonPool().execute(this::vz);
        }
    }

    public void vz() {
        if (this.xY) {
            return;
        }
        this.xY = true;
        jh jh2 = jh.vl();
        String string = zd.sw("http://api.sunrise-sunset.org/json?lat=" + jh2.jr() + "&lng=" + jh2.rx() + "&formatted=0").oB();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(string);
        JsonObject jsonObject = jsonElement.getAsJsonObject().get("results").getAsJsonObject();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssX");
        Date date = simpleDateFormat.parse(jsonObject.get("sunrise").getAsString());
        Date date2 = simpleDateFormat.parse(jsonObject.get("sunset").getAsString());
        this.xZ = LocalTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
        this.yr = LocalTime.ofInstant(date2.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
    }

    public long fv() {
        return ((ay)this.vz).yB ? this.fh() : (long)this.yy;
    }

    public long fh() {
        long l;
        long l2 = LocalTime.now().toSecondOfDay();
        if (l2 < this.xZ) {
            l = (long)(18000.0 + (double)l2 * (6000.0 / (double)this.xZ));
        } else if (l2 < this.yr) {
            long l3 = Math.abs(this.yr - this.xZ);
            long l4 = l2 - this.xZ;
            l = (long)(0.0 + (double)l4 * (12000.0 / (double)l3));
        } else {
            long l5 = TimeUnit.DAYS.toSeconds(1L) - this.yr;
            long l6 = l2 - this.yr;
            l = (long)(12000.0 + (double)l6 * (6000.0 / (double)l5));
        }
        return l;
    }

    public static class ay
    extends zi {
        @au(wd="percentage", vu="", pr="100", yp=@de(vi=1))
        @mj(yu=0, js=100)
        public int yA;
        @au(wd="useRealWorldTime", vu="Use Real World Time", pr="false", yp=@de(vi=3))
        public boolean yB;
    }
}
