package me.whop.client.Client.Command;

import me.deftware.client.framework.Wrappers.IChat;

public abstract class Command {

	protected void message(String msg) {
		IChat.sendClientMessage(msg);
	}

	protected void syntaxError() {
		message("LOL get rekt you can't even use command syntax correctly");
	}

	public abstract void onCommand(String args);

}
