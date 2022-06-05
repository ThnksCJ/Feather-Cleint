package net.digitalingot.feather;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.ClientCommandHandler;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class kl
        extends CommandBase {
    @NotNull
    private final String iu;
    @NotNull
    private final List<String> ig;

    public kl(@NotNull String string, @NotNull List<String> list) {
        this.iu = string;
        this.ig = list;
    }

    @NotNull
    public String func_71517_b() {
        return this.iu;
    }

    @NotNull
    public List<String> getAliases() {
        return this.ig;
    }

    @NotNull
    public String func_71518_a(@NotNull ICommandSender iCommandSender) {
        return "";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public void func_184881_a(@NotNull MinecraftServer minecraftServer, @NotNull ICommandSender iCommandSender, String @NotNull [] stringArray) {
        this.ay(stringArray);
    }

    public void ay(Void void_) {
        ClientCommandHandler.instance.func_71560_a((ICommand) this);
    }

    public abstract void ay(@NotNull String[] var1);
}
