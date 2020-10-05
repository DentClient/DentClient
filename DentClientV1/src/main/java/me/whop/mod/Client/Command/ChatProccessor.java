package me.whop.client.Client.Command;

import java.util.HashMap;

import me.whop.client.Client.Command.Commands.Setbind;
import me.deftware.client.framework.Event.Events.EventClientCommand;
import me.deftware.client.framework.Wrappers.IChat;

public class ChatProccessor {

	private static HashMap<String, Command> cmds = new HashMap<String, Command>();

	static {
		cmds.put(".setbind", new Setbind());
	}

	/**
	 * Parses all . commands
	 * 
	 * @param cmd
	 */
	public static void onClientCommand(EventClientCommand cmd) {
		if (cmds.containsKey(cmd.getCommand())) {
			cmds.get(cmd.getCommand()).onCommand(cmd.getArgs());
		} else {
			IChat.sendClientMessage("Unknown command");
		}
	}

}
