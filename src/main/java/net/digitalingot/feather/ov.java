package net.digitalingot.feather;

import net.digitalingot.feather.hv;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

public class ov
extends GuiScreen {
    private final hv xu = new hv();
    private final ok fi = wg.INSTANCE.getScreen();
    private boolean gh;

    public void initGui() {
        this.xu.sd(this.width, this.height);
        this.fi.initGui();
    }

    public void onGuiClosed() {
        this.xu.wj();
        this.fi.onGuiClosed();
    }

    public void drawScreen(int n, int n2, float f) {
        this.xu.ou();
        this.fi.drawScreen(n, n2, f);
    }

    protected void keyTyped(char c, int n) {
        super.keyTyped(c, n);
        this.xu.ay(c, n);
    }

    protected void mouseClicked(int n, int n2, int n3) {
        if (this.xu.rf(n, n2, n3)) {
            this.gh = true;
        }
    }

    protected void mouseReleased(int n, int n2, int n3) {
        this.xu.uj(n, n2, n3);
    }

    protected void mouseClickMove(int n, int n2, int n3, long l) {
        this.xu.zz(n, n2, n3);
    }

    public void handleMouseInput() {
        super.handleMouseInput();
        if (Mouse.getEventButton() == -1) {
            int n = Mouse.getEventX() * this.width / this.mc.displayWidth;
            int n2 = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;
            this.xu.ay((double)n, (double)n2);
        }
        if (this.gh) {
            this.gh = false;
            return;
        }
        this.fi.handleMouseInput();
    }

    public void setWorldAndResolution(@NotNull Minecraft minecraft, int n, int n2) {
        super.setWorldAndResolution(minecraft, n, n2);
        this.fi.setWorldAndResolution(minecraft, n, n2);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}
