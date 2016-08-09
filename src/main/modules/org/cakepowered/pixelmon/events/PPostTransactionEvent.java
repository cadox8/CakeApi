package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.events.PEconomyEvent.PTransactionType;

import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PostTransactionEvent;

public class PPostTransactionEvent extends ApiEvent {
	
	private PostTransactionEvent e;
	
	public PPostTransactionEvent(PostTransactionEvent e){
		super(e);
		this.e = e;		
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public int getNewBalance(){
		return e.newBalance;
	}
	
	public int getOldBalance(){
		return e.oldBalance;
	}
	
	public PTransactionType getType(){
		return PTransactionType.valueOf(e.type.name());
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}
	
}