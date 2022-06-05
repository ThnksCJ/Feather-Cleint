package net.digitalingot.feather.enums;

import net.digitalingot.feather.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum ao {
    CALLBACK(null),
    READY_FOR_MESSAGES(tq.class),
    RECORD_KEYS(ba.class),
    RENDER_MOD(up.class),
    REMOVE_RENDER_MOD(rq.class),
    SET_SCALE_PERCENTAGE(kj.class),
    SET_UI_COLORS(ax.class),
    PAGE_UPDATE(tp.class),
    LOAD_HOMEPAGE_SELECTIONS(td.class),
    PRESS_BUTTON(yz.class),
    OPEN_FEATHER_MODS(oz.class),
    OPEN_HOMEPAGE(kk.class),
    CLOSE_HOMEPAGE(gr.class),
    LOAD_CLIENT_PREFERENCES(ab.class),
    UPDATE_CLIENT_PREFERENCES(hw.class),
    LOAD_MOD_PROFILE_LIST(bm.class),
    LOAD_MOD_PROFILE(sr.class),
    CREATE_MOD_PROFILE(ni.class),
    SELECT_MOD_PROFILE(lb.class),
    RENAME_MOD_PROFILE(ji.class),
    CLONE_MOD_PROFILE(zh.class),
    DELETE_MOD_PROFILE(md.class),
    BUILD_MOD_SETTINGS(id.class),
    UPDATE_MOD_SETTINGS(yh.class),
    RESET_MOD_SETTINGS(nc.class),
    RESET_MOD_POSITIONS(by.class),
    DISABLED_MODS(di.class),
    BUILD_SIDEBAR_SETTINGS(ns.class),
    LOAD_SIDEBAR_SETTINGS(wb.class),
    UPDATE_SIDEBAR_SETTINGS(uz.class),
    RESET_SIDEBAR_SETTINGS(kq.class),
    OPEN_COSMETICS(ri.class),
    BUILD_COSMETICS_MENU(zt.class),
    LOAD_COSMETICS_SETTINGS(sh.class),
    UPDATE_COSMETICS(bb.class),
    RESET_COSMETICS_SETTINGS(nk.class),
    OPEN_HUD_SELECTION(bh.class),
    CLOSE_HUD_SELECTION(fa.class),
    LOAD_HUD_SELECTION(ml.class),
    DO_HUD_SELECTION(nq.class),
    DRM_REQUEST(zg.class),
    ACCOUNT_SWITCH_DETAILS(el.class),
    LOAD_ACCOUNT_LIST(oj.class),
    CHANGE_ACCOUNT(fy.class),
    OPEN_WAYPOINTS_MENU(sl.class),
    LOAD_WAYPOINTS(ty.class),
    CREATE_UPDATE_WAYPOINT(cg.class),
    DELETE_WAYPOINT(hx.class),
    OPEN_AUTO_TEXT_MENU(xp.class),
    LOAD_MACROS(tn.class),
    CREATE_UPDATE_MACRO(ib.class),
    DELETE_MACRO(rn.class),
    REQUEST_P2P_JOIN(xm.class),
    ACCEPT_P2P_JOIN(sp.class),
    PREPARE_P2P(yi.class),
    PUNCH_HOLE(lp.class),
    CLOSE_P2P(hf.class);

    @Nullable
    private final Class<? extends da> model;

    ao(Class<? extends da> clazz) {
        this.model = clazz;
    }

    @NotNull
    public Class<? extends da> getModel() {
        if (this.model == null) {
            throw new IllegalArgumentException("can't call this on CallType.CALLBACK");
        }
        return this.model;
    }
}
