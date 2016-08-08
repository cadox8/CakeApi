package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.EconomyEvent.GetBalanceEvent;

public class PGetBalanceEvent {
	
	private GetBalanceEvent e;
	
	public PGetBalanceEvent(GetBalanceEvent e){
		this.e = e;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public int getBalance(){
		return e.balance;
	}
	
	public void setBalance(int balance){
		e.balance = balance;
	}
	
}