package net.digitalingot.feather;

import net.digitalingot.featherserverapi.proto.models.Mod;
import net.minecraftforge.fml.common.Loader;

import java.util.List;
import java.util.stream.Collectors;

public class dk {
    public static List<Mod> pE() {
        return Loader.instance().getIndexedModList().values().stream().map(modContainer -> new Mod(modContainer.getModId(), modContainer.getVersion())).collect(Collectors.toList());
    }
}
