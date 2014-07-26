package com.mcprog.greece.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init () {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), "iii", "iii", "iii", 'i', new ItemStack(ModItems.copperIngot));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.classicBronzeIngot), new ItemStack(ModItems.tinIngot), new ItemStack(ModBlocks.copperBlock));
	}
}
