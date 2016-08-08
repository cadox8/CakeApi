package org.cakepowered.pixelmon;

import com.google.common.eventbus.Subscribe;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.events.*;

import com.pixelmonmod.pixelmon.api.events.*;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.*;

public enum EventInstance {
	
	INSTANCE;
	
	//EconomyEvent.class
	@SubscribeEvent
	public void on(EconomyEvent e){
		new PEconomyEvent(e);
	}
	@SubscribeEvent
	public void on(GetBalanceEvent e){
		new PGetBalanceEvent(e);
	}
	@SubscribeEvent
	public void on(PreTransactionEvent e){
		new PPreTransactionEvent(e);
	}
	@SubscribeEvent
	public void on(PostTransactionEvent e){
		new PPostTransactionEvent(e);
	}

	
	
	//BattleStartedEvent
	@SubscribeEvent
	public void on(BattleStartedEvent e){
		new PBattleStartedEvent(e);
	}
	//PlayerBattleEndedEvent.class
	@SubscribeEvent
	public void on(PlayerBattleEndedEvent e){
		new PPlayerBattleEndedEvent(e);
	}
	//PlayerBattleEndedAbnormalEvent.class
	@SubscribeEvent
	public void on(PlayerBattleEndedAbnormalEvent e){
		new PPlayerBattleEndedEvent(e);
	}
	
	
	
	//LostToTrainerEvent.class
	@SubscribeEvent
	public void on(LostToTrainerEvent e){
		new PTrainerBattleEndedEvent(e);
	}
	//BeatTrainerEvent.class
	@SubscribeEvent
	public void on(BeatTrainerEvent e){
		new PTrainerBattleEndedEvent(e);
	}
	
	
	
	//LevelUpEvent.class
	@SubscribeEvent
	public void on(LevelUpEvent e){
		new PLevelUpEvent(e);
	}
	
	//RareCandyEvent.class
	@SubscribeEvent
	public void on(RareCandyEvent e){
		new PRareCandyEvent(e);
	}
	
	//PixelmonCaptureEvent.class
	@SubscribeEvent
	public void on(PixelmonCaptureEvent e){
		new PPixelmonCaptureEvent(e);
	}
	
	//PixelmonSendOutEvent.class
	@SubscribeEvent
	public void on(PixelmonSendOutEvent e){
		new PPixelmonSendOutEvent(e);
	}
	
	//PixelmonSpawnEvent.class
	@SubscribeEvent
	public void on(PixelmonSpawnEvent e){
		new PPixelmonSpawnEvent(e);
	}
	
	//PixelmonStructureGenerationEvent.class
	@SubscribeEvent
	public void on(PixelmonStructureGenerationEvent e){
		new PPixelmonStructureGenerationEvent(e);
	}
	
	//PlayerActivateShrineEvent.class
	@SubscribeEvent
	public void on(PlayerActivateShrineEvent e){
		new PPlayerActivateShrineEvent(e);
	}
	
	//RidePokemonEvent.class
	@SubscribeEvent
	public void on(RidePokemonEvent e){
		new PRidePokemonEvent(e);
	}
	
	//ThrowPokeballEvent.class
	@SubscribeEvent
	public void on(ThrowPokeballEvent e){
		new PThrowPokeballEvent(e);
	}
	
}
