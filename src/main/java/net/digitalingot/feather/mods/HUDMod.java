package net.digitalingot.feather.mods;

import net.digitalingot.feather.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class HUDMod<C extends zi>
extends Mod<C>
implements be {
    @NotNull
    protected final List<kb> gu;
    @NotNull
    private final pq.ay jx;

    protected HUDMod() {
        pq pq2 = this.getClass().getAnnotation(pq.class);
        if (pq2 == null) {
            throw new jl(this.getClass(), pq.class);
        }
        ArrayList<kb> arrayList = new ArrayList<kb>(pq2.we().length);
        for (xd xd2 : pq2.we()) {
            Class<? extends kb> clazz = xd2.bp();
            kb kb2 = clazz.getDeclaredConstructor(this.getClass()).newInstance(this);
            kb2.uj(this);
            arrayList.add(kb2);
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("HUD Module must have at least one element");
        }
        this.gu = Collections.unmodifiableList(arrayList);
        this.jx = pq2.wy();
    }

    protected HUDMod(@NotNull pq.ay ay2, kb ... kbArray) {
        this(ay2, Arrays.asList(kbArray));
    }

    protected HUDMod(@NotNull pq.ay ay2, @NotNull List<kb> list) {
        if (list.size() == 0) {
            throw new IllegalStateException("HUD Module must have at least one element");
        }
        for (kb kb2 : list) {
            kb2.uj(this);
        }
        this.gu = Collections.unmodifiableList(list);
        this.jx = ay2;
    }

    @Override
    public void zq() {
        super.zq();
        for (kb kb2 : this.gu) {
            kb2.zq();
        }
    }

    @NotNull
    public final kb lu() {
        return this.gu.get(0);
    }

    @NotNull
    public final List<kb> im() {
        return this.gu;
    }

    @Override
    public void ms() {
        for (kb kb2 : this.gu) {
            if (!kb2.te().xv()) continue;
            kb2.ms();
        }
    }

    @Override
    public int br() {
        int n = 0;
        for (kb kb2 : this.gu) {
            n += kb2.br();
        }
        return n;
    }

    @Override
    public int to() {
        int n = 0;
        for (kb kb2 : this.gu) {
            n = Math.max(n, kb2.to());
        }
        return n;
    }

    public pq.ay tk() {
        return this.jx;
    }
}
