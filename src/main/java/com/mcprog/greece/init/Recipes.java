package com.mcprog.greece.init;

import com.mcprog.greece.reference.Names;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init () {
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.copperDustBlock, 
				"ddd", 
				"ddd", 
				"ddd", 
				'd', Names.OreDictionary.DUST_COPPER));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.classicBronzeDust, 10), 
				Names.OreDictionary.DUST_TIN, 
				ModBlocks.copperDustBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperDust, 9), new ItemStack(ModBlocks.copperDustBlock));
		
		GameRegistry.addSmelting(ModItems.copperDust, new ItemStack(ModItems.copperIngot), 0F);
		GameRegistry.addSmelting(ModItems.tinDust, new ItemStack(ModItems.tinIngot), 0F);
		GameRegistry.addSmelting(ModItems.classicBronzeDust, new ItemStack(ModItems.classicBronzeIngot), 0F);
		GameRegistry.addSmelting(ModItems.mildBronzeDust, new ItemStack(ModItems.mildBronzeIngot), 0F);
	}
}
