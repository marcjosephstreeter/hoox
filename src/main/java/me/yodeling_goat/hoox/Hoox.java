package me.yodeling_goat.hoox;

import me.yodeling_goat.hoox.Commands.SaveCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Hoox extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic

		getCommand("save").setExecutor(new SaveCommand(this));

		//load config
		getConfig().options().copyDefaults();
		saveDefaultConfig();




	}

}
