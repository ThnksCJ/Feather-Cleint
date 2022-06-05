package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.*;

public class mh$rf {
    public static final StructSize AI = new StructSize(1, 1);
    public static final rf AS = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) AS);

    public static final class rf
            extends StructFactory<ay, uj> {
        public final uj bu(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay bu(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.g();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.bu(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.bu(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class uj
            extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
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

        public final boolean h() {
            return !this._pointerFieldIsNull(0);
        }

        public final DataList.Reader j() {
            return (DataList.Reader) this._getPointerField((FromPointerReaderRefDefault) DataList.factory, 0, null, 0);
        }
    }

    public static final class ay
            extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj g() {
            return new uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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
}
