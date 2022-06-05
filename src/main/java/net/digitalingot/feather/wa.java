package net.digitalingot.feather;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class wa {
    public static wa Fl = new wa(Tessellator.getInstance());
    private final Tessellator Fm;
    private final BufferBuilder Fn;

    private wa(Tessellator tessellator) {
        this.Fm = tessellator;
        this.Fn = tessellator.getBuffer();
    }

    public wa ay(int n, VertexFormat vertexFormat) {
        this.Fn.begin(n, vertexFormat);
        return this;
    }

    public wa zz(float f, float f2, float f3) {
        this.Fn.pos(f, f2, f3);
        return this;
    }

    public wa zz(double d, double d2, double d3) {
        this.Fn.pos(d, d2, d3);
        return this;
    }

    public wa sd(int n, int n2, int n3, int n4) {
        this.Fn.color(n, n2, n3, n4);
        return this;
    }

    public wa uj(float f, float f2, float f3, float f4) {
        this.Fn.color(f, f2, f3, f4);
        return this;
    }

    public wa zz(float f, float f2) {
        this.Fn.tex(f, f2);
        return this;
    }

    public wa pe() {
        this.Fn.endVertex();
        return this;
    }

    public BufferBuilder px() {
        return this.Fn;
    }

    public void ok() {
        this.Fm.draw();
    }
}
