package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.enums.PPokeball;

import com.pixelmonmod.pixelmon.api.events.ThrowPokeballEvent;

public class PThrowPokeballEvent extends ApiEvent {
	
	private ThrowPokeballEvent e;
	
	public PThrowPokeballEvent(ThrowPokeballEvent e) {
		super(e);
		this.e = e;
	}
	
	public PPokeball getPokeballType(){
		return PPokeball.valueOf(e.type.name());
	}

	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}

	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
