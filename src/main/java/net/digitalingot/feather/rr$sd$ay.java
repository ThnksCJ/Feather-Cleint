package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$sd$ay
        extends StructBuilder {
    rr$sd$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.sd.uj gS() {
        return new rr.sd.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean d() {
        return !this._pointerFieldIsNull(0);
    }

    public final Text.Builder e() {
        return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 0, null, 0, 0);
    }

    public final void ay(Text.Reader reader) {
        this._setPointerField((SetPointerBuilder) Text.factory, 0, reader);
    }

    public final void hj(String string) {
        this._setPointerField((SetPointerBuilder) Text.factory, 0, new Text.Reader(string));
    }

    public final Text.Builder it(int n) {
        return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 0, n);
    }
}
