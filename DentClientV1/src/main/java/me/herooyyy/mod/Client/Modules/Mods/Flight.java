package me.herooyyy.mod.Client.Modules.Mods;

import me.deftware.client.framework.event.Event;
import me.deftware.client.framework.wrappers.entity.IEntityPlayer;
import me.herooyyy.mod.Client.Modules.Mod;
import me.herooyyy.mod.Client.Modules.ModType;

public class Flight extends Mod {

    public Flight() {
        super("Flight", "Enables flying in survival", ModType.FLIGHT, 70);
    }

    @Override
    public void onEvent(Event event) {
        IEntityPlayer.setFlying(true);
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        IEntityPlayer.setFlying(false);
    }
}
