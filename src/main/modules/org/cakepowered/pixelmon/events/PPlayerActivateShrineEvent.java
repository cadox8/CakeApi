package org.cakepowered.pixelmon.events;

import com.pixelmonmod.pixelmon.api.events.PlayerActivateShrineEvent;

public class PPlayerActivateShrineEvent {
	
	private PlayerActivateShrineEvent e;
	
	public PPlayerActivateShrineEvent(PlayerActivateShrineEvent e) {
		this.e = e;
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
