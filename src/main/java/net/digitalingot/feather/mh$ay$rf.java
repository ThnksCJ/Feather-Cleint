package net.digitalingot.feather;

import org.capnproto.*;

public final class mh$ay$rf
extends StructFactory<mh.ay.ay, mh.ay.uj> {
    public final mh.ay.uj sd(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new mh.ay.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final mh.ay.ay sd(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new mh.ay.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final mh.ay.uj ay(mh.ay.ay ay2) {
        return ay2.c();
    }

    public StructReader asReader(Object object) {
        return this.ay((mh.ay.ay)((Object)object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.sd(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.sd(segmentReader, n, n2, n3, s, n4);
    }
}
