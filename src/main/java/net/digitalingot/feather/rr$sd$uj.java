package net.digitalingot.feather;

import org.capnproto.FromPointerReaderBlobDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Text;

public final class rr$sd$uj
extends StructReader {
    rr$sd$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public boolean d() {
        return !this._pointerFieldIsNull(0);
    }

    public Text.Reader f() {
        return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, null, 0, 0);
    }
}
