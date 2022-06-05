package net.digitalingot.feather;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.util.ResourceLocation;

class dq$uj {
    private final GameProfile cC;
    private boolean cD;
    private String cE;
    private ResourceLocation cF;
    private ResourceLocation cG;
    private ResourceLocation cH;

    public dq$uj(GameProfile gameProfile) {
        this.cC = gameProfile;
    }

    public boolean zv() {
        return this.cF != null;
    }

    public String rg() {
        return this.cE;
    }

    public ResourceLocation ue() {
        this.cl();
        return this.cF;
    }

    public ResourceLocation dj() {
        this.cl();
        return this.cG;
    }

    public ResourceLocation zn() {
        this.cl();
        return this.cH;
    }

    protected void cl() {
        dq$uj uj2 = this;
        synchronized (uj2) {
            if (!this.cD) {
                this.cD = true;
                SkinManager.SkinAvailableCallback skinAvailableCallback = (type, resourceLocation, minecraftProfileTexture) -> {
                    switch (dq .1.bP[type.ordinal()]){
                        case 1: {
                            this.cF = resourceLocation;
                            this.cE = minecraftProfileTexture.getMetadata("model");
                            if (this.cE != null) break;
                            this.cE = "default";
                            break;
                        }
                        case 2: {
                            this.cG = resourceLocation;
                            break;
                        }
                        case 3: {
                            this.cH = resourceLocation;
                            break;
                        }
                    }
                };
                SkinManager skinManager = Minecraft.getMinecraft().getSkinManager();
                skinManager.loadProfileTextures(this.cC, skinAvailableCallback, true);
            }
        }
    }
}
