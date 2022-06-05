package net.digitalingot.feather;

import org.capnproto.DataList;
import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class rr$rf$uj
        extends StructReader {
    rr$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final boolean gM() {
        return !this._pointerFieldIsNull(0);
    }

    public final DataList.Reader gO() {
        return (DataList.Reader) this._getPointerField((FromPointerReaderRefDefault) DataList.factory, 0, null, 0);
    }
}
