package modules;

import java.util.ArrayList;

import main.Category;
import main.Mod;
import main.Setting;

public class logSpam extends Mod {
	protected String message = "Dent Client on Top";
	protected static ArrayList<Setting> sets = new ArrayList<Setting>();
	
	public logSpam() {
		super("LogSpam", 42, Category.UTILITY, "Little known dupe, must use for at least 10 mins then quit mc, look at most recent log. Edit the log, and go back in. Then disable, and you have been duped.", sets);
	}
	
	@Override
	public void whenRunning() {
		System.out.println("Dent Client on Top");
	}
	
	
}
