package org.cakepowered.pixelmon.events;

import org.cakepowered.mod.event.ApiEvent;

import com.pixelmonmod.pixelmon.api.events.PlayerActivateShrineEvent;

public class PPlayerActivateShrineEvent extends ApiEvent {
	
	private PlayerActivateShrineEvent e;
	
	public PPlayerActivateShrineEvent(PlayerActivateShrineEvent e) {
		super(e);
		this.e = e;
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
