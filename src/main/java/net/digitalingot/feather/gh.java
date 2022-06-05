package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.hj;
import net.minecraft.network.NetworkManager;
import org.jetbrains.annotations.NotNull;

import java.net.InetSocketAddress;

public class gh {
    @NotNull
    private final gk hG;
    private boolean hI;

    public gh(@NotNull gk gk2) {
        this.hG = gk2;
    }

    public void init() {
        hj.dw.ay((entityPlayer, netHandlerPlayClient) -> {
            nf nf2 = this.hG.lx();
            if (nf2 == null) {
                return;
            }
            NetworkManager networkManager = netHandlerPlayClient.getNetworkManager();
            if (networkManager == null) {
                return;
            }
            boolean bl = this.hI = networkManager.isLocalChannel() || !(networkManager.getRemoteAddress() instanceof InetSocketAddress);
            if (this.hI) {
                return;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) networkManager.getRemoteAddress();
            String string = inetSocketAddress.getHostName();
            string = string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
            short s = (short) inetSocketAddress.getPort();
            nf2.ay(string, s);
        });
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            nf nf2 = this.hG.lx();
            if (nf2 == null) {
                return;
            }
            if (this.hI) {
                return;
            }
            nf2.bI();
        });
    }
}
