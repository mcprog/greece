package com.mcprog.greece.init;

import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemMetal;
import com.mcprog.greece.item.ItemObol;
import com.mcprog.greece.item.info.SpecificInfo;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemGreece obol = new ItemObol();
	public static final ItemMetal copperIngot = new ItemMetal();
	public static final ItemMetal tinIngot = new ItemMetal();
	public static final ItemMetal classicBronzeIngot = new ItemMetal();
	public static final ItemMetal mildBronzeIngot = new ItemMetal();
	public static final ItemMetal copperDust = new ItemMetal();
	public static final ItemMetal tinDust = new ItemMetal();
	public static final ItemMetal classicBronzeDust = new ItemMetal();
	public static final ItemMetal mildBronzeDust = new ItemMetal();
	
	public static void init () {
		copperIngot.setUnlocalizedName(Names.Items.COPPER_INGOT);
		tinIngot.setUnlocalizedName(Names.Items.TIN_INGOT);
		classicBronzeIngot.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_INGOT);
		mildBronzeIngot.setUnlocalizedName(Names.Items.MILD_BRONZE_INGOT);
		copperDust.setUnlocalizedName(Names.Items.COPPER_DUST);
		tinDust.setUnlocalizedName(Names.Items.TIN_DUST);
		classicBronzeDust.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_DUST);
		mildBronzeDust.setUnlocalizedName(Names.Items.MILD_BRONZE_DUST);
		
		copperIngot.setElementInfo(SpecificInfo.copper);
		tinIngot.setElementInfo(SpecificInfo.tin);
		classicBronzeIngot.setElementInfo(SpecificInfo.classicBronze);
		mildBronzeIngot.setElementInfo(SpecificInfo.mildBronze);
		copperDust.setElementInfo(SpecificInfo.copper);
		tinDust.setElementInfo(SpecificInfo.tin);
		classicBronzeDust.setElementInfo(SpecificInfo.classicBronze);
		mildBronzeDust.setElementInfo(SpecificInfo.mildBronze);
		
		
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
