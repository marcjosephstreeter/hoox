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
	Hoox plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("Hoox.SaveCommand")) {
				String url = plugin.getConfig().getString("url_save");
				save(player, url);
			} else {
				player.sendMessage(ChatColor.RED + "You are not authorized to save.");
			}
		} else {
			System.out.println("You are not a player you are not authorized to use this command!!!");
		}
		return true;
	}
	public SaveCommand(Hoox plugin){
		this.plugin = plugin;
	}
	private void save(Player player, String url) {
		player.sendMessage(ChatColor.GRAY + "Something happened to " + url);
	}
}
