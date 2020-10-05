package me.whop.mod.Client;

import me.deftware.client.framework.utils.Settings;
import me.whop.mod.Client.Modules.ModLoader;
import me.whop.mod.Main.Main;

import java.lang.reflect.Field;

public class Client {

    private static Main main;
    private static Client instance;

    private ModLoader modloader = new ModLoader();

    public Client(Main main) {
        this.main = main;
        instance = this;
    }

    public static Settings getSetting() {
        return main.getSettings();
    }

    public void initialize() {
        modloader.initialize();
    }

    public ModLoader getModloader() {
        return modloader;
    }

    public static Client getInstance() {
        return instance;
    }

}
