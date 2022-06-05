package net.digitalingot.feather;

class ej$1
implements an<T> {
    private T qw;
    final Class yq;

    ej$1(Class clazz) {
        this.yq = clazz;
    }

    @Override
    public T nt() {
        if (this.qw != null) {
            return this.qw;
        }
        sd sd2 = zz.nw();
        if (sd2 == null) {
            return null;
        }
        this.qw = sd2.xn().rf(this.yq);
        return this.qw;
    }
}
