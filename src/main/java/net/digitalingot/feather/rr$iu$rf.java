package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$iu$rf
extends StructFactory<rr.iu.ay, rr.iu.zz> {
    public final rr.iu.zz lv(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.iu.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.iu.ay lv(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.iu.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.iu.zz ay(rr.iu.ay ay2) {
        return ay2.jY();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.iu.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.lv(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.lv(segmentReader, n, n2, n3, s, n4);
    }
}
