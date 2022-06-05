package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$ig$uj$ay
        extends StructBuilder {
    rr$ig$uj$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public rr.ig.uj.zz kV() {
        switch (this._getShortField(0)) {
            case 0: {
                return rr.ig.uj.zz.HANDSHAKE;
            }
            case 1: {
                return rr.ig.uj.zz.METRICS;
            }
            case 2: {
                return rr.ig.uj.zz.TRACKING_UPDATE;
            }
            case 3: {
                return rr.ig.uj.zz.BULK_OPTION_REQUEST;
            }
            case 4: {
                return rr.ig.uj.zz.COSMETIC_REQUEST;
            }
            case 5: {
                return rr.ig.uj.zz.COSMETIC_SET;
            }
            case 6: {
                return rr.ig.uj.zz.EMOTE_EXECUTE;
            }
            case 7: {
                return rr.ig.uj.zz.PARTY_CREATE;
            }
            case 8: {
                return rr.ig.uj.zz.PARTY_SET_OWNER;
            }
            case 9: {
                return rr.ig.uj.zz.PARTY_INVITE;
            }
            case 10: {
                return rr.ig.uj.zz.PARTY_INVITE_RESPONSE;
            }
            case 11: {
                return rr.ig.uj.zz.PARTY_LEAVE;
            }
            case 12: {
                return rr.ig.uj.zz.PARTY_SETTINGS;
            }
            case 13: {
                return rr.ig.uj.zz.P2P_JOIN_REQUEST;
            }
            case 14: {
                return rr.ig.uj.zz.P2P_JOIN_ACCEPTED;
            }
        }
        return rr.ig.uj.zz._NOT_IN_SCHEMA;
    }

    public final rr.ig.uj.uj kW() {
        return new rr.ig.uj.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean p() {
        return this.kV() == rr.ig.uj.zz.HANDSHAKE;
    }

    public final rr.sd.ay kX() {
        assert (this.kV() == rr.ig.uj.zz.HANDSHAKE) : "Must check which() before get()ing a union member.";
        return (rr.sd.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.sd.Dm, 0, null, 0));
    }

    public final void ay(rr.sd.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.HANDSHAKE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.sd.Dm, 0, (Object) uj2);
    }

    public final rr.sd.ay kY() {
        this._setShortField(0, (short) rr.ig.uj.zz.HANDSHAKE.ordinal());
        return (rr.sd.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.sd.Dm, 0, 0));
    }

    public final boolean kZ() {
        return this.kV() == rr.ig.uj.zz.METRICS;
    }

    public final rr.bu.ay lA() {
        assert (this.kV() == rr.ig.uj.zz.METRICS) : "Must check which() before get()ing a union member.";
        return (rr.bu.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.bu.Dn, 0, null, 0));
    }

    public final void ay(rr.bu.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.METRICS.ordinal());
        this._setPointerField((SetPointerBuilder) rr.bu.Dn, 0, (Object) uj2);
    }

    public final rr.bu.ay lB() {
        this._setShortField(0, (short) rr.ig.uj.zz.METRICS.ordinal());
        return (rr.bu.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.bu.Dn, 0, 0));
    }

    public final boolean lC() {
        return this.kV() == rr.ig.uj.zz.TRACKING_UPDATE;
    }

    public final rr.iu.ay lD() {
        assert (this.kV() == rr.ig.uj.zz.TRACKING_UPDATE) : "Must check which() before get()ing a union member.";
        return (rr.iu.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.iu.Eb, 0, null, 0));
    }

    public final void ay(rr.iu.zz zz2) {
        this._setShortField(0, (short) rr.ig.uj.zz.TRACKING_UPDATE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.iu.Eb, 0, (Object) zz2);
    }

    public final rr.iu.ay lE() {
        this._setShortField(0, (short) rr.ig.uj.zz.TRACKING_UPDATE.ordinal());
        return (rr.iu.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.iu.Eb, 0, 0));
    }

    public final boolean lF() {
        return this.kV() == rr.ig.uj.zz.BULK_OPTION_REQUEST;
    }

    public final rr.ay.ay lG() {
        assert (this.kV() == rr.ig.uj.zz.BULK_OPTION_REQUEST) : "Must check which() before get()ing a union member.";
        return (rr.ay.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.ay.Di, 0, null, 0));
    }

    public final void ay(rr.ay.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.BULK_OPTION_REQUEST.ordinal());
        this._setPointerField((SetPointerBuilder) rr.ay.Di, 0, (Object) uj2);
    }

    public final rr.ay.ay lH() {
        this._setShortField(0, (short) rr.ig.uj.zz.BULK_OPTION_REQUEST.ordinal());
        return (rr.ay.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.ay.Di, 0, 0));
    }

    public final boolean lI() {
        return this.kV() == rr.ig.uj.zz.COSMETIC_REQUEST;
    }

    public final rr.rf.ay lJ() {
        assert (this.kV() == rr.ig.uj.zz.COSMETIC_REQUEST) : "Must check which() before get()ing a union member.";
        return (rr.rf.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.rf.Dj, 0, null, 0));
    }

    public final void ay(rr.rf.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.COSMETIC_REQUEST.ordinal());
        this._setPointerField((SetPointerBuilder) rr.rf.Dj, 0, (Object) uj2);
    }

    public final rr.rf.ay lK() {
        this._setShortField(0, (short) rr.ig.uj.zz.COSMETIC_REQUEST.ordinal());
        return (rr.rf.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.rf.Dj, 0, 0));
    }

    public final boolean eQ() {
        return this.kV() == rr.ig.uj.zz.COSMETIC_SET;
    }

    public final rr.uj.ay lL() {
        assert (this.kV() == rr.ig.uj.zz.COSMETIC_SET) : "Must check which() before get()ing a union member.";
        return (rr.uj.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.uj.Dk, 0, null, 0);
    }

    public final void ay(rr.uj.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.COSMETIC_SET.ordinal());
        this._setPointerField((SetPointerBuilder) rr.uj.Dk, 0, uj2);
    }

    public final rr.uj.ay lM() {
        this._setShortField(0, (short) rr.ig.uj.zz.COSMETIC_SET.ordinal());
        return (rr.uj.ay) this._initPointerField((FromPointerBuilder) rr.uj.Dk, 0, 0);
    }

    public final boolean lN() {
        return this.kV() == rr.ig.uj.zz.EMOTE_EXECUTE;
    }

    public final rr.zz.ay lO() {
        assert (this.kV() == rr.ig.uj.zz.EMOTE_EXECUTE) : "Must check which() before get()ing a union member.";
        return (rr.zz.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.zz.Dl, 0, null, 0);
    }

    public final void ay(rr.zz.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.EMOTE_EXECUTE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.zz.Dl, 0, uj2);
    }

    public final rr.zz.ay lP() {
        this._setShortField(0, (short) rr.ig.uj.zz.EMOTE_EXECUTE.ordinal());
        return (rr.zz.ay) this._initPointerField((FromPointerBuilder) rr.zz.Dl, 0, 0);
    }

    public final boolean lQ() {
        return this.kV() == rr.ig.uj.zz.PARTY_CREATE;
    }

    public final rr.ed.ay lR() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_CREATE) : "Must check which() before get()ing a union member.";
        return (rr.ed.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.ed.Du, 0, null, 0);
    }

    public final void ay(rr.ed.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_CREATE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.ed.Du, 0, uj2);
    }

    public final rr.ed.ay lS() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_CREATE.ordinal());
        return (rr.ed.ay) this._initPointerField((FromPointerBuilder) rr.ed.Du, 0, 0);
    }

    public final boolean lT() {
        return this.kV() == rr.ig.uj.zz.PARTY_SET_OWNER;
    }

    public final rr.xn.ay lU() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_SET_OWNER) : "Must check which() before get()ing a union member.";
        return (rr.xn.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.xn.Dz, 0, null, 0);
    }

    public final void ay(rr.xn.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_SET_OWNER.ordinal());
        this._setPointerField((SetPointerBuilder) rr.xn.Dz, 0, uj2);
    }

    public final rr.xn.ay lV() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_SET_OWNER.ordinal());
        return (rr.xn.ay) this._initPointerField((FromPointerBuilder) rr.xn.Dz, 0, 0);
    }

    public final boolean eZ() {
        return this.kV() == rr.ig.uj.zz.PARTY_INVITE;
    }

    public final rr.zs.ay lW() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_INVITE) : "Must check which() before get()ing a union member.";
        return (rr.zs.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.zs.Dv, 0, null, 0);
    }

    public final void ay(rr.zs.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_INVITE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.zs.Dv, 0, uj2);
    }

    public final rr.zs.ay lX() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_INVITE.ordinal());
        return (rr.zs.ay) this._initPointerField((FromPointerBuilder) rr.zs.Dv, 0, 0);
    }

    public final boolean lY() {
        return this.kV() == rr.ig.uj.zz.PARTY_INVITE_RESPONSE;
    }

    public final rr.nl.ay lZ() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_INVITE_RESPONSE) : "Must check which() before get()ing a union member.";
        return (rr.nl.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.nl.Dw, 0, null, 0);
    }

    public final void ay(rr.nl.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_INVITE_RESPONSE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.nl.Dw, 0, uj2);
    }

    public final rr.nl.ay mA() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_INVITE_RESPONSE.ordinal());
        return (rr.nl.ay) this._initPointerField((FromPointerBuilder) rr.nl.Dw, 0, 0);
    }

    public final boolean fE() {
        return this.kV() == rr.ig.uj.zz.PARTY_LEAVE;
    }

    public final rr.pv.ay mB() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_LEAVE) : "Must check which() before get()ing a union member.";
        return (rr.pv.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.pv.Dx, 0, null, 0);
    }

    public final void ay(rr.pv.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_LEAVE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.pv.Dx, 0, uj2);
    }

    public final rr.pv.ay mC() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_LEAVE.ordinal());
        return (rr.pv.ay) this._initPointerField((FromPointerBuilder) rr.pv.Dx, 0, 0);
    }

    public final boolean mD() {
        return this.kV() == rr.ig.uj.zz.PARTY_SETTINGS;
    }

    public final rr.rl.ay mE() {
        assert (this.kV() == rr.ig.uj.zz.PARTY_SETTINGS) : "Must check which() before get()ing a union member.";
        return (rr.rl.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.rl.DA, 0, null, 0);
    }

    public final void ay(rr.rl.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_SETTINGS.ordinal());
        this._setPointerField((SetPointerBuilder) rr.rl.DA, 0, uj2);
    }

    public final rr.rl.ay mF() {
        this._setShortField(0, (short) rr.ig.uj.zz.PARTY_SETTINGS.ordinal());
        return (rr.rl.ay) this._initPointerField((FromPointerBuilder) rr.rl.DA, 0, 0);
    }

    public final boolean fH() {
        return this.kV() == rr.ig.uj.zz.P2P_JOIN_REQUEST;
    }

    public final rr.nn.ay mG() {
        assert (this.kV() == rr.ig.uj.zz.P2P_JOIN_REQUEST) : "Must check which() before get()ing a union member.";
        return (rr.nn.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.nn.Dt, 0, null, 0);
    }

    public final void ay(rr.nn.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.P2P_JOIN_REQUEST.ordinal());
        this._setPointerField((SetPointerBuilder) rr.nn.Dt, 0, uj2);
    }

    public final rr.nn.ay mH() {
        this._setShortField(0, (short) rr.ig.uj.zz.P2P_JOIN_REQUEST.ordinal());
        return (rr.nn.ay) this._initPointerField((FromPointerBuilder) rr.nn.Dt, 0, 0);
    }

    public final boolean fK() {
        return this.kV() == rr.ig.uj.zz.P2P_JOIN_ACCEPTED;
    }

    public final rr.kl.ay mI() {
        assert (this.kV() == rr.ig.uj.zz.P2P_JOIN_ACCEPTED) : "Must check which() before get()ing a union member.";
        return (rr.kl.ay) this._getPointerField((FromPointerBuilderRefDefault) rr.kl.Ds, 0, null, 0);
    }

    public final void ay(rr.kl.uj uj2) {
        this._setShortField(0, (short) rr.ig.uj.zz.P2P_JOIN_ACCEPTED.ordinal());
        this._setPointerField((SetPointerBuilder) rr.kl.Ds, 0, uj2);
    }

    public final rr.kl.ay mJ() {
        this._setShortField(0, (short) rr.ig.uj.zz.P2P_JOIN_ACCEPTED.ordinal());
        return (rr.kl.ay) this._initPointerField((FromPointerBuilder) rr.kl.Ds, 0, 0);
    }
}
