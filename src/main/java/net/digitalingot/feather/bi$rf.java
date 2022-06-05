package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.mods.impl.ToggleSprint;

@rm(wm=true)
public class bi$rf
extends zi {
    @de(vi=0)
    public iv sU = new iv("Toggle Sprint");
    @au(wd="toggleSneak", vu="Toggle Sneak", yp=@de(vi=1))
    public boolean sV;
    @au(wd="toggleSprint", vu="Toggle Sprint", pr="true", yp=@de(vi=2))
    public boolean sW;
    @de(vi=10)
    public iv sX = new iv("Fly");
    @au(wd="blockSprintWhenFlying", vu="Block Sprint", yp=@de(vi=11))
    public boolean sY;
    @au(wd="flyBoostAmount", vu="Boost Amount", pr="1", yp=@de(vi=12))
    @mj(yu=1, js=8)
    public int sZ;
    @fl(yp=@de(vi=20))
    @cy(yv= ho.TOP_LEFT, dz=0.0, ev=52.0)
    @wv(rh={@aw(ie="backgroundWidth", js=150, pr="110"), @aw(ie="backgroundHeight", yu=10, js=25, pr="16")})
    public ToggleSprint.uj tA;
    @de(vi=30)
    public iv tB = new iv("Text Settings");
    @au(wd="hideText", vu="Hide Text", yp=@de(vi=31))
    public boolean tC;
    @au(wd="sneakingKeyHeldText", vu="Sneaking Held", pr="Sneaking (Key Held)", yp=@de(vi=32))
    @jf(yu=0, js=32)
    public String tD;
    @au(wd="sneakingToggledText", vu="Sneaking Toggled", pr="Sneaking (Toggled)", yp=@de(vi=33))
    @jf(yu=0, js=32)
    public String tE;
    @au(wd="sprintingKeyHeldText", vu="Sprinting Held", pr="Sprinting (Key Held)", yp=@de(vi=34))
    @jf(yu=0, js=32)
    public String tF;
    @au(wd="sprintingToggledText", vu="Sprinting Toggled", pr="Sprinting (Toggled)", yp=@de(vi=35))
    @jf(yu=0, js=32)
    public String tG;
    @au(wd="sprintingVanillaText", vu="Sprinting Vanilla", pr="Sprinting (Vanilla)", yp=@de(vi=36))
    @jf(yu=0, js=32)
    public String tH;
}
