package net.digitalingot.feather;

import org.capnproto.*;

public final class mh$zz$rf
        extends StructFactory<mh.zz.ay, mh.zz.zz> {
    public final mh.zz.zz kl(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new mh.zz.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final mh.zz.ay kl(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new mh.zz.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final mh.zz.zz ay(mh.zz.ay ay2) {
        return ay2.k();
    }

    public StructReader asReader(Object object) {
        return this.ay((mh.zz.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.kl(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.kl(segmentReader, n, n2, n3, s, n4);
    }
}
