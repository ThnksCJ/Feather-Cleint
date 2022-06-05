package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$iu$uj$rf
        extends StructFactory<rr.iu.uj.ay, rr.iu.uj.uj> {
    public final rr.iu.uj.uj bv(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.iu.uj.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.iu.uj.ay bv(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.iu.uj.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.iu.uj.uj ay(rr.iu.uj.ay ay2) {
        return ay2.kB();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.iu.uj.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.bv(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.bv(segmentReader, n, n2, n3, s, n4);
    }
}
