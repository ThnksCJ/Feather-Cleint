package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$rf
        extends StructFactory<rr.bu.ay, rr.bu.uj> {
    public final rr.bu.uj op(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.bu.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.bu.ay op(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.bu.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.bu.uj ay(rr.bu.ay ay2) {
        return ay2.gT();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.bu.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.op(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.op(segmentReader, n, n2, n3, s, n4);
    }
}
