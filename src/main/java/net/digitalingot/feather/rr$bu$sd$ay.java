package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$sd$ay
        extends StructBuilder {
    rr$bu$sd$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.bu.sd.zz hC() {
        return new rr.bu.sd.zz((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final rr.bu.sd.uj.ay hD() {
        return (rr.bu.sd.uj.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.bu.sd.uj.Dq, 0, null, 0));
    }

    public final void ay(rr.bu.sd.uj.uj uj2) {
        this._setPointerField((SetPointerBuilder) rr.bu.sd.uj.Dq, 0, (Object) uj2);
    }

    public final rr.bu.sd.uj.ay hE() {
        return (rr.bu.sd.uj.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.bu.sd.uj.Dq, 0, 0));
    }

    public final boolean hF() {
        return !this._pointerFieldIsNull(1);
    }

    public final Text.Builder hG() {
        return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 1, null, 0, 0);
    }

    public final void sd(Text.Reader reader) {
        this._setPointerField((SetPointerBuilder) Text.factory, 1, reader);
    }

    public final void pm(String string) {
        this._setPointerField((SetPointerBuilder) Text.factory, 1, new Text.Reader(string));
    }

    public final Text.Builder sw(int n) {
        return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 1, n);
    }

    public final boolean hH() {
        return !this._pointerFieldIsNull(2);
    }

    public final TextList.Builder hI() {
        return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 2, null, 0);
    }

    public final void rf(TextList.Reader reader) {
        this._setPointerField((SetPointerBuilder) TextList.factory, 2, reader);
    }

    public final TextList.Builder gb(int n) {
        return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 2, n);
    }

    public final boolean hJ() {
        return !this._pointerFieldIsNull(3);
    }

    public final TextList.Builder hK() {
        return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 3, null, 0);
    }

    public final void uj(TextList.Reader reader) {
        this._setPointerField((SetPointerBuilder) TextList.factory, 3, reader);
    }

    public final TextList.Builder yd(int n) {
        return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 3, n);
    }

    public final boolean hL() {
        return !this._pointerFieldIsNull(4);
    }

    public final TextList.Builder hM() {
        return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 4, null, 0);
    }

    public final void zz(TextList.Reader reader) {
        this._setPointerField((SetPointerBuilder) TextList.factory, 4, reader);
    }

    public final TextList.Builder wi(int n) {
        return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 4, n);
    }
}
