package net.digitalingot.feather;

import net.digitalingot.feather.lx;
import org.capnproto.*;

public final class lx$rf$rf
        extends StructFactory<lx.rf.ay, lx.rf.uj> {
    public final lx.rf.uj ed(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new lx.rf.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final lx.rf.ay ed(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new lx.rf.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final lx.rf.uj ay(lx.rf.ay ay2) {
        return ay2.A();
    }

    public StructReader asReader(Object object) {
        return this.ay((lx.rf.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.ed(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.ed(segmentReader, n, n2, n3, s, n4);
    }
}
