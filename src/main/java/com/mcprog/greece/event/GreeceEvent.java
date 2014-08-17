package com.mcprog.greece.event;

import com.mcprog.greece.init.ModBlocks;
import com.mcprog.greece.init.ModItems;
import com.mcprog.greece.init.ModStats;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

/**
 * 
 * @author mcprog
 *
 */
public class GreeceEvent {

	@SubscribeEvent
	public void onOldOreMined (PlayerEvent.ItemPickupEvent event) {
		if (event.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModBlocks.copperOre))) {
			event.player.addStat(ModStats.oldOreMiner, 1);
		}
	}
}
