package net.digitalingot.feather;

import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructList;
import org.capnproto.StructReader;

public final class pk$uj$zz
        extends StructReader {
    pk$uj$zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final boolean cP() {
        return !this._pointerFieldIsNull(0);
    }

    public final StructList.Reader<pk.uj.rf.uj> cS() {
        return (StructList.Reader) this._getPointerField((FromPointerReaderRefDefault) pk.uj.rf.AK, 0, null, 0);
    }
}
