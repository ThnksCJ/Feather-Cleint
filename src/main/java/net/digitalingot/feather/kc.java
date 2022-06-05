package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.digitalingot.feather.fs;
import net.digitalingot.feather.ps;
import org.capnproto.*;
import org.jetbrains.annotations.NotNull;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class kc
        extends ChannelInboundHandlerAdapter {
    @NotNull
    private final nf Cq;

    public kc(@NotNull nf nf2) {
        this.Cq = nf2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        pk.rl.zz zz2 = (pk.rl.zz) object;
        pk.rl.uj.uj uj2 = zz2.gK();
        switch (1. Cv[uj2.eA().ordinal()]){
            case 1: {
                vm.Fq.error("Received authentication successful packet on Redstone while already authenticated.");
                break;
            }
            case 2: {
                pk.xn.uj uj3 = uj2.fO();
                String string = uj3.dW().toString();
                this.Cq. if ().bE().hs(string);
                break;
            }
            case 3: {
                pk.zz.uj uj4 = uj2.fQ();
                UUID uUID = hc.nw(uj4.cH().toArray());
                String string = uj4.cW().toString();
                this.Cq. if ().bF().ay(uUID, string);
                break;
            }
            case 4: {
                pk.sd.uj uj5 = uj2.fS();
                UUID uUID = hc.nw(uj5.cH().toArray());
                nf nf2 = this.Cq. if ().lx();
                assert (nf2 != null);
                HashSet<UUID> hashSet = new HashSet<UUID>(1);
                hashSet.add(uUID);
                nf2.rf(hashSet);
                break;
            }
            case 5: {
                pk.ay.zz zz3 = uj2.fU();
                StructList.Reader<pk.ay.uj.sd> reader = zz3.cJ();
                for (pk.ay.uj.sd sd2 : reader) {
                    UUID uUID = hc.nw(sd2.cH().toArray());
                    pk.ay.uj.rf.uj uj6 = sd2.cI();
                    this.Cq. if ().bD().put(uUID, uj6);
                }
                break;
            }
            case 6: {
                pk.uj.zz zz4 = uj2.fW();
                StructList.Reader<pk.uj.rf.uj> reader = zz4.cS();
                ArrayList<qe> arrayList = new ArrayList<qe>(reader.size());
                for (pk.uj.rf.uj uj7 : reader) {
                    UUID uUID = hc.nw(uj7.cH().toArray());
                    TextList.Reader reader2 = uj7.cN();
                    ArrayList<String> arrayList2 = new ArrayList<String>(reader2.size());
                    for (Text.Reader reader3 : reader2) {
                        arrayList2.add(reader3.toString());
                    }
                    arrayList.add(new qe(uUID, arrayList2));
                }
                this.Cq. if ().bF().rf(arrayList);
                break;
            }
            case 7: {
                pk.rf.uj uj8 = uj2.fY();
                TextList.Reader reader = uj8.cN();
                ArrayList<String> arrayList = new ArrayList<String>(reader.size());
                for (Text.Reader reader4 : reader) {
                    arrayList.add(reader4.toString());
                }
                this.Cq. if ().bF().uj(arrayList);
                break;
            }
            case 8: {
                pk.nn.uj uj9 = uj2.gl();
                UUID uUID = hc.nw(uj9.dL().toArray());
                ps.rf rf2 = uj9.Q();
                DataList.Reader reader = uj9.dM();
                ArrayList<UUID> arrayList = new ArrayList<UUID>(reader.size());
                for (Data.Reader reader5 : reader) {
                    UUID uUID2 = hc.nw(reader5.toArray());
                    arrayList.add(uUID2);
                }
                this.Cq. if ().bG().ay(uUID, arrayList, rf2);
                break;
            }
            case 9: {
                pk.ed.uj uj10 = uj2.gB();
                int n = uj10.U();
                UUID uUID = hc.nw(uj10.dQ().toArray());
                this.Cq. if ().bG().ay(n, uUID);
                break;
            }
            case 10: {
                pk.zs.uj uj11 = uj2.gD();
                UUID uUID = hc.nw(uj11.cH().toArray());
                this.Cq. if ().bG().nl(uUID);
                break;
            }
            case 11: {
                this.Cq. if ().bG().fq();
                break;
            }
            case 12: {
                pk.kl.uj uj12 = uj2.gH();
                UUID uUID = hc.nw(uj12.dC().toArray());
                fs.ay ay2 = this.ay(uj12.dE());
                this.Cq. if ().bH().ay(uUID, ay2);
                break;
            }
            case 13: {
                pk.bu.uj uj13 = uj2.gJ();
                UUID uUID = hc.nw(uj13.dC().toArray());
                fs.ay ay3 = this.ay(uj13.dE());
                this.Cq. if ().bH().rf(uUID, ay3);
            }
        }
    }

    private fs.ay ay(@NotNull ps.ay.uj uj2) {
        String string = uj2.nO().toString();
        String[] stringArray = string.split(":", 2);
        String string2 = stringArray[0];
        int n = Integer.parseInt(stringArray[1]);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(string2, n);
        byte[] byArray = uj2.nP().toArray();
        return new fs.ay(inetSocketAddress, byArray);
    }
}
