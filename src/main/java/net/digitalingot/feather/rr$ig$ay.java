package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;

public final class rr$ig$ay
        extends StructBuilder {
    rr$ig$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.ig.zz kS() {
        return new rr.ig.zz((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final rr.ig.uj.ay kT() {
        return new rr.ig.uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }

    public final rr.ig.uj.ay kU() {
        this._setShortField(0, (short) 0);
        this._clearPointerField(0);
        return new rr.ig.uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }
}
