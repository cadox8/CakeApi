package com.cout970.testplugin;

import org.cakepowered.api.base.CakePlugin;
import org.cakepowered.api.base.Game;
import org.cakepowered.api.base.Log;
import org.cakepowered.api.command.CommandSender;
import org.cakepowered.api.event.EventSuscribe;
import org.cakepowered.api.event.InitializationEvent;
import org.cakepowered.api.event.PlayerChatEvent;

@CakePlugin(id = "plugin_id", name = "plugin_nombre", version = "plugin_0.0.0")
public class Plugin {

	public Log logger;
	public Game game;
	public static Plugin INSTANCE;
	
	@EventSuscribe
	public void onInit(InitializationEvent event){
		logger = event.getLogger("plugin_id");
		game = event.getGame();
		logger.info("debug plugin loaded Successful");
		INSTANCE = this;
		game.getCommandDispacher().registerCommand(new CommandKillPlayer());
	}
	
	@EventSuscribe
	public void onPlayerChat(PlayerChatEvent event){
		logger.info("Player: "+event.getPlayer().getUserName()+" write: "+event.getMessage());
	}
}
