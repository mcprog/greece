package com.mcprog.greece.init;

import scala.reflect.internal.Trees.New;

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
 * @author ime990
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
		 * copper dust from copper dust block
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperDust, 9), new ItemStack(ModBlocks.copperDustBlock));
		
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
		 * electrum dust
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.electrumDust, 2), 
				Names.OreDictionary.DUST_SILVER,
				Names.OreDictionary.DUST_GOLD));
		
		/*
		 * Dust from ore
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust), ModBlocks.copperOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinDust), ModBlocks.tinOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverDust), ModBlocks.silverOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldDust), Blocks.gold_ore, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * metal blocks from ingots
		 */
		addStorageRecipe(new ItemStack(ModBlocks.copperBlock), Names.OreDictionary.INGOT_COPPER);
		addStorageRecipe(new ItemStack(ModBlocks.tinBlock), Names.OreDictionary.INGOT_TIN);
		addStorageRecipe(new ItemStack(ModBlocks.silverBlock), Names.OreDictionary.INGOT_SILVER);
		addStorageRecipe(new ItemStack(ModBlocks.classicBronzeBlock), ModItems.classicBronzeIngot);
		addStorageRecipe(new ItemStack(ModBlocks.mildBronzeBlock), ModItems.mildBronzeIngot);
		addStorageRecipe(new ItemStack(ModBlocks.electrumBlock), ModItems.electrumIngot);
		
		/*
		 * ingots from nuggets
		 */
		addStorageRecipe(new ItemStack(ModItems.copperIngot), Names.OreDictionary.NUGGET_COPPER);
		addStorageRecipe(new ItemStack(ModItems.tinIngot), Names.OreDictionary.NUGGET_TIN);
		addStorageRecipe(new ItemStack(ModItems.silverIngot), Names.OreDictionary.NUGGET_SILVER);
		addStorageRecipe(new ItemStack(ModItems.classicBronzeIngot), ModItems.classicBronzeNugget);
		addStorageRecipe(new ItemStack(ModItems.mildBronzeIngot), ModItems.mildBronzeNugget);
		addStorageRecipe(new ItemStack(ModItems.electrumIngot), ModItems.electrumNugget);
		
		/*
		 * nuggets from ingots
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperNugget, 9), Names.OreDictionary.INGOT_COPPER);
		addUnStorageRecipe(new ItemStack(ModItems.tinNugget, 9), Names.OreDictionary.INGOT_TIN);
		addUnStorageRecipe(new ItemStack(ModItems.silverNugget, 9), Names.OreDictionary.INGOT_SILVER);
		addUnStorageRecipe(new ItemStack(ModItems.classicBronzeNugget, 9), new ItemStack(ModItems.classicBronzeIngot));
		addUnStorageRecipe(new ItemStack(ModItems.mildBronzeNugget, 9), new ItemStack(ModItems.mildBronzeIngot));
		addUnStorageRecipe(new ItemStack(ModItems.electrumNugget, 9), new ItemStack(ModItems.electrumIngot));
		
		/*
		 * ingots from blocks
		 */
		addUnStorageRecipe(new ItemStack(ModItems.copperIngot, 9), new ItemStack(ModBlocks.copperBlock));
		addUnStorageRecipe(new ItemStack(ModItems.tinIngot, 9), new ItemStack(ModBlocks.tinBlock));
		addUnStorageRecipe(new ItemStack(ModItems.silverIngot, 9), new ItemStack(ModBlocks.silverBlock));
		addUnStorageRecipe(new ItemStack(ModItems.classicBronzeIngot, 9), new ItemStack(ModBlocks.classicBronzeBlock));
		addUnStorageRecipe(new ItemStack(ModItems.mildBronzeIngot, 9), new ItemStack(ModBlocks.mildBronzeBlock));
		addUnStorageRecipe(new ItemStack(ModItems.electrumIngot, 9), new ItemStack(ModBlocks.electrumBlock));
		
		/*
		 * dust from tiny piles of dust
		 */
		addDustRecipe(new ItemStack(ModItems.copperDust), ModItems.tinyPileOfCopperDust);		
		addDustRecipe(new ItemStack(ModItems.tinDust), ModItems.tinyPileOfTinDust);
		addDustRecipe(new ItemStack(ModItems.silverDust), ModItems.tinyPileOfSilverDust);
		addDustRecipe(new ItemStack(ModItems.goldDust), ModItems.tinyPileOfGoldDust);
		addDustRecipe(new ItemStack(ModItems.classicBronzeDust), ModItems.tinyPileOfClassicBronzeDust);
		addDustRecipe(new ItemStack(ModItems.mildBronzeDust), ModItems.tinyPileOfMildBronzeDust);
		addDustRecipe(new ItemStack(ModItems.electrumDust), ModItems.tinyPileOfElectrumDust);
		
		/*
		 * tiny piles of dust from dust
		 */
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfCopperDust, 4),  new ItemStack(ModItems.copperDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfTinDust, 4), new ItemStack(ModItems.tinDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfSilverDust, 4), new ItemStack(ModItems.silverDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfGoldDust, 4), new ItemStack(ModItems.goldDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfClassicBronzeDust, 4), new ItemStack(ModItems.classicBronzeDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfMildBronzeDust, 4), new ItemStack(ModItems.mildBronzeDust));
		addUnStorageRecipe(new ItemStack(ModItems.tinyPileOfElectrumDust, 4), new ItemStack(ModItems.electrumDust));
		
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
		
		/*
		 * column
		 */
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
		
		/*
		 * Silver Stater (temp. recipes for coins)
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.silverStater),
				" ik",
				"ii ",
				'i', new ItemStack(ModItems.silverNugget), 'k', new ItemStack(ModItems.silverIngot));
		
		/*
		 * Silver Drachma
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.silverDrachma),
				"i i",
				"iii",
				" i ",
				'i', new ItemStack(ModItems.silverNugget));
		
		/*
		 * Silver Obol
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.silverObol),
				"i",
				'i', new ItemStack(ModItems.silverNugget));
		
		/*
		 * Electrum Stater
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.electrumStater),
				" ik",
				"ii ",
				'i', new ItemStack(ModItems.electrumNugget), 'k', new ItemStack(ModItems.electrumIngot));
		
		/*
		 * Electrum Drachma
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.electrumDrachma),
				"i i",
				"iii",
				" i ",
				'i', new ItemStack(ModItems.electrumNugget));
		
		/*
		 * Electrum Obol
		 */
		GameRegistry.addRecipe(new ItemStack(ModItems.electrumObol),
				"i",
				'i', new ItemStack(ModItems.electrumNugget));
		
		//***********************
		//*      Smelting       *
		//***********************
		
		/*
		 * dusts
		 */
		GameRegistry.addSmelting(ModItems.copperDust, new ItemStack(ModItems.copperIngot), 0F);
		GameRegistry.addSmelting(ModItems.tinDust, new ItemStack(ModItems.tinIngot), 0F);
		GameRegistry.addSmelting(ModItems.silverDust, new ItemStack(ModItems.silverIngot), 0F);
		GameRegistry.addSmelting(ModItems.goldDust, new ItemStack(Items.gold_ingot), 0F);
		GameRegistry.addSmelting(ModItems.classicBronzeDust, new ItemStack(ModItems.classicBronzeIngot), 0F);
		GameRegistry.addSmelting(ModItems.mildBronzeDust, new ItemStack(ModItems.mildBronzeIngot), 0F);
		GameRegistry.addSmelting(ModItems.electrumDust, new ItemStack(ModItems.electrumIngot), 0F);
	
		/*
		 * ore
		 */
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0.5F);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot), 0.7F);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot), 0.7F);
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
	
	protected static void addDustRecipe (ItemStack out, Item in) {
		GameRegistry.addShapelessRecipe(out,
				in, in,
				in, in);
	}
	
}
