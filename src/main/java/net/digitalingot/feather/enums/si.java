package net.digitalingot.feather.enums;

public enum si {
    OUT_EXPONENTIAL{

        @Override
        public float calculate(float f) {
            return (double)Math.abs(f - 1.0f) < 1.0E-12 ? 1.0f : 1.0f - (float)Math.pow(2.0, -10.0f * f);
        }
    }
    ,
    IN_OUT_QUADRATIC{

        @Override
        public float calculate(float f) {
            return (double)f < 0.5 ? 2.0f * f * f : (float)(1.0 - Math.pow(-2.0f * f + 2.0f, 2.0) / 2.0);
        }
    }
    ,
    IN_OUR_CIRCULAR{

        @Override
        public float calculate(float f) {
            return (float)((double)f < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0f * f, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0f * f + 2.0f, 2.0)) + 1.0) / 2.0);
        }
    }
    ,
    OUT_QUINTIC{

        @Override
        public float calculate(float f) {
            return (float)(1.0 - Math.pow(1.0f - f, 5.0));
        }
    };


    public abstract float calculate(float var1);
}
