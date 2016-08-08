package org.cakepowered.pixelmon;

import org.cakepowered.api.core.CakePlugin;
import org.cakepowered.api.event.EventSubscribe;
import org.cakepowered.api.event.InitializationEvent;

import net.minecraftforge.common.MinecraftForge;

@CakePlugin(name = "PixelMon|Module", id = "pixelmon_module", version = "1.0.0")
public class PixelmonCore {

	@EventSubscribe
	public static void init(InitializationEvent event){
		MinecraftForge.EVENT_BUS.register(EventInstance.INSTANCE);
	}

}
