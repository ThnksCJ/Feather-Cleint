package net.digitalingot.feather;

import org.capnproto.*;

public class pk$uj {
    public static final StructSize AI = new StructSize(0, 1);
    public static final uj CC = new uj();
    public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory) CC);

    public static classpk$uj$rf {
        public static final StructSize AI = new StructSize(0, 2);
        public static final rf CD = new rf();
        public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) CD);

        public static final class rf
                extends StructFactory<ay, uj> {
            public final uj sb(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new uj(segmentReader, n, n2, n3, s, n4);
            }

            public final ay sb(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final uj ay(ay ay2) {
                return ay2.cR();
            }

            public StructReader asReader(Object object) {
                return this.ay((ay) object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.sb(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.sb(segmentReader, n, n2, n3, s, n4);
            }
        }

        public static final class uj
                extends StructReader {
            uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                super(segmentReader, n, n2, n3, s, n4);
            }

            public boolean bS() {
                return !this._pointerFieldIsNull(0);
            }

            public Data.Reader cH() {
                return (Data.Reader) this._getPointerField((FromPointerReaderBlobDefault) Data.factory, 0, null, 0, 0);
            }

            public final boolean cL() {
                return !this._pointerFieldIsNull(1);
            }

            public final TextList.Reader cN() {
                return (TextList.Reader) this._getPointerField((FromPointerReaderRefDefault) TextList.factory, 1, null, 0);
            }
        }
    }

    public static final class uj
            extends StructFactory<ay, zz> {
        public final zz iu(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new zz(segmentReader, n, n2, n3, s, n4);
        }

        public final ay iu(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final zz ay(ay ay2) {
            return ay2.cO();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.iu(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.iu(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class zz
            extends StructReader {
        zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public final boolean cP() {
            return !this._pointerFieldIsNull(0);
        }

        public final StructList.Reader<rf.uj> cS() {
            return (StructList.Reader) this._getPointerField((FromPointerReaderRefDefault) rf.AK, 0, null, 0);
        }
    }
}
