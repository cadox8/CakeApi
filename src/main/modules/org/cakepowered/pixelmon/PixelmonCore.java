package org.cakepowered.pixelmon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = "PixelMon|Module", modid = "pixelmon_module", version = "1.0.0")
public class PixelmonCore {

	@Mod.EventHandler
	public static void init(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(EventInstance.INSTANCE);
	}

}
