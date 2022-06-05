package net.digitalingot.feather.mixin.core;

import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value={GuiNewChat.class})
public interface rf {
    @Accessor(value="chatLines")
    List<ChatLine> getAllMessages();

    @Accessor(value="drawnChatLines")
    List<ChatLine> getTrimmedMessages();
}
