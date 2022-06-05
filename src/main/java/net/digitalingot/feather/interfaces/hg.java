package net.digitalingot.feather.interfaces;

import com.google.common.io.ByteStreams;
import com.google.gson.Gson;
import net.digitalingot.feather.ha;
import net.digitalingot.feather.xk;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public interface hg
        extends Closeable,
        AutoCloseable {
    @NotNull InputStream nY();

    default void ay(@NotNull rw rw2) {
        this.rf(rw2::sd);
    }

    @NotNull
    default hg nZ() {
        return new xk(this);
    }

    default byte[] oA() {
        return this.ay((InputStream inputStream) -> ByteStreams.toByteArray(inputStream));
    }

    default <T> T ay(@NotNull Type type) {
        Gson gson = new Gson();
        return this.ay(gson, type);
    }

    default <T> T nn(@NotNull Class<T> clazz) {
        Gson gson = new Gson();
        return this.ay(gson, clazz);
    }

    default <T> T ay(@NotNull Gson gson, @NotNull Class<T> clazz) {
        return gson.fromJson(this.oB(), clazz);
    }

    default <T> T ay(@NotNull Gson gson, @NotNull Type type) {
        return gson.fromJson(this.oB(), type);
    }

    @NotNull
    default String oB() {
        return String.join("\n", this.oC());
    }

    @NotNull
    default List<String> oC() {
        return this.ay((InputStream inputStream) -> {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList<String> arrayList = new ArrayList<String>();
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            ArrayList<String> arrayList2 = arrayList;
            bufferedReader.close();
            return arrayList2;
        });
    }

    default <T> T ay(@NotNull Function<InputStream, T> function) {
        InputStream inputStream = this.nY();
        T t = function.apply(inputStream);
        ha.ay(this);
        return t;
    }

    default void rf(@NotNull Consumer<InputStream> consumer) {
        InputStream inputStream = this.nY();
        consumer.accept(inputStream);
        ha.ay(this);
    }
}
