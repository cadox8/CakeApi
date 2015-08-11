package org.cakepowered.api.events;

import org.cakepowered.api.base.Game;
import org.cakepowered.api.base.Player;
import org.cakepowered.api.util.Vector3i;
import org.cakepowered.api.util.Direction;
import org.cakepowered.api.util.ForgeInterface;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class ApiPlayerInteractBlockEvent implements org.cakepowered.api.event.PlayerInteractEvent{

	public PlayerInteractEvent event;
	
	public ApiPlayerInteractBlockEvent(PlayerInteractEvent e){
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
	public Vector3i getBlock() {
		return ForgeInterface.getBlockPos(event.pos);
	}

	@Override
	public Direction getFace() {
		return ForgeInterface.getDirection(event.face);
	}

	@Override
	public ClickAction getAction() {
		if(event.action == null)return null;
		return ClickAction.values()[event.action.ordinal()];
	}
}
