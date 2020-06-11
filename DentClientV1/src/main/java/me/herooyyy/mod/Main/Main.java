package me.herooyyy.mod.Main;

import me.deftware.client.framework.event.EventBus;
import me.deftware.client.framework.event.EventHandler;
import me.deftware.client.framework.event.events.EventKeyAction;
import me.deftware.client.framework.event.events.EventRender2D;
import me.deftware.client.framework.event.events.EventUpdate;
import me.deftware.client.framework.main.EMCMod;
import me.herooyyy.mod.Client.Client;
import me.herooyyy.mod.Client.RenderManager;

public class Main extends EMCMod {

    public static final String name = "DentClient";

    private Client client;

    @Override
    public void initialize() {
        EventBus.registerClass(this.getClass(), this);
        client = new Client(this);
        client.initialize();
    }

    @EventHandler(eventType = EventUpdate.class)
    public void onUpdate(EventUpdate event) {

        Client.getInstance().getModloader().handleUpdateEvent(event);

    }

    @EventHandler(eventType = EventRender2D.class)
    public void onDraw(EventRender2D event) {

        RenderManager.drawClientOverlay();

    }

    @EventHandler(eventType = EventKeyAction.class)
    public void onKeyEvent(EventKeyAction event) {

        Client.getInstance().getModloader().handleToggleEvent(event);

    }

}
