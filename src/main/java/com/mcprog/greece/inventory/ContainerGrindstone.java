package com.mcprog.greece.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.mcprog.greece.tileentity.TileEntityGrindstone;

public class ContainerGrindstone extends Container {

	private TileEntityGrindstone te;
	
	public ContainerGrindstone (InventoryPlayer invPlayer, TileEntityGrindstone te) {
		this.te = te;
		
		addSlotToContainer(new SlotOre(te, TileEntityGrindstone.slotIn, 56, 17));
		addSlotToContainer(new Slot(te, TileEntityGrindstone.slotFuel, 56, 53));
		addSlotToContainer(new SlotOutput(te, TileEntityGrindstone.slotOut, 116, 35));
		
		/*
		 * Hotbar
		 */
		for (int i = 0; i < 9; ++i) {
			addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
		
		/*
		 * Player's inventory
		 */
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		return null;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return te.isUseableByPlayer(player);
	}

}
