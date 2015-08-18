package org.cakepowered.api.item;

import org.cakepowered.api.inventory.ItemStack;

public interface Item {

	/**
	 * Returns the internal name, ej: item.apple
	 */
	public String getUnlocalizedName(ItemStack stack);
	
	/**
	 * Returns the item that the furnace leaves after burn this item
	 */
	public Item getContainerItem();
	
	/**
	 * Creates a new ItemStack using this item and the amount
	 */
	public ItemStack createStack(int amount);
	
	/**
	 * Creates a new ItemStack using this item, the amount (fist arg) and the metadata (second arg)
	 */
	public ItemStack createStack(int amount, int metadata);
}
