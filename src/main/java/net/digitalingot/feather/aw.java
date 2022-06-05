package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface aw {
    String ie();

    String pr() default "";

    String nh() default "";

    int yu() default -9999;

    int js() default -9999;

    boolean pu() default false;
}
