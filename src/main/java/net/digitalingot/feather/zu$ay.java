package net.digitalingot.feather;

import net.digitalingot.feather.enums.zm;
import net.digitalingot.feather.interfaces.au;
import net.digitalingot.feather.interfaces.de;
import net.digitalingot.feather.interfaces.dg;
import net.digitalingot.feather.interfaces.ra;

import java.awt.*;

public final class zu$ay
        extends zi {
    @de(vi = 0)
    public iv w = new iv("Chat Settings");
    @au(wd = "keyToggleChat", vu = "Toggle Chat", pr = "0", yp = @de(vi = 1))
    public km x;
    @au(wd = "chatHidden", vu = "Chat Hidden", pr = "false", yp = @de(vi = -10))
    public transient boolean y;
    @au(wd = "unlimitedScrollback", vu = "Unlimited Scrollback", pr = "true", yp = @de(vi = 3))
    public boolean z;
    @au(wd = "backgroundColor", vu = "Background Color", pr = "0/0/0/128", yp = @de(vi = 4))
    public Color kv;
    @au(wd = "textShadow", vu = "Text Shadow", pr = "true", yp = @de(vi = 5))
    public boolean ki;
    @de(vi = 10)
    public iv A = new iv("Stack Messages");
    @au(wd = "stackMessages", vu = "Stack Repeated Messages", pr = "true", yp = @de(vi = 11))
    public boolean B;
    @au(wd = "consecutiveMessagesOnly", vu = "Consecutive Messages Only", pr = "false", nu = @ra(wd = "stackMessages"), yp = @de(vi = 12))
    public boolean C;
    @de(vi = 20)
    public iv D = new iv("Mentions");
    @au(wd = "mentionHighlight", vu = "Highlight", pr = "false", yp = @de(vi = 21))
    public boolean E;
    @au(wd = "mentionColor", vu = "Color", pr = "green", nu = @ra(wd = "mentionHighlight"), yp = @de(vi = 22))
    @dg
    public zm F;
    @au(wd = "mentionBold", vu = "Bold", pr = "false", nu = @ra(wd = "mentionHighlight"), yp = @de(vi = 23))
    public boolean G;
    @au(wd = "mentionOwnMessage", vu = "Own Messages", pr = "false", nu = @ra(wd = "mentionHighlight"), yp = @de(vi = 24))
    public boolean H;

    @Override
    public boolean nv() {
        return true;
    }
}
