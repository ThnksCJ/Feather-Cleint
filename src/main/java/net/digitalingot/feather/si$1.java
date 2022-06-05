package net.digitalingot.feather;

import net.digitalingot.feather.enums.si;

final class si$1
        extends si {
    @Override
    public float calculate(float f) {
        return (double) Math.abs(f - 1.0f) < 1.0E-12 ? 1.0f : 1.0f - (float) Math.pow(2.0, -10.0f * f);
    }
}
