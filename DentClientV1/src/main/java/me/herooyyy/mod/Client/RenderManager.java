package me.herooyyy.mod.Client;

import me.deftware.client.framework.wrappers.gui.IGuiScreen;
import me.deftware.client.framework.wrappers.render.IFontRenderer;
import me.herooyyy.mod.Client.Modules.Mod;
import me.herooyyy.mod.Main.Main;

import java.awt.*;

public class RenderManager {

    public static void drawClientOverlay() {
        //Renders client name on top left
        IFontRenderer.drawStringWithShadow(Main.name, 2, 2, Color.WHITE.getRGB());

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
