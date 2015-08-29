package org.cakepowered.api.util;

import org.cakepowered.api.tileentity.TileEntities;

import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.tileentity.TileEntityDaylightDetector;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntitySkull;

public class ApiUtils {

	public static void registerEntities() {
		TileEntities.BANNER = ForgeInterface.getTileEntity(new TileEntityBanner());
		TileEntities.COMMAND_BLOCK = ForgeInterface.getTileEntity(new TileEntityCommandBlock());
		TileEntities.COMPARATOR = ForgeInterface.getTileEntity(new TileEntityComparator());
		TileEntities.DAYLIGHT_DETECTOR = ForgeInterface.getTileEntity(new TileEntityDaylightDetector());
		TileEntities.ENCHANTMENT_TABLE = ForgeInterface.getTileEntity(new TileEntityEnchantmentTable());
		TileEntities.ENDER_CHEST = ForgeInterface.getTileEntity(new TileEntityEnderChest());
		TileEntities.END_PORTAL = ForgeInterface.getTileEntity(new TileEntityEndPortal());
		TileEntities.FLOWER_POT = ForgeInterface.getTileEntity(new TileEntityFlowerPot());
		TileEntities.BEACON = ForgeInterface.getTileEntity(new TileEntityBeacon());
		TileEntities.BREWING_STAND = ForgeInterface.getTileEntity(new TileEntityBrewingStand());
		TileEntities.CHEST = ForgeInterface.getTileEntity(new TileEntityChest());
		TileEntities.DISPENSER = ForgeInterface.getTileEntity(new TileEntityDispenser());
		TileEntities.DROPPER = ForgeInterface.getTileEntity(new TileEntityDropper());
		TileEntities.FURNACE = ForgeInterface.getTileEntity(new TileEntityFurnace());
		TileEntities.HOPPER = ForgeInterface.getTileEntity(new TileEntityHopper());
		TileEntities.SPAWNER = ForgeInterface.getTileEntity(new TileEntityMobSpawner());
		TileEntities.NOTEBLOCK = ForgeInterface.getTileEntity(new TileEntityNote());
		TileEntities.SIGN = ForgeInterface.getTileEntity(new TileEntitySign());
		TileEntities.SKULL = ForgeInterface.getTileEntity(new TileEntitySkull());
	}
}
