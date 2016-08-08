package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.util.ForgeInterface;

import com.pixelmonmod.pixelmon.api.events.BattleStartedEvent;

public class PBattleStartedEvent {
	
	private BattleStartedEvent e;
	
	public PBattleStartedEvent(BattleStartedEvent e) {
		this.e = e;
	}
	
	public Player[] getPlayersTeam1(){
		Player[] players = new Player[e.participant1.length];
		for (int i = 0; i < e.participant1.length; i++) {
			players[i] = ForgeInterface.getPlayer(e.participant1[i].getStorage().getPlayer());
		}
		return players;
	}
	
	public Player[] getPlayersTeam2(){
		Player[] players = new Player[e.participant2.length];
		for (int i = 0; i < e.participant1.length; i++) {
			players[i] = ForgeInterface.getPlayer(e.participant1[i].getStorage().getPlayer());
		}
		return players;
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
