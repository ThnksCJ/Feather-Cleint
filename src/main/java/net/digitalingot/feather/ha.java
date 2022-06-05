package net.digitalingot.feather;

import java.io.Closeable;

public class ha {
    public static void ay(Closeable... closeableArray) {
        for (Closeable closeable : closeableArray) {
            if (closeable == null) continue;
            closeable.close();
        }
    }
}
