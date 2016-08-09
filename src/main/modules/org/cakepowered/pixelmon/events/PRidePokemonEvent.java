package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.RidePokemonEvent;

public class PRidePokemonEvent extends ApiEvent {
	
	private RidePokemonEvent e;
	
	public PRidePokemonEvent(RidePokemonEvent e) {
		super(e);
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}
	
}
