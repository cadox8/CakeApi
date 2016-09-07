package org.cakepowered.pixelmon;

import com.pixelmonmod.pixelmon.api.events.*;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.GetBalanceEvent;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PostTransactionEvent;
import com.pixelmonmod.pixelmon.api.events.EconomyEvent.PreTransactionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.cakepowered.api.core.References;
import org.cakepowered.api.event.Event;
import org.cakepowered.pixelmon.events.*;

public enum EventInstance {

    INSTANCE;

    private void post(Event e) {
        References.GAME.getEventRegistry().postEvent(e);
    }

    //EconomyEvent.class
    @SubscribeEvent
    public void onEconomyEvent(EconomyEvent e) {
        post(new PEconomyEvent(e));
    }

    @SubscribeEvent
    public void onGetBalanceEvent(GetBalanceEvent e) {
        post(new PGetBalanceEvent(e));
    }

    @SubscribeEvent
    public void onPreTransactionEven(PreTransactionEvent e) {
        post(new PPreTransactionEvent(e));
    }

    @SubscribeEvent
    public void onPostTransactionEvent(PostTransactionEvent e) {
        post(new PPostTransactionEvent(e));
    }


    //BattleStartedEvent
    @SubscribeEvent
    public void onBattleStartedEvent(BattleStartedEvent e) {
        post(new PBattleStartedEvent(e));
    }

    //PlayerBattleEndedEvent.class
    @SubscribeEvent
    public void onPlayerBattleEndedEvent(PlayerBattleEndedEvent e) {
        post(new PPlayerBattleEndedEvent(e));
    }

    //PlayerBattleEndedAbnormalEvent.class
    @SubscribeEvent
    public void onPlayerBattleEndedAbnormalEvent(PlayerBattleEndedAbnormalEvent e) {
        post(new PPlayerBattleEndedEvent(e));
    }


    //LostToTrainerEvent.class
    @SubscribeEvent
    public void onLostToTrainerEvent(LostToTrainerEvent e) {
        post(new PTrainerBattleEndedEvent(e));
    }

    //BeatTrainerEvent.class
    @SubscribeEvent
    public void onBeatTrainerEvent(BeatTrainerEvent e) {
        post(new PTrainerBattleEndedEvent(e));
    }


    //LevelUpEvent.class
    @SubscribeEvent
    public void onLevelUpEvent(LevelUpEvent e) {
        post(new PLevelUpEvent(e));
    }

    //RareCandyEvent.class
    @SubscribeEvent
    public void onRareCandyEvent(RareCandyEvent e) {
        post(new PRareCandyEvent(e));
    }

    //PixelmonCaptureEvent.class
    @SubscribeEvent
    public void onCaptureEvent(CaptureEvent e) {
        post(new PCaptureEvent(e));
    }

    //PixelmonSendOutEvent.class
    @SubscribeEvent
    public void onPixelmonSendOutEvent(PixelmonSendOutEvent e) {
        post(new PPixelmonSendOutEvent(e));
    }

    //PixelmonSpawnEvent.class
    @SubscribeEvent
    public void onPixelmonSpawnEvent(PixelmonSpawnEvent e) {
        post(new PPixelmonSpawnEvent(e));
    }

    //PixelmonStructureGenerationEvent.class
    @SubscribeEvent
    public void onPixelmonStructureGenerationEvent(PixelmonStructureGenerationEvent e) {
        post(new PPixelmonStructureGenerationEvent(e));
    }

    //PlayerActivateShrineEvent.class
    @SubscribeEvent
    public void onPlayerActivateShrineEvent(PlayerActivateShrineEvent e) {
        post(new PPlayerActivateShrineEvent(e));
    }

    //RidePokemonEvent.class
    @SubscribeEvent
    public void onRidePokemonEvent(RidePokemonEvent e) {
        post(new PRidePokemonEvent(e));
    }

    //ThrowPokeballEvent.class
    @SubscribeEvent
    public void onThrowPokeballEvent(ThrowPokeballEvent e) {
        post(new PThrowPokeballEvent(e));
    }

}
