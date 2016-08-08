package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.PixelmonCaptureEvent;

public class PPixelmonCaptureEvent {
	
	private PixelmonCaptureEvent e;
	
	public PPixelmonCaptureEvent(PixelmonCaptureEvent e) {
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public String getPOokemonName(){
		return e.pokemon.getPokemonName();
	}

}
