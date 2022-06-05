package net.digitalingot.feather.enums;

public enum ru {
    ULTRA(1.0f),
    HIGH(0.85f),
    MEDIUM(0.75f),
    LOW(0.6f);

    private final float scale;

    ru(float f) {
        this.scale = f;
    }

    public float getScale() {
        return this.scale;
    }
}
