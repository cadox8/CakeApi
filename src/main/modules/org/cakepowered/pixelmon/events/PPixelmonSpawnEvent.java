package org.cakepowered.pixelmon.events;

import org.cakepowered.api.util.BlockLocation;
import org.cakepowered.api.util.Vector3;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.world.ApiWorld;

import com.pixelmonmod.pixelmon.api.events.PixelmonSpawnEvent;

public class PPixelmonSpawnEvent extends ApiEvent {
	
	private PixelmonSpawnEvent e;
	
	public PPixelmonSpawnEvent(PixelmonSpawnEvent e) {
		super(e);
		this.e = e;
	}
	
	public BlockLocation getLocation(){
		return new BlockLocation(new ApiWorld(e.world).getDimension(), e.x, e.y, e.z);
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}

}
