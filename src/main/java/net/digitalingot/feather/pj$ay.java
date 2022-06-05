package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;

import java.nio.charset.StandardCharsets;

public class pj$ay
        extends ChannelDuplexHandler {
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        if (!(object instanceof ByteBuf)) {
            throw new IllegalArgumentException("Don't know how to cast " + object.getClass() + " to ByteBuf");
        }
        ByteBuf byteBuf = (ByteBuf) object;
        int n = byteBuf.readableBytes();
        byte[] byArray = new byte[n];
        byteBuf.readBytes(byArray);
        String string = new String(byArray, StandardCharsets.UTF_8);
        if (rf.nl()) {
            vm.Fq.info("Rust Channel -> " + string);
        } else {
            vm.Fq.debug("Rust Channel -> " + string);
        }
        pa pa2 = gw.GSON.fromJson(string, pa.class);
        zz.nw().pv().ay(pa2, gw.rf.RUST_LAUNCHER);
        byteBuf.release();
    }
}
