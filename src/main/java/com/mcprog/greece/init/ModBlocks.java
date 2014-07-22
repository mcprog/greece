package com.mcprog.greece.init;

import net.minecraft.block.Block;

import com.mcprog.greece.blocks.BlockColumn;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final Block column = new BlockColumn();
	
	public static void init () {
		GameRegistry.registerBlock(column, Names.Blocks.COLUMN);
	}
}
