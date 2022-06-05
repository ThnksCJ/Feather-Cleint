package net.digitalingot.feather;

import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.TextList;

public final class pk$rf$uj
extends StructReader {
    pk$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final boolean cL() {
        return !this._pointerFieldIsNull(0);
    }

    public final TextList.Reader cN() {
        return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 0, null, 0);
    }
}
