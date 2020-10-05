package me.whop.mod.Client.Modules;

import me.deftware.client.framework.event.Event;
import me.deftware.client.framework.event.events.EventKeyAction;
import me.deftware.client.framework.event.events.EventUpdate;
import me.whop.mod.Client.Client;
import me.whop.mod.Client.Modules.Mods.Flight;

import java.util.HashMap;

public class ModLoader {

    private HashMap<ModType, Mod> modlist = new HashMap<>();


    public void initialize() {
        modlist.put(ModType.MOVEMENT, new Flight());
        modlist.put(ModType.MOVEMENT, new Sprint());
    }

    public HashMap<ModType, Mod> getModlist() {
        return modlist;
    }

    public Mod getMod(ModType mod) {
        return modlist.get(mod);
    }

    public Mod getMod(String mod) {
        for (Mod m : modlist.values()) {
            if (m.getName().toLowerCase().equals(mod.toLowerCase())) {
                return m;
            }
        }
        return null;
    }

    public void handleToggleEvent(Event event) {

        EventKeyAction keypress = (EventKeyAction) event;

        for (Mod m : modlist.values()) {

            if (m.getKeybind() == keypress.getKeyCode()) {
                m.toggle();
            }
        }
    }

    public void handleUpdateEvent(EventUpdate event) {

        for(Mod m : Client.getInstance().getModloader().getModlist().values()) {
            if (m.isState()) {
                m.onEvent(event);
            }
        }

    }
}
