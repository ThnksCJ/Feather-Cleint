package net.digitalingot.feather.enums;

import static net.digitalingot.feather.ho$1.jh;

public enum ho {
    TOP_LEFT,
    TOP_RIGHT,
    TOP_CENTER,
    BOTTOM_LEFT,
    BOTTOM_RIGHT,
    BOTTOM_CENTER,
    CENTER_LEFT,
    CENTER_RIGHT;


    public double getX(double d) {
        switch (1. jh[this.ordinal()]){
            case 1:
            case 2:
            case 3: {
                return d;
            }
            case 4:
            case 5: {
                return d / 2.0;
            }
        }
        return 0.0;
    }

    public double getY(double d) {
        switch (1. jh[this.ordinal()]){
            case 2:
            case 5:
            case 6: {
                return d;
            }
            case 3:
            case 7: {
                return d / 2.0;
            }
        }
        return 0.0;
    }

    public boolean isLeft() {
        return this == CENTER_LEFT || this == TOP_LEFT || this == BOTTOM_LEFT;
    }

    public boolean isRightSide() {
        switch (1. jh[this.ordinal()]){
            case 1:
            case 2:
            case 3: {
                return true;
            }
        }
        return false;
    }

    public boolean isTop() {
        return this == TOP_LEFT || this == TOP_RIGHT || this == TOP_CENTER;
    }

    public boolean isBottomSide() {
        switch (1. jh[this.ordinal()]){
            case 2:
            case 5:
            case 6: {
                return true;
            }
        }
        return false;
    }
}
