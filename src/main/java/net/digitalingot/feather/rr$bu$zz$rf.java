package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$zz$rf
        extends StructFactory<rr.bu.zz.ay, rr.bu.zz.uj> {
    public final rr.bu.zz.uj ww(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.bu.zz.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.bu.zz.ay ww(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.bu.zz.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.bu.zz.uj ay(rr.bu.zz.ay ay2) {
        return ay2.gX();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.bu.zz.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.ww(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.ww(segmentReader, n, n2, n3, s, n4);
    }
}
