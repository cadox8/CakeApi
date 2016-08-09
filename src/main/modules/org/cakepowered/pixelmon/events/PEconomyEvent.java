package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.EconomyEvent;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.GetBalanceEvent;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PostTransactionEvent;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PreTransactionEvent;

public class PEconomyEvent extends ApiEvent {
	
	public enum PTransactionType{
		deposit,  withdraw;
	}
	
	private EconomyEvent e;
	
	public PEconomyEvent(EconomyEvent e) {
		super(e);
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
