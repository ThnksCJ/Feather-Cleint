package net.digitalingot.feather;

import org.capnproto.*;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public final class rr$sd$rf
extends StructFactory<rr.sd.ay, rr.sd.uj> {
    public final rr.sd.uj do(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.sd.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.sd.ay do(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.sd.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.sd.uj ay(rr.sd.ay ay2) {
        return ay2.gS();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.sd.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.do(segmentBuilder, n, n2, n3, s)
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.do(segmentReader, n, n2, n3, s, n4)
    }
}
