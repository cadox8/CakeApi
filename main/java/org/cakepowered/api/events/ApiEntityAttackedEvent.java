package org.cakepowered.api.events;

import org.cakepowered.api.base.Entity;
import org.cakepowered.api.base.Game;
import org.cakepowered.api.base.Player;
import org.cakepowered.api.event.EntityAttackedEvent;
import org.cakepowered.api.util.ForgeInterface;

import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ApiEntityAttackedEvent implements EntityAttackedEvent {

	public AttackEntityEvent event;
	
	public ApiEntityAttackedEvent(AttackEntityEvent e) {
		event = e;
	}
	
	@Override
	public Player getPlayer() {
		return ForgeInterface.getPlayer(event.entityPlayer);
	}

	@Override
	public Game getGame() {
		return ForgeInterface.getGame();
	}

	@Override
	public boolean isEventCancelable() {
		return event.isCancelable();
	}

	@Override
	public void setEventCanceled(boolean value) {
		event.setCanceled(value);
	}

	@Override
	public boolean hasEventResult() {
		return event.hasResult();
	}

	@Override
	public EventResult getEventResult() {
		return ForgeInterface.getEventResult(event.getResult());
	}

	@Override
	public boolean isEventCanceled() {
		return event.isCanceled();
	}

	@Override
	public Entity getEntity() {
		return ForgeInterface.getEntity(event.target);
	}
}
