package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vc;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "feather", name = "Feather Client", version = "1.0.0-SNAPSHOT", clientSideOnly = true, acceptedMinecraftVersions = "[1.12.2]")
public class FeatherMod {
    @Mod.EventHandler
    public void ay(FMLInitializationEvent fMLInitializationEvent) {
        if (fMLInitializationEvent.getSide() != Side.CLIENT) {
            return;
        }
        rf rf2 = new rf(Minecraft.getMinecraft());
        rf2.ay(ka.h);
    }

    @Mod.EventHandler
    public void ay(FMLPostInitializationEvent fMLPostInitializationEvent) {
        if (fMLPostInitializationEvent.getSide() != Side.CLIENT) {
            return;
        }
        vc.bo.mg().registerCommands(null);
    }
}
