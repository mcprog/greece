package com.mcprog.greece.init;

import com.mcprog.greece.reference.Names;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 *
 */
public class Recipes {// needs consolidation / reorganization

	public static void init () {
		//***********************
		//*      Crafting       *
		//***********************
		
		/*
		 * copper dust block
		 */
		addStorageRecipe(new ItemStack(ModBlocks.copperDustBlock), Names.OreDictionary.DUST_COPPER);
		
		/*
		 * bronze dust
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.classicBronzeDust, 10), 
				Names.OreDictionary.DUST_TIN, 
				ModBlocks.copperDustBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mildBronzeDust, 17), 
				Names.OreDictionary.DUST_TIN,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				Names.OreDictionary.DUST_COPPER,
				ModBlocks.copperDustBlock));
		/*
		 * copper dust from ore
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust), ModBlocks.copperOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * copper dust from block
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperDust, 9), new ItemStack(ModBlocks.copperDustBlock));
		
		/*
		 * tin dust from ore
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinDust), ModBlocks.tinOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * metal blocks from ingots
		 */
		addStorageRecipe(new ItemStack(ModBlocks.copperBlock), Names.OreDictionary.INGOT_COPPER);
		addStorageRecipe(new ItemStack(ModBlocks.tinBlock), Names.OreDictionary.INGOT_TIN);
		addStorageRecipe(new ItemStack(ModBlocks.classicBronzeBlock), ModItems.classicBronzeIngot);
		addStorageRecipe(new ItemStack(ModBlocks.mildBronzeBlock), ModItems.mildBronzeIngot);
		
		/*
		 * ingots from nuggets
		 */
		addStorageRecipe(new ItemStack(ModItems.copperIngot), Names.OreDictionary.NUGGET_COPPER);
		addStorageRecipe(new ItemStack(ModItems.tinIngot), Names.OreDictionary.NUGGET_TIN);
		addStorageRecipe(new ItemStack(ModItems.classicBronzeIngot), ModItems.classicBronzeNugget);
		addStorageRecipe(new ItemStack(ModItems.mildBronzeIngot), ModItems.mildBronzeNugget);
		
		/*
		 * ingots from blocks
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperIngot, 9), new ItemStack(ModBlocks.copperBlock));
		addUnStorageRecipe(new ItemStack(ModItems.tinIngot, 9), new ItemStack(ModBlocks.tinBlock));
		addUnStorageRecipe(new ItemStack(ModItems.classicBronzeIngot, 9), new ItemStack(ModBlocks.classicBronzeBlock));
		addUnStorageRecipe(new ItemStack(ModItems.mildBronzeIngot, 9), new ItemStack(ModBlocks.mildBronzeBlock));
		
		/*
		 * nuggets from ingots
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperNugget, 9), Names.OreDictionary.INGOT_COPPER);
		addUnStorageRecipe(new ItemStack(ModItems.tinNugget, 9), Names.OreDictionary.INGOT_TIN);
		addUnStorageRecipe(new ItemStack(ModItems.classicBronzeNugget, 9), new ItemStack(ModItems.classicBronzeIngot));
		addUnStorageRecipe(new ItemStack(ModItems.mildBronzeNugget, 9), new ItemStack(ModItems.mildBronzeIngot));
		
		
		/*
		 * grindstone
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneBase), 
				"   ",
				"i i",
				"iii",
				'i', new ItemStack(Blocks.stone));
		GameRegistry.addRecipe(new ItemStack(ModItems.grindWheel),
				" i",
				"kk",
				'i', new ItemStack(Items.stick), 'k', new ItemStack(Blocks.cobblestone));
		GameRegistry.addRecipe(new ItemStack(ModItems.grindstone),
				"i",
				"k",
				'i', new ItemStack(ModItems.grindWheel), 'k', new ItemStack(ModItems.stoneBase));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.column), ModBlocks.marble, new ItemStack(ModItems.chisel, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * chisel
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.chisel),
				" i",
				"i ",
				'i', new ItemStack(ModItems.classicBronzeIngot));
		/*
		 * xiphos
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.knife),
				"i",
				"i",
				"k",
				'i', new ItemStack(ModItems.classicBronzeIngot), 'k', new ItemStack(Items.stick));
		
		/*
		 * spear
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.spear),
				"  i",
				" k ",
				"k  ",
				'i', new ItemStack(ModItems.classicBronzeIngot), 'k', new ItemStack(Items.stick));
		
		//***********************
		//*      Smelting       *
		//***********************
		
		/*
		 * dusts
		 */
		GameRegistry.addSmelting(ModItems.copperDust, new ItemStack(ModItems.copperIngot), 0F);
		GameRegistry.addSmelting(ModItems.tinDust, new ItemStack(ModItems.tinIngot), 0F);
		GameRegistry.addSmelting(ModItems.classicBronzeDust, new ItemStack(ModItems.classicBronzeIngot), 0F);
		GameRegistry.addSmelting(ModItems.mildBronzeDust, new ItemStack(ModItems.mildBronzeIngot), 0F);
		
		/*
		 * ore
		 */
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0.5F);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot), 0.7F);
	}
	
	protected static void addStorageRecipe (ItemStack out, Item in) {
		GameRegistry.addShapelessRecipe(out, 
				in, in, in, 
				in, in, in, 
				in, in, in);
	}
	
	protected static void addStorageRecipe (ItemStack out, Block in) {
		GameRegistry.addShapelessRecipe(out, 
				in, in, in, 
				in, in, in, 
				in, in, in);
	}
	
	protected static void addStorageRecipe (ItemStack out, String in) {
		GameRegistry.addRecipe(new ShapelessOreRecipe(out, 
				in, in, in,
				in, in, in,
				in, in, in));
	}
	
	protected static void addUnStorageRecipe (ItemStack out, ItemStack in) {
		GameRegistry.addShapelessRecipe(out, in);
	}
	
	protected static void addUnStorageRecipe (ItemStack out, String in) {
		GameRegistry.addRecipe(new ShapelessOreRecipe(out, in));
	}
	
}
