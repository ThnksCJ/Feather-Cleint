package net.digitalingot.feather.mods.impl;

import com.google.common.collect.Sets;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.zm;
import net.digitalingot.feather.mixin.core.rf;
import net.digitalingot.feather.mixin.core.rl;
import net.digitalingot.feather.mixin.core.xn;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.*;

import java.awt.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@sv(aw= qc.CHAT_OPTIONS, jf=@bx(vu="Chat Options", jm="https://assets.feathercdn.net/game/sidebar/chat.svg", mz="", lq={}, mc=@bx.ay(vu="Chat", yp=@de(vi=1))))
public final class ChatOptions
extends Mod<ay> {
    private Minecraft minecraft;
    private final Map<String, Integer> q = new LinkedHashMap<String, Integer>(5);
    private final Set<String> r = Sets.newHashSet("-----------------------------------------------------");
    private Pattern s;
    private String t;
    private String u;
    private boolean v;

    @Override
    public void initialize() {
        this.minecraft = Minecraft.getMinecraft();
        zl.fu();
        this.ko();
        gd.bo.ay(this::ay);
        dl.bo.ay(string -> {
            this.u = string.toLowerCase(Locale.ROOT);
            return string;
        });
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> this.q.clear());
        qo.ay(() -> ((ay)this.vz).x, () -> {
            if (this.minecraft.currentScreen != null) {
                return;
            }
            ((ay)this.vz).y = !((ay)this.vz).y;
        }, null);
    }

    @Override
    public void zq() {
        this.ko();
    }

    private void ko() {
        String string = this.minecraft.getSession().getUsername();
        this.s = Pattern.compile(string, 2);
        this.t = this.om(string);
    }

    private String om(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TextFormatting.RESET);
        stringBuilder.append(((ay)this.vz).F.toString);
        if (((ay)this.vz).G) {
            stringBuilder.append(TextFormatting.BOLD);
        }
        stringBuilder.append(string);
        stringBuilder.append(TextFormatting.RESET);
        return stringBuilder.toString();
    }

    private ITextComponent ay(ITextComponent iTextComponent) {
        if (((ay)this.vz).E) {
            this.v = false;
            this.rf(iTextComponent);
            if (this.v) {
                this.u = null;
            }
        }
        if (((ay)this.vz).B) {
            String string = iTextComponent.getUnformattedText();
            if (string.trim().isEmpty() || this.r.contains(string)) {
                return iTextComponent;
            }
            if (this.q.size() > (((ay)this.vz).C ? 1 : 5)) {
                Iterator<Map.Entry<String, Integer>> iterator = this.q.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            int n = this.q.size();
            int n2 = -1;
            for (Map.Entry<String, Integer> entry : this.q.entrySet()) {
                --n;
                String string2 = entry.getKey();
                if (!string2.equals(string)) continue;
                n2 = entry.getValue();
                break;
            }
            if (n2 != -1 && this.yt()) {
                this.hr(n);
                this.ay(iTextComponent, n2 + 1);
                this.q.remove(string);
                this.q.put(string, n2 + 1);
            } else {
                this.q.put(string, 1);
            }
        }
        return iTextComponent;
    }

    private boolean rf(ITextComponent iTextComponent) {
        Object object;
        boolean bl = false;
        Style style = iTextComponent.getStyle();
        if (iTextComponent instanceof TextComponentString) {
            object = this.ay(((TextComponentString)iTextComponent).getText(), style);
            if (object != null) {
                ((xn)iTextComponent).setText((String)object);
                return true;
            }
        } else if (iTextComponent instanceof TextComponentTranslation) {
            object = ((TextComponentTranslation)iTextComponent).getFormatArgs();
            for (int i = 0; i < ((Object)object).length; ++i) {
                String string;
                Object object2 = object[i];
                if (object2 == iTextComponent) continue;
                if (object2 instanceof ITextComponent) {
                    bl |= this.rf((ITextComponent)object2);
                    continue;
                }
                if (!(object2 instanceof String) || (string = this.ay((String)object2, style)) == null) continue;
                object[i] = string;
                bl = true;
            }
            if (bl) {
                ((rl)iTextComponent).setLastUpdate(-1L);
            }
        }
        for (ITextComponent iTextComponent2 : iTextComponent.getSiblings()) {
            if (iTextComponent2 == iTextComponent) continue;
            bl |= this.rf(iTextComponent2);
        }
        return bl;
    }

    private String ay(String string, Style style) {
        if (this.v || !((ay)this.vz).H && this.u != null && az.uf(string).toLowerCase(Locale.ROOT).contains(this.u)) {
            this.v = true;
            return null;
        }
        Matcher matcher = this.s.matcher(string);
        boolean bl = matcher.find();
        if (bl) {
            pw.ay ay2 = pw.ek((String)string);
            StringBuffer stringBuffer = new StringBuffer();
            do {
                pw.rf rf2 = ay2.oa(matcher.end());
                String string2 = rf2.pA();
                if (!rf2.pB() && style.getColor() != null) {
                    string2 = string2 + style.getColor().toString();
                }
                matcher.appendReplacement(stringBuffer, this.t + string2);
            } while (bl = matcher.find());
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return null;
    }

    private void hr(int n) {
        GuiNewChat guiNewChat = this.minecraft.ingameGUI.getChatGUI();
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i <= n; ++i) {
            n3 = GuiUtilRenderComponents.splitText(((rf)guiNewChat).getAllMessages().get(i).getChatComponent(), MathHelper.floor((float)guiNewChat.getChatWidth() / guiNewChat.getChatScale()), this.minecraft.fontRenderer, false, false).size();
            n2 += n3;
        }
        ((rf)guiNewChat).getAllMessages().remove(n);
        ((rf)guiNewChat).getTrimmedMessages().subList(n2 - n3, n2).clear();
    }

    private boolean yt() {
        return !((rf)this.minecraft.ingameGUI.getChatGUI()).getAllMessages().isEmpty();
    }

    private void ay(ITextComponent iTextComponent, int n) {
        iTextComponent.appendText(" [" + n + "]");
    }

    public static final class ay
    extends zi {
        @de(vi=0)
        public iv w = new iv("Chat Settings");
        @au(wd="keyToggleChat", vu="Toggle Chat", pr="0", yp=@de(vi=1))
        public km x;
        @au(wd="chatHidden", vu="Chat Hidden", pr="false", yp=@de(vi=-10))
        public transient boolean y;
        @au(wd="unlimitedScrollback", vu="Unlimited Scrollback", pr="true", yp=@de(vi=3))
        public boolean z;
        @au(wd="backgroundColor", vu="Background Color", pr="0/0/0/128", yp=@de(vi=4))
        public Color kv;
        @au(wd="textShadow", vu="Text Shadow", pr="true", yp=@de(vi=5))
        public boolean ki;
        @de(vi=10)
        public iv A = new iv("Stack Messages");
        @au(wd="stackMessages", vu="Stack Repeated Messages", pr="true", yp=@de(vi=11))
        public boolean B;
        @au(wd="consecutiveMessagesOnly", vu="Consecutive Messages Only", pr="false", nu=@ra(wd="stackMessages"), yp=@de(vi=12))
        public boolean C;
        @de(vi=20)
        public iv D = new iv("Mentions");
        @au(wd="mentionHighlight", vu="Highlight", pr="false", yp=@de(vi=21))
        public boolean E;
        @au(wd="mentionColor", vu="Color", pr="green", nu=@ra(wd="mentionHighlight"), yp=@de(vi=22))
        @dg
        public zm F;
        @au(wd="mentionBold", vu="Bold", pr="false", nu=@ra(wd="mentionHighlight"), yp=@de(vi=23))
        public boolean G;
        @au(wd="mentionOwnMessage", vu="Own Messages", pr="false", nu=@ra(wd="mentionHighlight"), yp=@de(vi=24))
        public boolean H;

        @Override
        public boolean nv() {
            return true;
        }
    }
}
