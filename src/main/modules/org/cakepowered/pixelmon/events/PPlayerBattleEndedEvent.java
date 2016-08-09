package org.cakepowered.pixelmon.events;

import org.cakepowered.api.entity.Player;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.util.ForgeInterface;
import org.cakepowered.pixelmon.enums.PBattleResults;

import com.pixelmonmod.pixelmon.api.events.PlayerBattleEndedAbnormalEvent;
import com.pixelmonmod.pixelmon.api.events.PlayerBattleEndedEvent;
import com.pixelmonmod.pixelmon.api.interactions.IInteraction;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class PPlayerBattleEndedEvent extends ApiEvent {
		
	private PlayerBattleEndedEvent e;
	private PlayerBattleEndedAbnormalEvent ea;

	public PPlayerBattleEndedEvent(PlayerBattleEndedEvent e) {
		super(e);
		this.e = e;
	}
	
	public PPlayerBattleEndedEvent(PlayerBattleEndedAbnormalEvent ea) {
		super(ea);
		this.ea = ea;
	}

	public PBattleResults getResult(){
		return (e == null) ? PBattleResults.ERROR : PBattleResults.valueOf(e.result.name());
	}
	
	public Player getPlayer(){
		return (e == null) ? ForgeInterface.getPlayer(ea.player) : ForgeInterface.getPlayer(e.player);
	}
	
}
