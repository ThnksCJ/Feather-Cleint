package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$sd$uj$rf
        extends StructFactory<rr.bu.sd.uj.ay, rr.bu.sd.uj.uj> {
    public final rr.bu.sd.uj.uj on(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.bu.sd.uj.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.bu.sd.uj.ay on(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.bu.sd.uj.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.bu.sd.uj.uj ay(rr.bu.sd.uj.ay ay2) {
        return ay2.hN();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.bu.sd.uj.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.on(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.on(segmentReader, n, n2, n3, s, n4);
    }
}
