package me.whop.mod.Client.Modules.Mods.Utils;

import me.whop.mod.Client.Modules.Mod;
import me.whop.mod.Client.Modules.ModType;
import me.deftware.client.framework.*;

/*
@author Whop
*/
public class PacketSender extends Mod {
    // this is where the things are declared (name of hack, desc. of hack, type of hack, and the hack's keybind)
    public Sprint() {
        super("Packet Sender (DEV)", "Dev tool that sends packet. (Will probably ban u)", ModType.EXPLOIT, 41); //Bind: GRAVE
    }
    // Every Tick that it is enabled (I think)
    @Override
    public void onEvent(Event event) {

    }
    // thing that happens when enabled
    @Override
    public void onEnable() {
    	ICPacketPosition(0.5, 0.5, 100, false);
    	toggle();
    }
    // Thing that happens when disabled
    @Override
    public void onDisable() {
        
    }
}