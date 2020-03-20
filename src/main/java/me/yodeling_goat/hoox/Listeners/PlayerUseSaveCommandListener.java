package me.yodeling_goat.hoox.Listeners;

import me.yodeling_goat.hoox.Hoox;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class PlayerUseSaveCommandListener implements Listener {

	Hoox plugin;

	public PlayerUseSaveCommandListener(Hoox plugin){
		this.plugin = plugin;
	}


	@EventHandler
	public void onPlayerCommandUsage(PlayerCommandSendEvent event){
		Player player = event.getPlayer();

	}




}
