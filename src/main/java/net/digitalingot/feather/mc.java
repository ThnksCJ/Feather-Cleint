package net.digitalingot.feather;

import com.google.gson.JsonElement;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Consumer;

public class mc
        implements vt<yh, po, jg> {
    @NotNull
    private final et zs;

    public mc(@NotNull et et2) {
        this.zs = et2;
    }

    @Override
    public void ay(yh yh2, Consumer<po> consumer, Consumer<jg> consumer2) {
        Object object;
        qc qc2 = yh2.lg();
        ej ej2 = zz.nw().xn();
        Mod<?> ux2 = ej2.ay(qc2);
        Object obj = ux2.xd();
        if (yh2.sp() != null) {
            ((zi) obj).enabled = yh2.sp();
        }
        if (yh2.hf() != null) {
            ((zi) obj).bc = yh2.hf();
            object = this.zs.wq().ub();
            if (yh2.hf().booleanValue()) {
                ((cd) object).zh().add(yh2.lg());
            } else {
                ((cd) object).zh().remove(yh2.lg());
            }
            this.zs.ii();
        }
        if (yh2.yi() != null) {
            this.zs.ii();
        }
        if ((object = yh2.lp()) != null) {
            ej2.ay(ux2, (Map<String, JsonElement>) object);
        }
        ej2.bu(ux2);
        consumer.accept(new po("success"));
    }
}
