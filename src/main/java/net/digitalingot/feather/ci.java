package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;

import java.awt.geom.Point2D;

public class ci {
    @au(wd = "hudEnabled", vu = "Enabled", yp = @de(vi = 0))
    public boolean ks;
    @au(wd = "hudAnchor", vu = "AnchorPoint", pr = "top_left", yp = @de(vi = -99))
    public transient ho zk;
    @au(wd = "hudRelativeX", vu = "Relative X", yp = @de(vi = -98))
    public transient double ow;
    @au(wd = "hudRelativeY", vu = "Relative Y", yp = @de(vi = -97))
    public transient double zw;
    @au(wd = "hudScale", vu = "Scale", yp = @de(vi = -96))
    public transient double fk;

    public double getX(double d) {
        return this.zk.getX(iz.aY()) + this.ow - this.zk.getX(d);
    }

    public double getY(double d) {
        return this.zk.getY(iz.aZ()) + this.zw - this.zk.getY(d);
    }

    public <C extends zi> double sd(kb kb2) {
        return this.zk.getX(iz.aY()) - this.zk.getX(kb2.ch());
    }

    public <C extends zi> double bu(kb kb2) {
        return this.zk.getY(iz.aZ()) - this.zk.getY(kb2.iq());
    }

    public void hz() {
        double d = this.zk.getX(iz.aY()) + this.ow;
        double d2 = this.zk.getY(iz.aZ()) + this.zw;
        ho ho2 = ho.TOP_LEFT;
        double d3 = -1.0;
        for (ho ho3 : ho.values()) {
            double d4 = Point2D.distance(d, d2, ho3.getX(iz.aY()), ho3.getY(iz.aZ()));
            if (d3 != -1.0 && !(d4 < d3)) continue;
            ho2 = ho3;
            d3 = d4;
        }
        this.ow = d - ho2.getX(iz.aY());
        this.zw = d2 - ho2.getY(iz.aZ());
        this.zk = ho2;
    }

    public void ay(kb kb2, double d, double d2) {
        this.hz();
        double d3 = d - this.sd(kb2);
        double d4 = d2 - this.bu(kb2);
        if (this.zk.isLeft() ? d3 < 0.0 : this.zk.isRightSide() && d3 > 0.0) {
            d3 = 0.0;
        }
        if (this.zk.isTop() ? d4 < 0.0 : this.zk.isBottomSide() && d4 > 0.0) {
            d4 = 0.0;
        }
        this.ow = d3;
        this.zw = d4;
    }

    public void ay(ho ho2, double d, double d2) {
        this.zk = ho2;
        this.ow = d;
        this.zw = d2;
    }

    public void rf(kb kb2, double d, double d2) {
        double d3 = 0.0;
        double d4 = 0.0;
        if (this.zk.isLeft()) {
            d3 = kb2.ch() / 2.0;
        }
        if (this.zk.isRightSide()) {
            d3 = -kb2.ch() / 2.0;
        }
        if (this.zk.isTop()) {
            d4 = kb2.iq() / 2.0;
        } else if (this.zk.isBottomSide()) {
            d4 = -kb2.iq() / 2.0;
        }
        this.ow = d - this.zk.getX(iz.aY()) - d3;
        this.zw = d2 - this.zk.getY(iz.aZ()) - d4;
    }

    public void ay(ho ho2, double d, double d2, double d3) {
        this.zk = ho2;
        this.ow = d;
        this.zw = d2;
        this.fk = d3;
    }

    public double yx() {
        return this.fk;
    }

    public boolean xv() {
        return this.ks;
    }
}
