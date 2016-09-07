package org.cakepowered.pixelmon.events;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;

public class PCaptureEvent extends ApiEvent {
	
	private CaptureEvent e;
	
	public PCaptureEvent(CaptureEvent e) {
		super(e);
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public String getPOokemonName(){
		return e.pokemon.getPokemonName();
	}

}
