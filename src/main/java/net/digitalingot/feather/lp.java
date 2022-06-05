package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class lp
        implements da {
    @SerializedName(value = "id")
    private final int id;
    @SerializedName(value = "server_port")
    @Nullable
    private final Integer qj;
    @SerializedName(value = "peer")
    @NotNull
    private final InetSocketAddress pw;
    @SerializedName(value = "peer_enc_pk")
    private final byte[] dk;

    public lp(int n, @Nullable Integer n2, @NotNull InetSocketAddress inetSocketAddress, byte[] byArray) {
        this.id = n;
        this.qj = n2;
        this.pw = inetSocketAddress;
        this.dk = byArray;
    }

    public int mo() {
        return this.id;
    }

    @Nullable
    public Integer ic() {
        return this.qj;
    }

    @NotNull
    public SocketAddress ju() {
        return this.pw;
    }

    public byte[] be() {
        return this.dk;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.PUNCH_HOLE;
    }
}
