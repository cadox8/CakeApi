package org.cakepowered.api.entity;

import org.cakepowered.api.command.CommandSender;
import org.cakepowered.api.util.Vector3;
import org.cakepowered.api.world.World;

import java.util.List;
import java.util.UUID;

public interface Entity {

	UUID getUniqueID();

	World getWorld();

	String getName();

	String getModID();

	Vector3 getPosition();

	void setPosition(Vector3 vec);

	/**
	 * la entidad sobre la que esta montada
	 */
	Entity getRiddingEntity();

	/**
	 * entidad que esta montada encima
	 */
	@Deprecated
	default Entity getRiddingByEntity(){
		return getPassengers().stream().findFirst().orElse(null);
	}

	List<Entity> getPassengers();

	int getDimensionID();

	CommandSender getCommandSender();

	void setDead();
	
	Object getEntity();
}
