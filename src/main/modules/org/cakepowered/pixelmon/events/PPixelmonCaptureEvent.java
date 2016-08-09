package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.PixelmonCaptureEvent;

public class PPixelmonCaptureEvent extends ApiEvent {
	
	private PixelmonCaptureEvent e;
	
	public PPixelmonCaptureEvent(PixelmonCaptureEvent e) {
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
