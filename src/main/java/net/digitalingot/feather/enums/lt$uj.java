package net.digitalingot.feather.enums;

enum lt$uj {
    THIRD(20.0f, 20.0f, 1.0f),
    HALF(30.5f, 20.0f, 1.0f),
    FULL(62.0f, 20.0f, 0.0f);

    private final float width;
    private final float height;
    private final float margin;

    lt$uj(float f, float f2, float f3) {
        this.width = f;
        this.height = f2;
        this.margin = f3;
    }

    static float access$3100(lt$uj uj2) {
        return uj2.width;
    }

    static float access$3200(lt$uj uj2) {
        return uj2.margin;
    }

    static float access$3300(lt$uj uj2) {
        return uj2.height;
    }
}
