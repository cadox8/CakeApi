package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.enums.PBattleResults;

import com.pixelmonmod.pixelmon.api.events.BeatTrainerEvent;
import com.pixelmonmod.pixelmon.api.events.LostToTrainerEvent;

public class PTrainerBattleEndedEvent {

	private LostToTrainerEvent e;
	private BeatTrainerEvent eb;
	
	public PTrainerBattleEndedEvent(LostToTrainerEvent e) {
		this.e = e;
	}
	
	public PTrainerBattleEndedEvent(BeatTrainerEvent eb) {
		this.eb = eb;
	}

	public PBattleResults getResult(){
		return (e == null) ? PBattleResults.ERROR : PBattleResults.DEFEAT;
	}
	
	public Player getPlayer(){
		return ForgeInterface.getPlayer(e.player);
	}
	
	public String getTrainerName(){
		return (e == null) ? eb.trainer.getName() : e.trainer.getName();
	}

}
