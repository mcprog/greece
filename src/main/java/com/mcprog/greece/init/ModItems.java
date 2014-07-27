package com.mcprog.greece.init;

import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.item.ItemDust;
import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemIngot;
import com.mcprog.greece.item.ItemObol;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemGreece obol = new ItemObol();
	public static final ItemGreece copperIngot = new ItemIngot();
	public static final ItemGreece tinIngot = new ItemIngot();
	public static final ItemGreece classicBronzeIngot = new ItemIngot();
	public static final ItemGreece mildBronzeIngot = new ItemIngot();
	public static final ItemGreece copperDust = new ItemDust();
	public static final ItemGreece tinDust = new ItemDust();
	public static final ItemGreece classicBronzeDust = new ItemDust();
	public static final ItemGreece mildBronzeDust = new ItemDust();
	
	public static void init () {
		copperIngot.setUnlocalizedName(Names.Items.COPPER_INGOT);
		tinIngot.setUnlocalizedName(Names.Items.TIN_INGOT);
		classicBronzeIngot.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_INGOT);
		mildBronzeIngot.setUnlocalizedName(Names.Items.MILD_BRONZE_INGOT);
		copperDust.setUnlocalizedName(Names.Items.COPPER_DUST);
		tinDust.setUnlocalizedName(Names.Items.TIN_DUST);
		classicBronzeDust.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_DUST);
		mildBronzeDust.setUnlocalizedName(Names.Items.MILD_BRONZE_DUST);
		
		OreDictionary.registerOre(Names.OreDictionary.INGOT_COPPER, copperIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_TIN, tinIngot);
		OreDictionary.registerOre(Names.OreDictionary.DUST_COPPER, copperDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_TIN, tinDust);
		
		GameRegistry.registerItem(obol, Names.Items.OBOL);
		GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
		GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);
		GameRegistry.registerItem(classicBronzeIngot, Names.Items.CLASSIC_BRONZE_INGOT);
		GameRegistry.registerItem(mildBronzeIngot, Names.Items.MILD_BRONZE_INGOT);
		GameRegistry.registerItem(copperDust, Names.Items.COPPER_DUST);
		GameRegistry.registerItem(tinDust, Names.Items.TIN_DUST);
		GameRegistry.registerItem(classicBronzeDust, Names.Items.CLASSIC_BRONZE_DUST);
		GameRegistry.registerItem(mildBronzeDust, Names.Items.MILD_BRONZE_DUST);
	}
}
