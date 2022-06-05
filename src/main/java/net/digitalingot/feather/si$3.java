package net.digitalingot.feather;

import net.digitalingot.feather.enums.si;

final class si$3
extends si {
    @Override
    public float calculate(float f) {
        return (float)((double)f < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0f * f, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0f * f + 2.0f, 2.0)) + 1.0) / 2.0);
    }
}
