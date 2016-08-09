package org.cakepowered.pixelmon.events;

import org.cakepowered.api.util.BlockLocation;
import org.cakepowered.mod.event.ApiEvent;
import org.cakepowered.mod.world.ApiWorld;

import com.pixelmonmod.pixelmon.api.events.PixelmonStructureGenerationEvent;

public class PPixelmonStructureGenerationEvent extends ApiEvent {
	
	private PixelmonStructureGenerationEvent e;
	
	public PPixelmonStructureGenerationEvent(PixelmonStructureGenerationEvent e) {
		super(e);
		this.e = e;
	}
	
	public BlockLocation getLocation(){
		return new BlockLocation(new ApiWorld(e.world).getDimension(), e.pos.getX(), e.pos.getY(), e.pos.getZ());
	}
	
	public String getStructureName(){
		return e.structureData.id;
	}
	
	public void setCanceled(boolean cancel){
		e.setCanceled(cancel);
	}
	
}
