package me.whop.mod.Client.Modules.Mods.Movement;

import me.deftware.client.framework.event.Event;
import me.deftware.client.framework.wrappers.entity.IEntityPlayer;
import me.whop.mod.Client.Modules.Mod;
import me.whop.mod.Client.Modules.ModType;

/*
Template for all mods

@author Whop
*/
public class Sprint extends Mod {
    // this is where the things are declared (name of hack, desc. of hack, type of hack, and the hack's keybind)
    public Sprint() {
        super("AutoSprint", "Automatically sprints", ModType.MOVEMENT, 136); //Bind: COLON
    }
    // Every Tick that it is enabled (I think)
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