package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$sd$rf
extends StructFactory<rr.bu.sd.ay, rr.bu.sd.zz> {
    public final rr.bu.sd.zz hs(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.bu.sd.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.bu.sd.ay hs(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.bu.sd.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.bu.sd.zz bu(rr.bu.sd.ay ay2) {
        return ay2.hC();
    }

    public StructReader asReader(Object object) {
        return this.bu((rr.bu.sd.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.hs(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.hs(segmentReader, n, n2, n3, s, n4);
    }
}
