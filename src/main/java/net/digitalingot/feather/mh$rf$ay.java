package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.*;

public final class mh$rf$ay
        extends StructBuilder {
    mh$rf$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final mh.rf.uj g() {
        return new mh.rf.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final je.ay uu() {
        switch (this._getShortField(0)) {
            case 0: {
                return je.ay.PARTY_ONLY;
            }
            case 1: {
                return je.ay.EVERYONE;
            }
        }
        return je.ay._NOT_IN_SCHEMA;
    }

    public final void ay(je.ay ay2) {
        this._setShortField(0, (short) ay2.ordinal());
    }

    public final boolean h() {
        return !this._pointerFieldIsNull(0);
    }

    public final DataList.Builder i() {
        return (DataList.Builder) this._getPointerField((FromPointerBuilderRefDefault) DataList.factory, 0, null, 0);
    }

    public final void ay(DataList.Reader reader) {
        this._setPointerField((SetPointerBuilder) DataList.factory, 0, reader);
    }

    public final DataList.Builder dy(int n) {
        return (DataList.Builder) this._initPointerField((FromPointerBuilder) DataList.factory, 0, n);
    }
}
