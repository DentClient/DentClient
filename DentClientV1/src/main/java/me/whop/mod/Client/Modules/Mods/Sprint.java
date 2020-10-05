package me.whop.mod.Client.Modules.Mods;

import me.deftware.client.framework.event.Event;
import java.*;
import java.util.*;
import me.deftware.client.framework.wrappers.entity.IEntityPlayer;
import me.whop.mod.Client.Modules.Mod;
import me.whop.mod.Client.Modules.ModType;

public class Sprint extends Mod {
    // this is where the things are declared (name of hack, desc. of hack, type of hack, and the hack's keybind)
    public Sprint() {
        super("AutoSprint", "Automatically sprints", ModType.MOVEMENT, 136); //Bind: COLON
    }
    // It's different than onEnable but i cant really explain how
    @Override
    public void onEvent(Event event) {
        IEntityPlayer.setSprinting(true);
    }
    // thing that happens when enabled
    @Override
    public void onEnable() {

    }
    // Thing that happens when disabled
    @Override
    public void onDisable() {
        IEntityPlayer.setSprinting(false);
    }
}