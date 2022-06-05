package net.digitalingot.feather;

import net.digitalingot.feather.enums.si;

final class si$2
extends si {
    @Override
    public float calculate(float f) {
        return (double)f < 0.5 ? 2.0f * f * f : (float)(1.0 - Math.pow(-2.0f * f + 2.0f, 2.0) / 2.0);
    }
}
