package me.whop.mod.Client.Modules.Mods.Chat;

import me.deftware.client.framework.*;
import me.whop.mod.Client.Modules.Mod;
import me.whop.mod.Client.Modules.ModType;

/*
Template for all mods

@author Whop
*/
public class ChatCensor extends Mod {
    // this is where the things are declared (name of hack, desc. of hack, type of hack, and the hack's keybind)
    public Sprint() {
        super("ChatCensor", "For when you have to play anarchy with your parents in the room.", ModType.MOVEMENT, 27); //Bind: R_BRACKET
    }
    // Every Tick that it is enabled (I think)
    @Override
    public void onEvent(Event event) {
        
    }
    // thing that happens when enabled
    @Override
    public void onEnable() {

    }
    // Thing that happens when disabled
    @Override
    public void onDisable() {
        
    }
}