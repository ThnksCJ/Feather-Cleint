package net.digitalingot.feather;

import com.google.gson.Gson;
import net.digitalingot.feather.lk;
import org.jetbrains.annotations.NotNull;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Function;

public interface rw
extends Closeable,
AutoCloseable {
    @NotNull OutputStream oD();

    @NotNull
    default lk oE() {
        return new lk(this);
    }

    default void nl(@NotNull Object object) {
        this.ay(new Gson(), object);
    }

    default void ay(@NotNull Gson gson, @NotNull Object object) {
        this.wi(gson.toJson(object));
    }

    default void wi(@NotNull String string) {
        this.iu(string.getBytes());
    }

    default void iu(byte[] byArray) {
        this.uj(outputStream -> outputStream.write(byArray));
    }

    default void sd(@NotNull InputStream inputStream) {
        block0: {
            InputStream inputStream2 = inputStream;
            this.uj(outputStream -> {
                int n;
                int n2 = inputStream2.available();
                if (n2 < 8192) {
                    n2 = 8192;
                }
                byte[] byArray = new byte[n2];
                while ((n = inputStream2.read(byArray, 0, n2)) >= 0) {
                    outputStream.write(byArray, 0, n);
                }
            });
            if (inputStream2 == null) break block0;
            inputStream2.close();
        }
    }

    default <T> T rf(@NotNull Function<OutputStream, T> function) {
        OutputStream outputStream = this.oD();
        T t = function.apply(outputStream);
        ha.ay(this);
        return t;
    }

    default void uj(@NotNull Consumer<OutputStream> consumer) {
        OutputStream outputStream = this.oD();
        consumer.accept(outputStream);
        ha.ay(this);
    }
}
