package org.cakepowered.pixelmon;

import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.events.*;

import com.pixelmonmod.pixelmon.api.events.*;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.*;

public enum EventInstance {
	
	INSTANCE;
	
	//EconomyEvent.class
	public void on(EconomyEvent e){
		new PEconomyEvent(e);
	}
	public void on(GetBalanceEvent e){
		new PGetBalanceEvent(e);
	}
	public void on(PreTransactionEvent e){
		new PPreTransactionEvent(e);
	}
	public void on(PostTransactionEvent e){
		new PPostTransactionEvent(e);
	}

	
	
	//BattleStartedEvent
	public void on(BattleStartedEvent e){
		new PBattleStartedEvent(e);
	}
	//PlayerBattleEndedEvent.class
	public void on(PlayerBattleEndedEvent e){
		new PPlayerBattleEndedEvent(e);
	}
	//PlayerBattleEndedAbnormalEvent.class
	public void on(PlayerBattleEndedAbnormalEvent e){
		new PPlayerBattleEndedEvent(e);
	}
	
	
	
	//LostToTrainerEvent.class
	public void on(LostToTrainerEvent e){
		new PTrainerBattleEndedEvent(e);
	}
	//BeatTrainerEvent.class
	public void on(BeatTrainerEvent e){
		new PTrainerBattleEndedEvent(e);
	}
	
	
	
	//LevelUpEvent.class
	public void on(LevelUpEvent e){
		new PLevelUpEvent(e);
	}
	
	//RareCandyEvent.class
	public void on(RareCandyEvent e){
		new PRareCandyEvent(e);
	}
	
	//PixelmonCaptureEvent.class
	public void on(PixelmonCaptureEvent e){
		new PPixelmonCaptureEvent(e);
	}
	
	//PixelmonSendOutEvent.class
	public void on(PixelmonSendOutEvent e){
		new PPixelmonSendOutEvent(e);
	}
	
	//PixelmonSpawnEvent.class
	public void on(PixelmonSpawnEvent e){
		new PPixelmonSpawnEvent(e);
	}
	
	//PixelmonStructureGenerationEvent.class
	public void on(PixelmonStructureGenerationEvent e){
		new PPixelmonStructureGenerationEvent(e);
	}
	
	//PlayerActivateShrineEvent.class
	public void on(PlayerActivateShrineEvent e){
		new PPlayerActivateShrineEvent(e);
	}
	
	//RidePokemonEvent.class
	public void on(RidePokemonEvent e){
		new PRidePokemonEvent(e);
	}
	
	//ThrowPokeballEvent.class
	public void on(ThrowPokeballEvent e){
		new PThrowPokeballEvent(e);
	}
	
}
