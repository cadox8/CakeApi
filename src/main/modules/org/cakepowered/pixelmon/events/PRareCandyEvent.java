package org.cakepowered.pixelmon.events;

import org.cakepowered.mod.event.ApiEvent;

import com.pixelmonmod.pixelmon.api.events.RareCandyEvent;

public class PRareCandyEvent extends ApiEvent {
	
	private RareCandyEvent e;
	
	public PRareCandyEvent(RareCandyEvent e) {
		super(e);
		this.e = e;
	}
	
	public void setCancelet(boolean cancel){
		e.setCanceled(cancel);
	}

}
