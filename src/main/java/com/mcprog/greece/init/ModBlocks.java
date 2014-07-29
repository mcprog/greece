package com.mcprog.greece.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import com.mcprog.greece.block.BlockColumn;
import com.mcprog.greece.block.BlockDust;
import com.mcprog.greece.block.BlockGreece;
import com.mcprog.greece.block.BlockMetal;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 *
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockGreece column = new BlockColumn();
	public static final BlockGreece copperBlock = new BlockMetal(MapColor.adobeColor);
	public static final BlockGreece tinBlock = new BlockMetal(MapColor.snowColor);
	public static final Block copperDustBlock = new BlockDust(MapColor.adobeColor);
	
	public static void init () {
		copperBlock.setBlockName(Names.Blocks.COPPER_BLOCK);
		copperDustBlock.setBlockName(Names.Blocks.COPPER_DUST_BLOCK);
		
		GameRegistry.registerBlock(column, Names.Blocks.COLUMN);
		GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
		GameRegistry.registerBlock(copperDustBlock, Names.Blocks.COPPER_DUST_BLOCK);
	}
}
