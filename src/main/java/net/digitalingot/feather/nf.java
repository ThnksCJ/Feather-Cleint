package net.digitalingot.feather;

import io.netty.channel.Channel;
import net.digitalingot.feather.fs;
import net.digitalingot.feather.ps;
import org.capnproto.*;
import org.jetbrains.annotations.NotNull;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

public class nf
        extends jq {
    @NotNull
    private List<UUID> Ct = new ArrayList<UUID>();

    nf(@NotNull Channel channel, @NotNull gk gk2) {
        super(channel, gk2);
    }

    public void ay(Consumer<rr.bu.sd.ay> consumer) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.bu.sd.ay ay2 = this.zz(messageBuilder).lB().gV().iJ();
        consumer.accept(ay2);
        this.ay(messageBuilder);
    }

    public void ay(@NotNull String string, short s) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.bu.zz.ay ay2 = this.zz(messageBuilder).lB().gV().iM();
        ay2.jw(string);
        ay2.rf(s);
        this.ay(messageBuilder);
    }

    public void bI() {
        MessageBuilder messageBuilder = new MessageBuilder();
        this.zz(messageBuilder).lB().gV().zz(Void.VOID);
        this.ay(messageBuilder);
    }

    public void bJ() {
        MessageBuilder messageBuilder = new MessageBuilder();
        this.zz(messageBuilder).lE().kA().kl(Void.VOID);
        this.Ct.clear();
        this.ay(messageBuilder);
    }

    public void ay(@NotNull List<UUID> list, @NotNull Set<UUID> set) {
        Object object;
        ArrayList<UUID> arrayList = new ArrayList<UUID>(list);
        arrayList.removeAll(this.Ct);
        ArrayList<UUID> arrayList2 = new ArrayList<UUID>(this.Ct);
        arrayList2.removeAll(list);
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            object = new ArrayList<UUID>(arrayList);
            object.removeAll(set);
            if (!set.isEmpty()) {
                this.xn((List<UUID>) object);
            }
        }
        object = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz((MessageBuilder) object);
        rr.iu.ay ay3 = ay2.lE();
        rr.iu.sd.ay ay4 = ay3.kA();
        rr.iu.uj.ay ay5 = ay4.kN();
        DataList.Builder builder = ay5.yl(arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            UUID uUID = arrayList.get(i);
            builder.set(i, new Data.Reader(hc.sy(uUID)));
        }
        DataList.Builder builder2 = ay5.ek(arrayList2.size());
        for (int i = 0; i < arrayList2.size(); ++i) {
            UUID uUID = arrayList2.get(i);
            builder2.set(i, new Data.Reader(hc.sy(uUID)));
        }
        this.Ct = list;
        this.ay((MessageBuilder) object);
    }

    public void rf(@NotNull Set<UUID> set) {
        this.hG.bD().keySet().removeIf(uUID -> !set.contains(uUID));
        set.removeAll(this.hG.bD().keySet());
        if (set.isEmpty()) {
            return;
        }
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.ay.ay ay3 = ay2.lH();
        DataList.Builder builder = ay3.nb(set.size());
        int n = 0;
        for (UUID uUID2 : set) {
            builder.set(n, new Data.Reader(hc.sy(uUID2)));
            ++n;
        }
        this.ay(messageBuilder);
    }

    public void pv(@NotNull List<sb> list) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.uj.ay ay3 = ay2.lM();
        TextList.Builder builder = ay3.hl(list.size());
        for (int i = 0; i < list.size(); ++i) {
            sb sb2 = list.get(i);
            String string = sb2.getSlug();
            builder.set(i, new Text.Reader(string));
        }
        this.ay(messageBuilder);
    }

    public void xn(@NotNull List<UUID> list) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.rf.ay ay3 = ay2.lK();
        DataList.Builder builder = ay3.nb(list.size());
        for (int i = 0; i < list.size(); ++i) {
            UUID uUID = list.get(i);
            builder.set(i, new Data.Reader(hc.sy(uUID)));
        }
        this.ay(messageBuilder);
    }

    public void ay(@NotNull nw nw2) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.zz.ay ay3 = ay2.lP();
        ay3.zx(nw2.getSlug());
        this.ay(messageBuilder);
    }

    public void bK() {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        ay2.lS();
        this.ay(messageBuilder);
    }

    public void mm(@NotNull UUID uUID) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.xn.ay ay3 = ay2.lV();
        ay3.rl(hc.sy(uUID));
        this.ay(messageBuilder);
    }

    public void xs(@NotNull UUID uUID) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.zs.ay ay3 = ay2.lX();
        ay3.rl(hc.sy(uUID));
        this.ay(messageBuilder);
    }

    public void rf(int n, boolean bl) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.nl.ay ay3 = ay2.mA();
        ay3.pm(n);
        ay3.sy(bl);
        this.ay(messageBuilder);
    }

    public void bL() {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        ay2.mC().jH().sd(Void.VOID);
        this.ay(messageBuilder);
    }

    public void om(@NotNull UUID uUID) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        ay2.mC().jH().rl(hc.sy(uUID));
        this.ay(messageBuilder);
    }

    public void ay(@NotNull ps.rf rf2) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.rl.ay ay3 = ay2.mF();
        rr.rl.zz.ay ay4 = ay3.jR();
        ay4.ay(rf2);
        this.ay(messageBuilder);
    }

    public void uj(@NotNull UUID uUID, @NotNull fs.ay ay2) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay3 = this.zz(messageBuilder);
        rr.nn.ay ay4 = ay3.mH();
        ps.ay.ay ay5 = ay4.dB();
        this.ay(ay5, ay2);
        ay4.rl(hc.sy(uUID));
        this.ay(messageBuilder);
    }

    public void zz(@NotNull UUID uUID, @NotNull fs.ay ay2) {
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay3 = this.zz(messageBuilder);
        rr.kl.ay ay4 = ay3.mJ();
        ps.ay.ay ay5 = ay4.dB();
        this.ay(ay5, ay2);
        ay4.xn(hc.sy(uUID));
        this.ay(messageBuilder);
    }

    private void ay(@NotNull ps.ay.ay ay2, @NotNull fs.ay ay3) {
        InetSocketAddress inetSocketAddress = ay3.qk();
        String string = inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
        ay2.tf(string);
        ay2.sb(ay3.be());
    }
}
