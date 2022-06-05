package net.digitalingot.feather;

import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class cm$uj$uj$uj
        extends StructReader {
    cm$uj$uj$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public cm.uj.uj.zz sj() {
        switch (this._getShortField(0)) {
            case 0: {
                return cm.uj.uj.zz.AUTH_SUCCESSFUL;
            }
            case 1: {
                return cm.uj.uj.zz.TODO;
            }
        }
        return cm.uj.uj.zz._NOT_IN_SCHEMA;
    }

    public final boolean ur() {
        return this.sj() == cm.uj.uj.zz.AUTH_SUCCESSFUL;
    }

    public boolean xz() {
        return !this._pointerFieldIsNull(0);
    }

    public cm.ay.uj a() {
        assert (this.sj() == cm.uj.uj.zz.AUTH_SUCCESSFUL) : "Must check which() before get()ing a union member.";
        return (cm.ay.uj) ((Object) this._getPointerField((FromPointerReaderRefDefault) cm.ay.AL, 0, null, 0));
    }

    public final boolean eh() {
        return this.sj() == cm.uj.uj.zz.TODO;
    }

    public final Void fr() {
        assert (this.sj() == cm.uj.uj.zz.TODO) : "Must check which() before get()ing a union member.";
        return Void.VOID;
    }
}
