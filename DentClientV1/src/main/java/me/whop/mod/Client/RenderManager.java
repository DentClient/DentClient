package me.whop.mod.Client;

import me.deftware.client.framework.wrappers.IMinecraft;
import me.deftware.client.framework.wrappers.gui.IGuiScreen;
import me.deftware.client.framework.wrappers.render.IFontRenderer;
import me.whop.mod.Client.Modules.Mod;
import me.whop.mod.Main.Main;

import java.awt.*;

public class RenderManager {

    public static void drawClientOverlay() {
        //Renders client name and FPS
        IFontRenderer.drawStringWithShadow(Main.name + "v. " + Main.version, 2, 2, Color.RED.getRGB());
        IFontRenderer.drawStringWithShadow("FPS: " + IMinecraft.getFPS(), 2, 3, Color.WHITE.getRGB() );
        //Renders each Mod that is enabled on top right
        int i = 0;
        for (Mod m : Client.getInstance().getModloader().getModlist().values()) {
            if (m.isState()) {
                int offset = (IFontRenderer.getFontHeight() * i);

                IFontRenderer.drawStringWithShadow(m.getName(),
                        IGuiScreen.getScaledWidth() - IFontRenderer.getStringWidth(m.getName()) - 2,
                        2 + offset, Color.WHITE.getRGB());
                i += 1;
            }
        }

    }

}
