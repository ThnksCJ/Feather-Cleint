package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$ig$rf
        extends StructFactory<rr.ig.ay, rr.ig.zz> {
    public final rr.ig.zz it(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.ig.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.ig.ay it(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.ig.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.ig.zz ay(rr.ig.ay ay2) {
        return ay2.kS();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.ig.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.it(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.it(segmentReader, n, n2, n3, s, n4);
    }
}
