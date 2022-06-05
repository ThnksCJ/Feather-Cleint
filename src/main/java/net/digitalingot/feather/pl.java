package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.bs;
import net.digitalingot.feather.interfaces.uq;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

public class pl
        implements bs<Enum<?>> {
    @NotNull
    public Enum<?> kl(@NotNull String string, @NotNull Class<? extends Enum<?>> clazz) {
        for (Enum<?> enum_ : clazz.getEnumConstants()) {
            Field field = clazz.getDeclaredField(enum_.name());
            uq uq2 = field.getDeclaredAnnotation(uq.class);
            if (uq2 == null) {
                throw new IllegalStateException("Enum constant \"" + enum_.name() + "\" in enum \"" + clazz.getName() + "\" not annotated with @EnumValue");
            }
            if (!uq2.wd().equals(string)) continue;
            return enum_;
        }
        throw new lu("Enum constant \"" + string + "\" not found in enum \"" + clazz.getName() + "\"");
    }

    @NotNull
    public String ay(@NotNull Enum<?> enum_) {
        Class<?> clazz = enum_.getDeclaringClass();
        Field field = clazz.getDeclaredField(enum_.name());
        uq uq2 = field.getDeclaredAnnotation(uq.class);
        if (uq2 == null) {
            throw new IllegalStateException("Enum constant \"" + enum_.name() + "\" in enum \"" + clazz.getName() + "\" not annotated with @EnumValue");
        }
        return uq2.wd();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ay((Enum) object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.kl(string, clazz);
    }
}
