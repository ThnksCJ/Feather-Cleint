package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.*;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Inherited
public @interface sv {
    @NotNull qc aw();

    @NotNull bx jf();
}
