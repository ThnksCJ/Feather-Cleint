package net.digitalingot.feather;

import org.capnproto.FromPointerReaderBlobDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Text;

public final class rr$bu$sd$uj$uj
extends StructReader {
    rr$bu$sd$uj$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public boolean hO() {
        return !this._pointerFieldIsNull(0);
    }

    public Text.Reader hW() {
        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, null, 0, 0);
    }

    public final short hQ() {
        return this._getShortField(0);
    }

    public final int hR() {
        return this._getIntField(1);
    }

    public boolean hS() {
        return !this._pointerFieldIsNull(1);
    }

    public Text.Reader hX() {
        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 1, null, 0, 0);
    }

    public boolean hU() {
        return !this._pointerFieldIsNull(2);
    }

    public Text.Reader hY() {
        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 2, null, 0, 0);
    }
}
