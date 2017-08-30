package com.btg.treasurehunter.core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

	@Override
	public void onEnable() {
		
		//Registring the command executor to the server
		getServer.getCommand("commandman").setExecutor(new CommandMan());
	}
	
	/*
	 * We dont need this yet.
	@Override
	public void onDisable() {
		
	}
	*/
}
