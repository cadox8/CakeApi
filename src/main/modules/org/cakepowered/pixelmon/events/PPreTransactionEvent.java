package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.events.PEconomyEvent.PTransactionType;

import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PreTransactionEvent;

public class PPreTransactionEvent extends ApiEvent {
	
	private PreTransactionEvent e;
	
	public PPreTransactionEvent(PreTransactionEvent e){
		super(e);
		this.e = e;			
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public int getBalance(){
		return e.balance;
	}
	
	public int getChange(){
		return e.change;
	}
	
	public PTransactionType getType(){
		return PTransactionType.valueOf(e.type.name());
	}
	
	public void setChange(int change){
		e.change = change;
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}
	
}