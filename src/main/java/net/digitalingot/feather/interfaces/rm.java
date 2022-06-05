package net.digitalingot.feather.interfaces;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface rm {
    boolean wm() default false;

    @NotNull xg le() default @xg(ae = "", vu = "", jm = "", un = 0);
}
