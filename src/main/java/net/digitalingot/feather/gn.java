package net.digitalingot.feather;

import org.cef.ICefRenderer;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.nio.ByteBuffer;

abstract class gn
        implements ICefRenderer {
    protected int pa = 0;
    protected int gw = 0;
    protected Rectangle vt = new Rectangle(0, 0, 0, 0);
    protected Rectangle pj = new Rectangle(0, 0, 0, 0);
    protected int er = 0;
    private boolean da = false;

    gn() {
    }

    protected void initialize() {
        this.go();
    }

    public void xi() {
        this.ne();
    }

    protected abstract boolean et();

    public void onPaint(boolean bl, Rectangle[] rectangleArray, ByteBuffer byteBuffer, int n, int n2) {
        boolean bl2;
        boolean bl3 = !bl;
        boolean bl4 = bl2 = bl && this.vt.width > 0 && this.vt.height > 0;
        if (!bl3 && !bl2) {
            return;
        }
        int n3 = GL11.glGetInteger(32873);
        boolean bl5 = GL11.glIsEnabled(3042);
        boolean bl6 = this.et();
        if (!bl5) {
            GL11.glEnable(3042);
        }
        if (!bl6) {
            GL11.glEnable(3553);
        }
        if (!this.da) {
            this.initialize();
            this.da = true;
        } else {
            GL11.glBindTexture(3553, this.er);
        }
        int n4 = GL11.glGetInteger(3317);
        int n5 = GL11.glGetInteger(3314);
        int n6 = GL11.glGetInteger(3316);
        int n7 = GL11.glGetInteger(3315);
        GL11.glPixelStorei(3317, 1);
        if (bl3) {
            int n8 = this.pa;
            int n9 = this.gw;
            this.pa = n;
            this.gw = n2;
            GL11.glPixelStorei(3314, this.pa);
            if (n8 != this.pa || n9 != this.gw) {
                GL11.glPixelStorei(3316, 0);
                GL11.glPixelStorei(3315, 0);
                GL11.glTexImage2D(3553, 0, 6408, this.pa, this.gw, 0, 32993, 33639, byteBuffer);
            } else {
                for (Rectangle rectangle : rectangleArray) {
                    GL11.glPixelStorei(3316, rectangle.x);
                    GL11.glPixelStorei(3315, rectangle.y);
                    GL11.glTexSubImage2D(3553, 0, rectangle.x, rectangle.y, rectangle.width, rectangle.height, 32993, 33639, byteBuffer);
                }
            }
        } else {
            int n10 = 0;
            int n11 = 0;
            int n12 = this.vt.x;
            int n13 = this.vt.y;
            int n14 = n;
            int n15 = n2;
            if (n12 < 0) {
                n10 = -n12;
                n12 = 0;
            }
            if (n13 < 0) {
                n11 = -n13;
                n13 = 0;
            }
            if (n12 + n14 > this.pa) {
                n14 -= n12 + n14 - this.pa;
            }
            if (n13 + n15 > this.gw) {
                n15 -= n13 + n15 - this.gw;
            }
            GL11.glPixelStorei(3314, n);
            GL11.glPixelStorei(3316, n10);
            GL11.glPixelStorei(3315, n11);
            GL11.glTexSubImage2D(3553, 0, n12, n13, n14, n15, 32993, 33639, byteBuffer);
        }
        GL11.glPixelStorei(3317, n4);
        GL11.glPixelStorei(3314, n5);
        GL11.glPixelStorei(3316, n6);
        GL11.glPixelStorei(3315, n7);
        GL11.glBindTexture(3553, n3);
        if (!bl5) {
            GL11.glDisable(3042);
        }
        if (!bl6) {
            GL11.glDisable(3553);
        }
    }

    public void onPopupSize(Rectangle rectangle) {
        if (rectangle.width <= 0 || rectangle.height <= 0) {
            return;
        }
        this.pj = rectangle;
        this.vt = this.ay(this.pj);
    }

    public void onPopupClosed() {
        this.vt.setBounds(0, 0, 0, 0);
        this.pj.setBounds(0, 0, 0, 0);
    }

    protected Rectangle ay(Rectangle rectangle) {
        Rectangle rectangle2 = rectangle;
        if (rectangle2.x < 0) {
            rectangle2.x = 0;
        }
        if (rectangle2.y < 0) {
            rectangle2.y = 0;
        }
        if (rectangle2.x + rectangle2.width > this.pa) {
            rectangle2.x = this.pa - rectangle2.width;
        }
        if (rectangle2.y + rectangle2.height > this.gw) {
            rectangle2.y = this.gw - rectangle2.height;
        }
        if (rectangle2.x < 0) {
            rectangle2.x = 0;
        }
        if (rectangle2.y < 0) {
            rectangle2.y = 0;
        }
        return rectangle2;
    }

    private void go() {
        this.er = GL11.glGenTextures();
        GL11.glBindTexture(3553, this.er);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
    }

    private void ne() {
        if (this.er != 0) {
            GL11.glDeleteTextures(this.er);
            this.er = 0;
        }
    }

    protected final boolean pt() {
        return this.da && this.pa != 0 && this.gw != 0;
    }
}
