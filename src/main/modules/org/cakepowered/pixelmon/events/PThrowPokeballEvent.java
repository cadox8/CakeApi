package org.cakepowered.pixelmon.events;

import org.cakepowered.pixelmon.enums.PPokeball;

import com.pixelmonmod.pixelmon.api.events.ThrowPokeballEvent;

public class PThrowPokeballEvent {
	
	private ThrowPokeballEvent e;
	
	public PThrowPokeballEvent(ThrowPokeballEvent e) {
		this.e = e;
	}
	
	public PPokeball getPokeballType(){
		return PPokeball.valueOf(e.type.name());
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
