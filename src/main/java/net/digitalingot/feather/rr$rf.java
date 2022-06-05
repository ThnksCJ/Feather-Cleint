package net.digitalingot.feather;

import org.capnproto.*;

public class rr$rf {
    public static final StructSize AI = new StructSize(0, 1);
    public static final rf Dj = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory)Dj);

    public static final class rf
    extends StructFactory<ay, uj> {
        public final uj bz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay bz(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.gP();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.bz(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.bz(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class uj
    extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public final boolean gM() {
            return !this._pointerFieldIsNull(0);
        }

        public final DataList.Reader gO() {
            return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, null, 0);
        }
    }

    public static final class ay
    extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj gP() {
            return new uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final boolean gM() {
            return !this._pointerFieldIsNull(0);
        }

        public final DataList.Builder gN() {
            return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, null, 0);
        }

        public final void uj(DataList.Reader reader) {
            this._setPointerField((SetPointerBuilder)DataList.factory, 0, reader);
        }

        public final DataList.Builder nb(int n) {
            return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
        }
    }
}
