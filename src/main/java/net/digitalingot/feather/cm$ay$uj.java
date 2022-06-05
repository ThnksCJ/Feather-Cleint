package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class cm$ay$uj
extends StructReader {
    cm$ay$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final int ye() {
        return this._getIntField(0);
    }
}
