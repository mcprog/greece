package com.mcprog.greece.init;

import com.mcprog.greece.reference.Names;

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
public class Recipes {

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
		 * classic bronze dust
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.classicBronzeDust, 10), 
				Names.OreDictionary.DUST_TIN, 
				ModBlocks.copperDustBlock));
		/*
		 * mild bronze dust
		 */
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
		 * copper dust from block
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust, 9), ModBlocks.copperDustBlock);
		
		/*
		 * copper block
		 */
		GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), 
				"iii", 
				"iii", 
				"iii", 
				'i', new ItemStack(ModItems.copperIngot));
		/*
		 * copper ingots from block
		 */
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.copperIngot, 9), ModBlocks.copperBlock));
		
		//***********************
		//*      Smelting       *
		//***********************
		
		/*
		 * copper ingots
		 */
		GameRegistry.addSmelting(ModItems.copperDust, new ItemStack(ModItems.copperIngot), 0F);
		
		/*
		 * tin ingots
		 */
		GameRegistry.addSmelting(ModItems.tinDust, new ItemStack(ModItems.tinIngot), 0F);
		
		/*
		 * classic bronze ingots
		 */
		GameRegistry.addSmelting(ModItems.classicBronzeDust, new ItemStack(ModItems.classicBronzeIngot), 0F);
		
		/*
		 * mild bronze ingots
		 */
		GameRegistry.addSmelting(ModItems.mildBronzeDust, new ItemStack(ModItems.mildBronzeIngot), 0F);
	}
}
