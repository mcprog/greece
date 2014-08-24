package com.mcprog.greece.inventory;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotOre extends Slot {

	public SlotOre(IInventory inventory, int id, int x, int y) {
		super(inventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemStack) {
		return Block.getBlockFromItem(itemStack.getItem()) instanceof BlockOre || 
				Block.getBlockFromItem(itemStack.getItem()).getUnlocalizedName().toLowerCase().indexOf("ore") != -1;
	}

}
