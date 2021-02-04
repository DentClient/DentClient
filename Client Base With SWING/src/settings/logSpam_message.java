package settings;

import main.Setting;
import main.SettingType;

public class logSpam_message extends Setting {
	
	public logSpam_message() {
		super("Message", "Sets message for the dupe.", SettingType.TEXTFIELD, "Dent Client on Top!", true);
	}
}
