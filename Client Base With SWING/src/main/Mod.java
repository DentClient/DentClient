package main;
import javax.swing.*;

import java.util.*;


public class Mod {
	
	public String name;
	public int bind;
	public boolean toggled = false;
	public Category category;
	public String desc;
	public ArrayList<Setting> settings = new ArrayList<Setting>();
	public boolean stateLastTick = false;
	public boolean kill = false;
	
	/* IDK how imma do this -10:37 AM 11/17/2020
	 * Yay I know how now -10:04 AM 1/29/2021
	 * 
	 */
	
	
	
	public Mod(String nm, int key, Category c, String d, ArrayList<Setting> set) {
		name = nm;
		bind = key;
		category = c;
		desc = d;
		
		
		while(kill = false) {
			if(stateLastTick != toggled && toggled == true) {
				System.out.println("[" + name + "] has been enabled.");
				whenEnabled();
				toggled = true;
			} else if(stateLastTick != toggled && toggled == false) {
				System.out.println("[" + name + "] has been disabled.");
				whenDisabled();
				toggled = false;
			} else if(toggled){
				whenRunning();
			}
			
		}
		
	}
	
	public ArrayList<Setting> getSettings() {
		return settings;
	}

	public void setSettings(ArrayList<Setting> settings) {
		this.settings = settings;
	}

	public boolean isStateLastTick() {
		return stateLastTick;
	}

	public void setStateLastTick(boolean stateLastTick) {
		this.stateLastTick = stateLastTick;
	}

	public boolean isKill() {
		return kill;
	}

	public void setKill(boolean kill) {
		this.kill = kill;
	}

	public boolean isToggled() {
		return toggled;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void whenEnabled() {
		//once when Enabled
	}
	
	public void whenDisabled() {
		//once when Disabled
	}
	
	public void whenRunning() {
		//while it runs
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBind() {
		return bind;
	}

	public void setBind(int bind) {
		this.bind = bind;
	}

	public boolean toggle() {
		return toggled;
	}

	public void setToggled(boolean toggled) {
		this.toggled = toggled;
	}

	public Category getCategory() {
		return category;
	}

	public void setCat(Category cat) {
		this.category = cat;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
