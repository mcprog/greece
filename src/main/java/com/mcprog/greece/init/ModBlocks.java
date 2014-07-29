package com.mcprog.greece.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import com.mcprog.greece.block.BlockColumn;
import com.mcprog.greece.block.BlockDust;
import com.mcprog.greece.block.BlockGreece;
import com.mcprog.greece.block.BlockLetter;
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
	public static final BlockGreece classicBronzeBlock = new BlockMetal(MapColor.goldColor);
	public static final BlockGreece mildBronzeBlock = new BlockMetal(MapColor.adobeColor);
	public static final Block copperDustBlock = new BlockDust(MapColor.adobeColor);
	public static final BlockLetter letterBlockAlpha = new BlockLetter();
	public static final BlockLetter letterBlockBeta = new BlockLetter();
	public static final BlockLetter letterBlockGamma = new BlockLetter();
	public static final BlockLetter letterBlockDelta = new BlockLetter();
	
	public static void init () {
		copperBlock.setBlockName(Names.Blocks.COPPER_BLOCK);
		tinBlock.setBlockName(Names.Blocks.TIN_BLOCK);
		classicBronzeBlock.setBlockName(Names.Blocks.CLASSIC_BRONZE_BLOCK);
		mildBronzeBlock.setBlockName(Names.Blocks.MILD_BRONZE_BLOCK);
		copperDustBlock.setBlockName(Names.Blocks.COPPER_DUST_BLOCK);
		letterBlockAlpha.setBlockName("letterBlockAlpha");
		letterBlockBeta.setBlockName("letterBlockBeta");
		
		
		GameRegistry.registerBlock(column, Names.Blocks.COLUMN);
		GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
		GameRegistry.registerBlock(tinBlock, Names.Blocks.TIN_BLOCK);
		GameRegistry.registerBlock(classicBronzeBlock, Names.Blocks.CLASSIC_BRONZE_BLOCK);
		GameRegistry.registerBlock(mildBronzeBlock, Names.Blocks.MILD_BRONZE_BLOCK);
		GameRegistry.registerBlock(copperDustBlock, Names.Blocks.COPPER_DUST_BLOCK);
		GameRegistry.registerBlock(letterBlockAlpha, "letterBlockAlpha");
		GameRegistry.registerBlock(letterBlockBeta, "letterBlockBeta");
	}
}
