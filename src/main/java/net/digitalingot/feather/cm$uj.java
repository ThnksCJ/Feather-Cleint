package net.digitalingot.feather;

import org.capnproto.*;

public class cm$uj {
    public static final StructSize AI = new StructSize(1, 1);
    public static final rf AP = new rf();
    public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory)AP);

    public static final class rf
    extends StructFactory<ay, zz> {
        public final zz uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new zz(segmentReader, n, n2, n3, s, n4);
        }

        public final ay uj(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final zz ay(ay ay2) {
            return ay2.jk();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay)object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.uj(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.uj(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class zz
    extends StructReader {
        zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public uj.uj b() {
            return new uj.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
        }
    }
}
