package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class rr$bu$uj
        extends StructReader {
    rr$bu$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public rr.bu.bu.uj gW() {
        return new rr.bu.bu.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
    }
}
