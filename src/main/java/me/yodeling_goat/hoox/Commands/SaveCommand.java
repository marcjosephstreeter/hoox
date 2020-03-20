package me.yodeling_goat.hoox.Commands;

import me.yodeling_goat.hoox.Hoox;
import me.yodeling_goat.hoox.Listeners.PlayerUseSaveCommandListener;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class SaveCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("Hoox.SaveCommand")) {
				// get the URL from the config
				// call save with the url
				String url = "get the url";
				save(player, url);
				player.sendMessage(ChatColor.BLUE + "You have the permission to use this command");
			} else {
				player.sendMessage(ChatColor.RED + "You are not authorized to use this command you must have the permissions in order to do so.");
			}
		} else {
			System.out.println("You are not a player you are not authorized to use this command!!!");
		}


		return true;
	}

	Hoox plugin;

	public SaveCommand(Hoox plugin){
		this.plugin = plugin;
	}


	private void save(Player player, String url) {
	player.sendMessage(ChatColor.GRAY + "Something happened");
	for (int i = 0; i < plugin.getConfig().getList("message").size(); i++) {
		player.sendMessage(plugin.getConfig().getList("message").get(i).toString());
	}
	}
}
