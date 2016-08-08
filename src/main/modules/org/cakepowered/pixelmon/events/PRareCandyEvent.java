package org.cakepowered.pixelmon.events;

import com.pixelmonmod.pixelmon.api.events.RareCandyEvent;

public class PRareCandyEvent {
	
	private RareCandyEvent e;
	
	public PRareCandyEvent(RareCandyEvent e) {
		this.e = e;
	}
	
	public void setCancelet(boolean cancel){
		e.setCanceled(cancel);
	}

}
