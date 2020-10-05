package me.deftware.client.Client.Command.Commands;

import me.whop.client.Client.Client;
import me.whop.client.Client.Command.Command;
import me.whop.client.Client.Modules.Mod;
import me.deftware.client.framework.Wrappers.IKeyboard;

/**
 * Sets a keybind to a mod
 * 
 * @author whop
 *
 */
public class Setbind extends Command {

	@Override
	public void onCommand(String args) {
		if (!args.contains(" ")) {
			this.syntaxError();
			return;
		} else if (args.split(" ").length != 2) {
			this.syntaxError();
			return;
		}
		Mod m = Client.getInstance().getModloader().getMod(args.split(" ")[0]);
		if (m == null) {
			message("Mod not found");
			return;
		}
		int key = Integer.valueOf(args.split(" ")[1]);
		m.setKeybind(key);
		message("Set keybind for " + m.getName() + " to " + IKeyboard.getKeyName(key));
	}

}
