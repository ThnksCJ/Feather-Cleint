package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$zz$ay
extends StructBuilder {
    rr$bu$zz$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.bu.zz.uj gX() {
        return new rr.bu.zz.uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean gY() {
        return !this._pointerFieldIsNull(0);
    }

    public final Text.Builder gZ() {
        return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, null, 0, 0);
    }

    public final void zz(Text.Reader reader) {
        this._setPointerField((SetPointerBuilder)Text.factory, 0, reader);
    }

    public final void jw(String string) {
        this._setPointerField((SetPointerBuilder)Text.factory, 0, new Text.Reader(string));
    }

    public final Text.Builder tf(int n) {
        return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
    }

    public final short hA() {
        return this._getShortField(0);
    }

    public final void rf(short s) {
        this._setShortField(0, s);
    }
}
