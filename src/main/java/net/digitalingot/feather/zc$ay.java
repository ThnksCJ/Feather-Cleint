package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.interfaces.*;

@rm(wm = true)
public class zc$ay
        extends zi {
    @au(wd = "color", vu = "Text Color", yp = @de(vi = 0))
    public gp sa;
    @au(wd = "damageDisplayType", vu = "Damage Display Type", pr = "value", yp = @de(vi = 1))
    public ay iK;
    @au(wd = "iconLocation", vu = "Icon Location", pr = "right", yp = @de(vi = 2))
    public rf iL;
    @au(wd = "listMode", vu = "List Mode", pr = "vertical", yp = @de(vi = 3))
    public uj iM;
    @au(wd = "padding", vu = "Padding", pr = "2", yp = @de(vi = 4))
    @mj(js = 5)
    public int iN;
    @fl(yp = @de(vi = 10))
    @cy(yv = ho.BOTTOM_RIGHT, dz = 0.0, ev = -1.0)
    public ci iO;
    @de(vi = 10)
    public iv iP = new iv("Show");
    @au(wd = "enableItemName", vu = "Enable Item Name", pr = "false", yp = @de(vi = 11))
    public boolean iQ;
    @au(wd = "showArmorDamage", vu = "Show Armor Damage", pr = "true", yp = @de(vi = 12))
    public boolean iR;
    @au(wd = "showDamageOverlay", vu = "Show Damage Overlay", pr = "true", yp = @de(vi = 13))
    public boolean iS;
    @au(wd = "showEquippedItem", vu = "Show Equipped Item", pr = "true", yp = @de(vi = 14))
    public boolean iT;
    @au(wd = "showItemCount", vu = "Show Item Count", pr = "true", yp = @de(vi = 15))
    public boolean iU;
    @au(wd = "showItemDamage", vu = "Show Item Damage", pr = "true", yp = @de(vi = 16))
    public boolean iV;
    @au(wd = "showMaxDamage", vu = "Show Max Damage", pr = "false", yp = @de(vi = 17))
    public boolean iW;

    public enum uj {
        HORIZONTAL,
        VERTICAL

    }

    public enum rf {
        LEFT,
        RIGHT

    }

    public enum ay {
        VALUE,
        PERCENT

    }
}
