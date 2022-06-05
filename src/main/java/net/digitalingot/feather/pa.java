package net.digitalingot.feather;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
public class pa {
    @SerializedName(value="requestId")
    private final int th;
    @SerializedName(value="callType")
    @Nullable
    private final ao wr;
    @SerializedName(value="message")
    @Nullable
    private final JsonElement qy;
    @SerializedName(value="success")
    @Nullable
    private final JsonElement ex;
    @SerializedName(value="failure")
    @Nullable
    private final JsonElement tb;

    public pa(int n, @Nullable ao ao2, @Nullable JsonElement jsonElement, @Nullable JsonElement jsonElement2, @Nullable JsonElement jsonElement3) {
        this.th = n;
        this.wr = ao2;
        this.qy = jsonElement;
        this.ex = jsonElement2;
        this.tb = jsonElement3;
    }

    public int zt() {
        return this.th;
    }

    @Nullable
    public ao sh() {
        return this.wr;
    }

    @Nullable
    public JsonElement ri() {
        return this.qy;
    }

    @Nullable
    public JsonElement nk() {
        return this.ex;
    }

    @Nullable
    public JsonElement bb() {
        return this.tb;
    }
}
