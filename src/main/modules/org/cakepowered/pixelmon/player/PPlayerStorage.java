package org.cakepowered.pixelmon.player;

import java.util.UUID;

import org.cakepowered.api.core.References;
import org.cakepowered.api.core.Server;
import org.cakepowered.api.nbt.INBTserializable;
import org.cakepowered.api.nbt.NBTCompound;
import org.cakepowered.mod.CakeApiCore;

import com.pixelmonmod.pixelmon.pokedex.Pokedex;
import com.pixelmonmod.pixelmon.storage.PixelmonStorage;
import com.pixelmonmod.pixelmon.storage.PlayerNotLoadedException;
import com.pixelmonmod.pixelmon.storage.PlayerStorage;

public class PPlayerStorage {

	public static PPlayerStorage getPlayerStorage(UUID uuid){
		try {
			return new PPlayerStorage(PixelmonStorage.PokeballManager.getPlayerStorage(CakeApiCore.getServer().getPlayerList().getPlayerByUUID(uuid)));
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
