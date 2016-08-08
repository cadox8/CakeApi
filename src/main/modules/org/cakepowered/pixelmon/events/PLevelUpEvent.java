package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.LevelUpEvent;

public class PLevelUpEvent {
	
	private LevelUpEvent e;
	
	public PLevelUpEvent(LevelUpEvent e) {
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public int getNewLevel(){
		return e.newLevel;
	}
	
	public String getPokemonName(){
		return e.pokemon.getPokemonName();
	}

}
