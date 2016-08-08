package org.cakepowered.pixelmon;

import com.pixelmonmod.pixelmon.client.models.obj.utils.Logger;

import net.minecraftforge.common.MinecraftForge;

public class PixelmonCore {
	
	public static void init(){
		
		MinecraftForge.EVENT_BUS.register(EventInstance.INSTANCE);
		
	}

}
