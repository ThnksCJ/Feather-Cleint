package net.digitalingot.feather;

import io.netty.channel.Channel;
import net.digitalingot.feather.interfaces.ey;
import org.capnproto.Data;
import org.capnproto.DataList;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public class gq
        extends dc {
    @NotNull
    private final gm yC;
    private final int AD;

    public gq(@NotNull gm gm2, @NotNull Channel channel, int n) {
        super(channel);
        this.yC = gm2;
        this.AD = n;
    }

    public void pp() {
        ey ey2 = this.yC.vp();
        MessageBuilder messageBuilder = new MessageBuilder();
        mh.zz.ay ay2 = (mh.zz.ay) ((Object) messageBuilder.initRoot((FromPointerBuilder) mh.zz.AX));
        mh.rf.ay ay3 = ay2.m().u();
        ay3.ay(ey2.uu());
        List<UUID> list = ey2.np();
        DataList.Builder builder = ay3.dy(list.size());
        for (int i = 0; i < list.size(); ++i) {
            UUID uUID = list.get(i);
            builder.set(i, new Data.Reader(hc.sy(uUID)));
        }
        this.ay(messageBuilder);
    }

    public int ye() {
        return this.AD;
    }
}
