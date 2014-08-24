package com.mcprog.greece.init;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.block.BlockColumn;
import com.mcprog.greece.block.BlockDust;
import com.mcprog.greece.block.BlockGreece;
import com.mcprog.greece.block.BlockGrindstone;
import com.mcprog.greece.block.BlockLetter;
import com.mcprog.greece.block.BlockMetal;
import com.mcprog.greece.block.OreGreece;
import com.mcprog.greece.handler.NameHandler;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 * @author ime990
 *
 */
public class ModBlocks {// no object holder annotation becuase of arraylist

	public static final BlockGreece column = new BlockColumn();
	
	public static final BlockGreece copperBlock = new BlockMetal(MapColor.adobeColor);
	public static final BlockGreece tinBlock = new BlockMetal(MapColor.snowColor);
	public static final BlockGreece silverBlock = new BlockMetal(MapColor.silverColor);
	public static final BlockGreece classicBronzeBlock = new BlockMetal(MapColor.goldColor);
	public static final BlockGreece mildBronzeBlock = new BlockMetal(MapColor.adobeColor);
	public static final BlockGreece electrumBlock = new BlockMetal(MapColor.goldColor);
	public static final Block copperDustBlock = new BlockDust(MapColor.adobeColor);
	
	public static final ArrayList<BlockLetter> letterBlocks = new ArrayList<BlockLetter>();

	public static final OreGreece copperOre = new OreGreece();
	public static final OreGreece tinOre = new OreGreece();
	public static final OreGreece silverOre = new OreGreece();
	
	public static final Block marble = new BlockGreece();
	
	public static final BlockGreece grindstone = new BlockGrindstone();
	
	/**
	 * init of blocks and registration
	 * naming
	 * oredict
	 * gameregistry
	 */
	public static void init () {
		
		/*
		 * Letter block naming and registry code
		 */
		for (int i = 0; i <= NameHandler.length(); ++i) {
			BlockLetter bL = new BlockLetter();
			String name = NameHandler.getNameFromIndex(i);
			bL.setBlockName(name);
			GameRegistry.registerBlock(bL, name);
			letterBlocks.add(bL);
		}
		
		copperBlock.setBlockName(Names.Blocks.COPPER_BLOCK);
		tinBlock.setBlockName(Names.Blocks.TIN_BLOCK);
		silverBlock.setBlockName(Names.Blocks.SILVER_BLOCK);
		classicBronzeBlock.setBlockName(Names.Blocks.CLASSIC_BRONZE_BLOCK);
		mildBronzeBlock.setBlockName(Names.Blocks.MILD_BRONZE_BLOCK);
		electrumBlock.setBlockName(Names.Blocks.ELECTRUM_BLOCK);
		copperDustBlock.setBlockName(Names.Blocks.COPPER_DUST_BLOCK);
		
		copperOre.setBlockName(Names.Blocks.COPPER_ORE);
		tinOre.setBlockName(Names.Blocks.TIN_ORE);
		silverOre.setBlockName(Names.Blocks.SILVER_ORE);
		
		marble.setBlockName(Names.Blocks.MARBLE);
		
		grindstone.setBlockName(Names.Blocks.GRINDSTONE);
		
		GameRegistry.registerBlock(column, Names.Blocks.COLUMN);
		GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
		GameRegistry.registerBlock(tinBlock, Names.Blocks.TIN_BLOCK);
		GameRegistry.registerBlock(silverBlock, Names.Blocks.SILVER_BLOCK);
		GameRegistry.registerBlock(classicBronzeBlock, Names.Blocks.CLASSIC_BRONZE_BLOCK);
		GameRegistry.registerBlock(mildBronzeBlock, Names.Blocks.MILD_BRONZE_BLOCK);
		GameRegistry.registerBlock(electrumBlock, Names.Blocks.ELECTRUM_BLOCK);
		GameRegistry.registerBlock(copperDustBlock, Names.Blocks.COPPER_DUST_BLOCK);
		
		GameRegistry.registerBlock(copperOre, Names.Blocks.COPPER_ORE);
		GameRegistry.registerBlock(tinOre, Names.Blocks.TIN_ORE);
		GameRegistry.registerBlock(silverOre, Names.Blocks.SILVER_ORE);
		GameRegistry.registerBlock(marble, Names.Blocks.MARBLE);
		
		GameRegistry.registerBlock(grindstone, Names.Blocks.GRINDSTONE);
	}
	
	public static void oreDictionary () {
		OreDictionary.registerOre(Names.OreDictionary.ORE_COPPER, copperOre);
		OreDictionary.registerOre(Names.OreDictionary.ORE_TIN, tinOre);
		OreDictionary.registerOre(Names.OreDictionary.ORE_SILVER, silverOre);
	}
}
