package net.digitalingot.feather.enums;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;

public enum qc {
    CORE(true, true),
    CHAT_OPTIONS(true, true),
    PERFORMANCE_OPTIONS(true, true),
    AUTO_TEXT(false, false),
    CROSSHAIR(false, false),
    CPS(false, false),
    ARMOR_STATUS(false, false),
    BOSS_BAR(false, false),
    COMBO_DISPLAY(false, false),
    COORDINATES(false, false),
    DIRECTION(false, false),
    FPS(false, false),
    ITEM_COUNTER(false, false),
    ITEM_INFO(false, false),
    KEYSTROKES(false, false),
    PACK_DISPLAY(false, false),
    PING(false, false),
    POTION_EFFECTS(false, false),
    REACH_DISPLAY(false, false),
    SCOREBOARD(false, false),
    TIME(false, false),
    TOGGLE_SPRINT(false, false),
    SERVER_ADDRESS(false, false),
    HYPIXEL(false, false),
    MOTION_BLUR(false, false),
    SATURATION(false, false),
    WAYPOINTS(false, false),
    ANIMATIONS(false, false),
    DAMAGE_INDICATOR(false, false),
    DISCORD(false, false),
    BLOCK_OVERLAY(false, false),
    CLEAR_WATER(false, false),
    FOV_CHANGER(false, false),
    GLINT(false, false),
    HITBOX(false, false),
    ITEM_PHYSIC(false, false),
    OOF_MOD(false, false),
    PARTICLES(false, false),
    PERSPECTIVE(false, false),
    SNAPLOOK(false, false),
    VOICE(false, false),
    TIME_CHANGER(false, false),
    TNT_TIMER(false, false),
    NICK_HIDER(false, false),
    SCREENSHOT(false, false),
    SCROLLABLE_TOOLTIPS(false, false),
    WEATHER_CHANGER(false, false),
    ZOOM(false, false);

    private final String slug;
    private final boolean core;
    private final boolean sidebar;

    @Nullable
    public static qc fromSlug(String string) {
        for (qc qc2 : qc.values()) {
            if (!qc2.getSlug().equals(string)) continue;
            return qc2;
        }
        return null;
    }

    qc(boolean bl, boolean bl2) {
        this.sidebar = bl2;
        Field field = ((Object) this).getClass().getDeclaredField(this.name());
        this.slug = field.getDeclaredAnnotation(SerializedName.class).value();
        this.core = bl;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }

    public boolean isCore() {
        return this.core;
    }

    public boolean isSidebar() {
        return this.sidebar;
    }
}
