package com.btg.treasurehunter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender,
			Command command,
			String label,
			String[] args) {
		if (command.getName().equalsIgnoreCase("commandman")) {
			sender.sendMessage("Commandman has been summoned!");
			return true;
		}
		return false;
	}
}
