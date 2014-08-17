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
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.copperDustBlock, 
				"ddd", 
				"ddd", 
				"ddd", 
				'd', Names.OreDictionary.DUST_COPPER));
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust, 2), ModBlocks.copperOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * copper dust from block
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust, 9), ModBlocks.copperDustBlock);
		
		/*
		 * tin dust from ore
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinDust, 2), ModBlocks.tinOre, new ItemStack(ModItems.grindstone, 1, OreDictionary.WILDCARD_VALUE));
		
		/*
		 * copper block
		 */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), 
				"iii", 
				"iii", 
				"iii", 
				'i', new ItemStack(ModItems.copperIngot));
		
		/*
		 * tin block
		 */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tinBlock), 
				"iii", 
				"iii", 
				"iii", 
				'i', new ItemStack(ModItems.tinIngot));
		
		/*
		 * classic bronze block
		 */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.classicBronzeBlock), 
				"iii", 
				"iii", 
				"iii", 
				'i', new ItemStack(ModItems.classicBronzeIngot));
		
		/*
		 * mild bronze block
		 */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mildBronzeBlock), 
				"iii", 
				"iii", 
				"iii", 
				'i', new ItemStack(ModItems.mildBronzeIngot));
		/*
		 * ingots from nuggets
		 */
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperIngot,
				"nnn",
				"nnn",
				"nnn",
				'n', Names.OreDictionary.NUGGET_COPPER));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinIngot,
				"nnn",
				"nnn",
				"nnn",
				'n', Names.OreDictionary.NUGGET_TIN));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.classicBronzeIngot,
				"nnn",
				"nnn",
				"nnn",
				'n', ModItems.classicBronzeNugget));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.mildBronzeIngot,
				"nnn",
				"nnn",
				"nnn",
				'n', ModItems.mildBronzeNugget));
		
		/*
		 * ingots from blocks
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.copperIngot, 9), ModBlocks.copperBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.tinIngot, 9), ModBlocks.tinBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.classicBronzeIngot, 9), ModBlocks.classicBronzeBlock));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mildBronzeIngot, 9), ModBlocks.mildBronzeBlock));
		
		/*
		 * nuggets from ingots
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.copperNugget, 9), Names.OreDictionary.INGOT_COPPER));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.tinNugget, 9), Names.OreDictionary.INGOT_TIN));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.classicBronzeNugget, 9), new ItemStack(ModItems.classicBronzeIngot)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mildBronzeNugget, 9), new ItemStack(ModItems.mildBronzeIngot)));
		
		
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
				'i', new ItemStack(Items.stick), 'k', new ItemStack(Blocks.stone));
		GameRegistry.addRecipe(new ItemStack(ModItems.grindstone),
				"i",
				"k",
				'i', new ItemStack(ModItems.grindWheel), 'k', new ItemStack(ModItems.stoneBase));
		
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
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0F);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot), 0F);
	}
}
