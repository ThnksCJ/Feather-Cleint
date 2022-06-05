package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;

public final class rr$bu$ay
        extends StructBuilder {
    rr$bu$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.bu.uj gT() {
        return new rr.bu.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final rr.bu.bu.ay gU() {
        return new rr.bu.bu.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }

    public final rr.bu.bu.ay gV() {
        this._setShortField(0, (short) 0);
        this._clearPointerField(0);
        return new rr.bu.bu.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }
}
