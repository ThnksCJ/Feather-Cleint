package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$rl$rf
        extends StructFactory<pk.rl.ay, pk.rl.zz> {
    public final pk.rl.zz rc(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.rl.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.rl.ay rc(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.rl.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.rl.zz ay(pk.rl.ay ay2) {
        return ay2.dX();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.rl.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.rc(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.rc(segmentReader, n, n2, n3, s, n4);
    }
}
