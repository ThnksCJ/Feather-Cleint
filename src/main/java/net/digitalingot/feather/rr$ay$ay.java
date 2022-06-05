package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$ay$ay
        extends StructBuilder {
    rr$ay$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.ay.uj gL() {
        return new rr.ay.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean gM() {
        return !this._pointerFieldIsNull(0);
    }

    public final DataList.Builder gN() {
        return (DataList.Builder) this._getPointerField((FromPointerBuilderRefDefault) DataList.factory, 0, null, 0);
    }

    public final void uj(DataList.Reader reader) {
        this._setPointerField((SetPointerBuilder) DataList.factory, 0, reader);
    }

    public final DataList.Builder nb(int n) {
        return (DataList.Builder) this._initPointerField((FromPointerBuilder) DataList.factory, 0, n);
    }
}
