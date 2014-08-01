package com.mcprog.greece.item;

import net.minecraft.item.ItemStack;

public class ItemGrindstone extends ItemGreece {
	
	public ItemGrindstone () {
		this.setMaxStackSize(1);
		this.setMaxDamage(48);
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
		return false;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem (ItemStack itemStack) {
		ItemStack stack = itemStack.copy();
		stack.setItemDamage(stack.getItemDamage() + 1);
		return stack;
	}

}
