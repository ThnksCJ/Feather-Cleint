package net.digitalingot.feather;

import org.capnproto.*;

public class pk$rl {
    public static final StructSize AI = new StructSize(1, 1);
    public static final rf Dg = new rf();
    public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory) Dg);

    public static final class rf
            extends StructFactory<ay, zz> {
        public final zz rc(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new zz(segmentReader, n, n2, n3, s, n4);
        }

        public final ay rc(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final zz ay(ay ay2) {
            return ay2.dX();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.rc(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.rc(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class zz
            extends StructReader {
        zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public uj.uj gK() {
            return new uj.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
        }
    }
}
