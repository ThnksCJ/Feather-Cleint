package net.digitalingot.feather;

import org.capnproto.*;

public class pk$ay {
    public static final StructSize AI = new StructSize(0, 1);
    public static final rf Cx = new rf();
    public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory)Cx);

    public static final class rf
    extends StructFactory<ay, zz> {
        public final zz zs(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new zz(segmentReader, n, n2, n3, s, n4);
        }

        public final ay zs(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final zz ay(ay ay2) {
            return ay2.bO();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay)object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.zs(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.zs(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static classpk$ay$uj {
        public static final StructSize AI = new StructSize(1, 2);
        public static final uj Cy = new uj();
        public static final StructList.Factory<ay, sd> AK = new StructList.Factory((StructFactory)Cy);

        public static final class uj
        extends StructFactory<ay, sd> {
            public final sd pv(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new sd(segmentReader, n, n2, n3, s, n4);
            }

            public final ay pv(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final sd ay(ay ay2) {
                return ay2.bR();
            }

            public StructReader asReader(Object object) {
                return this.ay((ay)object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.pv(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.pv(segmentReader, n, n2, n3, s, n4);
            }
        }

        public static final class sd
        extends StructReader {
            sd(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                super(segmentReader, n, n2, n3, s, n4);
            }

            public boolean bS() {
                return !this._pointerFieldIsNull(0);
            }

            public Data.Reader cH() {
                return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, null, 0, 0);
            }

            public rf.uj cI() {
                return new rf.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
            }
        }
    }

    public static final class zz
    extends StructReader {
        zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public final boolean bP() {
            return !this._pointerFieldIsNull(0);
        }

        public final StructList.Reader<uj.sd> cJ() {
            return (StructList.Reader)this._getPointerField((FromPointerReaderRefDefault)uj.AK, 0, null, 0);
        }
    }
}
