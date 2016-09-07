package org.cakepowered.pixelmon.player;

import org.cakepowered.mod.CakeApiCore;

import com.pixelmonmod.pixelmon.storage.PixelmonStorage;
import com.pixelmonmod.pixelmon.storage.PlayerNotLoadedException;
import com.pixelmonmod.pixelmon.storage.PlayerStorage;

import java.util.UUID;

public class PPlayerStorage {

	public static PPlayerStorage getPlayerStorage(UUID uuid){
		try {
			return new PPlayerStorage(PixelmonStorage.pokeBallManager.getPlayerStorage(CakeApiCore.getServer().getPlayerList().getPlayerByUUID(uuid)));
		} catch (PlayerNotLoadedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private PlayerStorage playerStorage;
	
	public PPlayerStorage(PlayerStorage playerStorage) {
		this.playerStorage = playerStorage;
	}
	
	public int getPokedexCount(){
		return playerStorage.pokedex.countCaught();
	}
	
	public void addCurrency(int amount){
		playerStorage.addCurrency(amount);
	}
	
	public void removeCurrency(int amount){
		playerStorage.removeCurrency(amount);
	}
	
	public void setCurrency(int amount){
		playerStorage.setCurrency(amount);
	}
	
	public int getCurrency(){
		return playerStorage.getCurrency();
	}
}
