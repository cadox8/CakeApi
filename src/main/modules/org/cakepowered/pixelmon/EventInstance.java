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
    public void on(EconomyEvent e) {
        post(new PEconomyEvent(e));
    }

    @SubscribeEvent
    public void on(GetBalanceEvent e) {
        post(new PGetBalanceEvent(e));
    }

    @SubscribeEvent
    public void on(PreTransactionEvent e) {
        post(new PPreTransactionEvent(e));
    }

    @SubscribeEvent
    public void on(PostTransactionEvent e) {
        post(new PPostTransactionEvent(e));
    }


    //BattleStartedEvent
    @SubscribeEvent
    public void on(BattleStartedEvent e) {
        post(new PBattleStartedEvent(e));
    }

    //PlayerBattleEndedEvent.class
    @SubscribeEvent
    public void on(PlayerBattleEndedEvent e) {
        post(new PPlayerBattleEndedEvent(e));
    }

    //PlayerBattleEndedAbnormalEvent.class
    @SubscribeEvent
    public void on(PlayerBattleEndedAbnormalEvent e) {
        post(new PPlayerBattleEndedEvent(e));
    }


    //LostToTrainerEvent.class
    @SubscribeEvent
    public void on(LostToTrainerEvent e) {
        post(new PTrainerBattleEndedEvent(e));
    }

    //BeatTrainerEvent.class
    @SubscribeEvent
    public void on(BeatTrainerEvent e) {
        post(new PTrainerBattleEndedEvent(e));
    }


    //LevelUpEvent.class
    @SubscribeEvent
    public void on(LevelUpEvent e) {
        post(new PLevelUpEvent(e));
    }

    //RareCandyEvent.class
    @SubscribeEvent
    public void on(RareCandyEvent e) {
        post(new PRareCandyEvent(e));
    }

    //PixelmonCaptureEvent.class
    @SubscribeEvent
    public void on(PixelmonCaptureEvent e) {
        post(new PPixelmonCaptureEvent(e));
    }

    //PixelmonSendOutEvent.class
    @SubscribeEvent
    public void on(PixelmonSendOutEvent e) {
        post(new PPixelmonSendOutEvent(e));
    }

    //PixelmonSpawnEvent.class
    @SubscribeEvent
    public void on(PixelmonSpawnEvent e) {
        post(new PPixelmonSpawnEvent(e));
    }

    //PixelmonStructureGenerationEvent.class
    @SubscribeEvent
    public void on(PixelmonStructureGenerationEvent e) {
        post(new PPixelmonStructureGenerationEvent(e));
    }

    //PlayerActivateShrineEvent.class
    @SubscribeEvent
    public void on(PlayerActivateShrineEvent e) {
        post(new PPlayerActivateShrineEvent(e));
    }

    //RidePokemonEvent.class
    @SubscribeEvent
    public void on(RidePokemonEvent e) {
        post(new PRidePokemonEvent(e));
    }

    //ThrowPokeballEvent.class
    @SubscribeEvent
    public void on(ThrowPokeballEvent e) {
        post(new PThrowPokeballEvent(e));
    }

}
