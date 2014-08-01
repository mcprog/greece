package com.mcprog.greece.init;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemGrindstone;
import com.mcprog.greece.item.ItemKnife;
import com.mcprog.greece.item.ItemMetal;
import com.mcprog.greece.item.ItemCoin;
import com.mcprog.greece.item.ItemSpear;
import com.mcprog.greece.item.SwordGreece;
import com.mcprog.greece.item.info.SpecificInfo;
import com.mcprog.greece.reference.Money;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 *
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemCoin silverObol = new ItemCoin();
	public static final ItemCoin silverDrachma = new ItemCoin();
	public static final ItemCoin silverStater = new ItemCoin();
	
	public static final ItemCoin electrumObol = new ItemCoin();
	public static final ItemCoin electrumDrachma = new ItemCoin();
	public static final ItemCoin electrumStater = new ItemCoin();
	
	public static final ItemGreece stoneBase = new ItemGreece();
	public static final ItemGreece grindWheel = new ItemGreece();
	public static final ItemGrindstone grindstone = new ItemGrindstone();
	
	public static final ItemMetal copperIngot = new ItemMetal();
	public static final ItemMetal tinIngot = new ItemMetal();
	public static final ItemMetal classicBronzeIngot = new ItemMetal();
	public static final ItemMetal mildBronzeIngot = new ItemMetal();
	public static final ItemMetal copperDust = new ItemMetal();
	public static final ItemMetal tinDust = new ItemMetal();
	public static final ItemMetal classicBronzeDust = new ItemMetal();
	public static final ItemMetal mildBronzeDust = new ItemMetal();
	public static final ItemGreece coalDust = new ItemGreece();
	
	public static final ItemSpear spear = new ItemSpear();
	public static final SwordGreece knife = new ItemKnife();
	
	public static void init () {
		silverObol.setUnlocalizedName(Names.Items.SILVER_OBOL);
		silverDrachma.setUnlocalizedName(Names.Items.SILVER_DRACHMA);
		silverStater.setUnlocalizedName(Names.Items.SILVER_STATER);
		electrumObol.setUnlocalizedName(Names.Items.ELECTRUM_OBOL);
		electrumDrachma.setUnlocalizedName(Names.Items.ELECTRUM_DRACHMA);
		electrumStater.setUnlocalizedName(Names.Items.ELECTRUM_STATER);
		
		stoneBase.setUnlocalizedName(Names.Items.STONE_BASE);
		grindWheel.setUnlocalizedName(Names.Items.GRIND_WHEEL);
		grindstone.setUnlocalizedName(Names.Items.GRINDSTONE);
		
		copperIngot.setUnlocalizedName(Names.Items.COPPER_INGOT);
		tinIngot.setUnlocalizedName(Names.Items.TIN_INGOT);
		classicBronzeIngot.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_INGOT);
		mildBronzeIngot.setUnlocalizedName(Names.Items.MILD_BRONZE_INGOT);
		copperDust.setUnlocalizedName(Names.Items.COPPER_DUST);
		tinDust.setUnlocalizedName(Names.Items.TIN_DUST);
		classicBronzeDust.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_DUST);
		mildBronzeDust.setUnlocalizedName(Names.Items.MILD_BRONZE_DUST);
		coalDust.setUnlocalizedName(Names.Items.COAL_DUST);
		
		spear.setUnlocalizedName(Names.Items.SPEAR);
		knife.setUnlocalizedName(Names.Items.KNIFE);
		
		silverObol.setDenomination(Money.SILVER_OBOL, Money.Comparison.SILVER_OBOL);
		silverDrachma.setDenomination(Money.SILVER_DRACHMA, Money.Comparison.SILVER_DRACHMA);
		silverStater.setDenomination(Money.SILVER_STATER, Money.Comparison.SILVER_STATER);
		electrumObol.setDenomination(Money.ELECTRUM_OBOL, Money.Comparison.ELECTRUM_OBOL);
		electrumDrachma.setDenomination(Money.ELECTRUM_DRACHMA, Money.Comparison.ELECTRUM_DRACHMA);
		electrumStater.setDenomination(Money.ELECTRUM_STATER, Money.Comparison.ELECTRUM_STATER);
		
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
		OreDictionary.registerOre(Names.OreDictionary.DUST_COAL, coalDust);
		
		GameRegistry.registerItem(silverObol, Names.Items.SILVER_OBOL);
		GameRegistry.registerItem(silverDrachma, Names.Items.SILVER_DRACHMA);
		GameRegistry.registerItem(silverStater, Names.Items.SILVER_STATER);
		GameRegistry.registerItem(electrumObol, Names.Items.ELECTRUM_OBOL);
		GameRegistry.registerItem(electrumDrachma, Names.Items.ELECTRUM_DRACHMA);
		GameRegistry.registerItem(electrumStater, Names.Items.ELECTRUM_STATER);
		GameRegistry.registerItem(stoneBase, Names.Items.STONE_BASE);
		GameRegistry.registerItem(grindWheel, Names.Items.GRIND_WHEEL);
		GameRegistry.registerItem(grindstone, Names.Items.GRINDSTONE);
		GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
		GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);
		GameRegistry.registerItem(classicBronzeIngot, Names.Items.CLASSIC_BRONZE_INGOT);
		GameRegistry.registerItem(mildBronzeIngot, Names.Items.MILD_BRONZE_INGOT);
		GameRegistry.registerItem(copperDust, Names.Items.COPPER_DUST);
		GameRegistry.registerItem(tinDust, Names.Items.TIN_DUST);
		GameRegistry.registerItem(classicBronzeDust, Names.Items.CLASSIC_BRONZE_DUST);
		GameRegistry.registerItem(mildBronzeDust, Names.Items.MILD_BRONZE_DUST);
		GameRegistry.registerItem(coalDust, Names.Items.COAL_DUST);
		GameRegistry.registerItem(spear, Names.Items.SPEAR);
		GameRegistry.registerItem(knife, Names.Items.KNIFE);
	}
}
