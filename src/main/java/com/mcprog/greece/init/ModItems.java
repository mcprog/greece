package com.mcprog.greece.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.item.ItemChisel;
import com.mcprog.greece.item.ItemDamagable;
import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemKnife;
import com.mcprog.greece.item.ItemMetal;
import com.mcprog.greece.item.ItemCoin;
import com.mcprog.greece.item.ItemSpear;
import com.mcprog.greece.item.SwordGreece;
import com.mcprog.greece.item.info.SpecificInfo;
import com.mcprog.greece.material.Material;
import com.mcprog.greece.material.Materials;
import com.mcprog.greece.reference.Money;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 * @author ime990
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
	public static final ItemDamagable grindstone = new ItemDamagable(48);
	
	public static final ItemChisel chisel = new ItemChisel(100);
	
	public static final ItemMetal copperIngot = new ItemMetal(Materials.copper);
	public static final ItemMetal tinIngot = new ItemMetal(Materials.tin);
	public static final ItemMetal silverIngot = new ItemMetal(Materials.silver);
	public static final ItemMetal classicBronzeIngot = new ItemMetal(Materials.classicBronze);
	public static final ItemMetal mildBronzeIngot = new ItemMetal(Materials.mildBronze);
	public static final ItemMetal electrumIngot = new ItemMetal(Materials.electrum);
	
	public static final ItemMetal copperDust = new ItemMetal(Materials.copper);
	public static final ItemMetal tinDust = new ItemMetal(Materials.tin);
	public static final ItemMetal silverDust = new ItemMetal(Materials.silver);
	public static final ItemMetal goldDust = new ItemMetal(Materials.gold);
	public static final ItemMetal classicBronzeDust = new ItemMetal(Materials.classicBronze);
	public static final ItemMetal mildBronzeDust = new ItemMetal(Materials.mildBronze);
	public static final ItemMetal electrumDust = new ItemMetal(Materials.electrum);
	
	public static final ItemMetal tinyPileOfCopperDust = new ItemMetal(Materials.copper);
	public static final ItemMetal tinyPileOfTinDust = new ItemMetal(Materials.tin);
	public static final ItemMetal tinyPileOfSilverDust = new ItemMetal(Materials.silver);
	public static final ItemMetal tinyPileOfGoldDust = new ItemMetal(Materials.gold);
	public static final ItemMetal tinyPileOfClassicBronzeDust = new ItemMetal(Materials.classicBronze);
	public static final ItemMetal tinyPileOfMildBronzeDust = new ItemMetal(Materials.mildBronze);
	public static final ItemMetal tinyPileOfElectrumDust = new ItemMetal(Materials.electrum);
	
	public static final ItemGreece coalDust = new ItemGreece();
	
	public static final ItemMetal copperNugget = new ItemMetal(Materials.copper);
	public static final ItemMetal tinNugget = new ItemMetal(Materials.tin);
	public static final ItemMetal silverNugget = new ItemMetal(Materials.silver);
	public static final ItemMetal classicBronzeNugget = new ItemMetal(Materials.classicBronze);
	public static final ItemMetal mildBronzeNugget = new ItemMetal(Materials.mildBronze);
	public static final ItemMetal electrumNugget = new ItemMetal(Materials.electrum);
	
	public static final ItemSpear spear = new ItemSpear();
	public static final SwordGreece knife = new ItemKnife();
	
	/**
	 * init of items and registration
	 * naming
	 * oredict
	 * gameregistry
	 */
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
		
		chisel.setUnlocalizedName(Names.Items.CHISEL);
		
		copperIngot.setUnlocalizedName(Names.Items.COPPER_INGOT);
		tinIngot.setUnlocalizedName(Names.Items.TIN_INGOT);
		silverIngot.setUnlocalizedName(Names.Items.SILVER_INGOT);
		classicBronzeIngot.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_INGOT);
		mildBronzeIngot.setUnlocalizedName(Names.Items.MILD_BRONZE_INGOT);
		electrumIngot.setUnlocalizedName(Names.Items.ELECTRUM_INGOT);
		
		copperDust.setUnlocalizedName(Names.Items.COPPER_DUST);
		tinDust.setUnlocalizedName(Names.Items.TIN_DUST);
		silverDust.setUnlocalizedName(Names.Items.SILVER_DUST);
		goldDust.setUnlocalizedName(Names.Items.GOLD_DUST);
		classicBronzeDust.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_DUST);
		mildBronzeDust.setUnlocalizedName(Names.Items.MILD_BRONZE_DUST);
		electrumDust.setUnlocalizedName(Names.Items.ELECTRUM_DUST);
		
		tinyPileOfCopperDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_COPPER_DUST);
		tinyPileOfTinDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_TIN_DUST);
		tinyPileOfSilverDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_SILVER_DUST);
		tinyPileOfGoldDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_GOLD_DUST);
		tinyPileOfClassicBronzeDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_CLASSIC_BRONZE_DUST);
		tinyPileOfMildBronzeDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_MILD_BRONZE_DUST);
		tinyPileOfElectrumDust.setUnlocalizedName(Names.Items.TINY_PILE_OF_ELECTRUM_DUST);
		
		coalDust.setUnlocalizedName(Names.Items.COAL_DUST);
		
		copperNugget.setUnlocalizedName(Names.Items.COPPER_NUGGET);
		tinNugget.setUnlocalizedName(Names.Items.TIN_NUGGET);
		silverNugget.setUnlocalizedName(Names.Items.SILVER_NUGGET);
		classicBronzeNugget.setUnlocalizedName(Names.Items.CLASSIC_BRONZE_NUGGET);
		mildBronzeNugget.setUnlocalizedName(Names.Items.MILD_BRONZE_NUGGET);
		electrumNugget.setUnlocalizedName(Names.Items.ELECTRUM_NUGGET);
		
		spear.setUnlocalizedName(Names.Items.SPEAR);
		knife.setUnlocalizedName(Names.Items.KNIFE);
		
		silverObol.setDenomination(Money.SILVER_OBOL, Money.Comparison.SILVER_OBOL);
		silverDrachma.setDenomination(Money.SILVER_DRACHMA, Money.Comparison.SILVER_DRACHMA);
		silverStater.setDenomination(Money.SILVER_STATER, Money.Comparison.SILVER_STATER);
		electrumObol.setDenomination(Money.ELECTRUM_OBOL, Money.Comparison.ELECTRUM_OBOL);
		electrumDrachma.setDenomination(Money.ELECTRUM_DRACHMA, Money.Comparison.ELECTRUM_DRACHMA);
		electrumStater.setDenomination(Money.ELECTRUM_STATER, Money.Comparison.ELECTRUM_STATER);
		
		
		
		GameRegistry.registerItem(silverObol, Names.Items.SILVER_OBOL);
		GameRegistry.registerItem(silverDrachma, Names.Items.SILVER_DRACHMA);
		GameRegistry.registerItem(silverStater, Names.Items.SILVER_STATER);
		GameRegistry.registerItem(electrumObol, Names.Items.ELECTRUM_OBOL);
		GameRegistry.registerItem(electrumDrachma, Names.Items.ELECTRUM_DRACHMA);
		GameRegistry.registerItem(electrumStater, Names.Items.ELECTRUM_STATER);
		GameRegistry.registerItem(stoneBase, Names.Items.STONE_BASE);
		GameRegistry.registerItem(grindWheel, Names.Items.GRIND_WHEEL);
		GameRegistry.registerItem(grindstone, Names.Items.GRINDSTONE);
		GameRegistry.registerItem(chisel, Names.Items.CHISEL);
		GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
		GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);
		GameRegistry.registerItem(silverIngot, Names.Items.SILVER_INGOT);
		GameRegistry.registerItem(classicBronzeIngot, Names.Items.CLASSIC_BRONZE_INGOT);
		GameRegistry.registerItem(mildBronzeIngot, Names.Items.MILD_BRONZE_INGOT);
		GameRegistry.registerItem(electrumIngot, Names.Items.ELECTRUM_INGOT);
		GameRegistry.registerItem(copperDust, Names.Items.COPPER_DUST);
		GameRegistry.registerItem(tinDust, Names.Items.TIN_DUST);
		GameRegistry.registerItem(silverDust, Names.Items.SILVER_DUST);
		GameRegistry.registerItem(goldDust, Names.Items.GOLD_DUST);
		GameRegistry.registerItem(classicBronzeDust, Names.Items.CLASSIC_BRONZE_DUST);
		GameRegistry.registerItem(mildBronzeDust, Names.Items.MILD_BRONZE_DUST);
		GameRegistry.registerItem(electrumDust, Names.Items.ELECTRUM_DUST);
		GameRegistry.registerItem(tinyPileOfCopperDust, Names.Items.TINY_PILE_OF_COPPER_DUST);
		GameRegistry.registerItem(tinyPileOfTinDust, Names.Items.TINY_PILE_OF_TIN_DUST);
		GameRegistry.registerItem(tinyPileOfSilverDust, Names.Items.TINY_PILE_OF_SILVER_DUST);
		GameRegistry.registerItem(tinyPileOfGoldDust, Names.Items.TINY_PILE_OF_GOLD_DUST);
		GameRegistry.registerItem(tinyPileOfClassicBronzeDust, Names.Items.TINY_PILE_OF_CLASSIC_BRONZE_DUST);
		GameRegistry.registerItem(tinyPileOfMildBronzeDust, Names.Items.TINY_PILE_OF_MILD_BRONZE_DUST);
		GameRegistry.registerItem(tinyPileOfElectrumDust, Names.Items.TINY_PILE_OF_ELECTRUM_DUST);
		GameRegistry.registerItem(copperNugget, Names.Items.COPPER_NUGGET);
		GameRegistry.registerItem(tinNugget, Names.Items.TIN_NUGGET);
		GameRegistry.registerItem(silverNugget, Names.Items.SILVER_NUGGET);
		GameRegistry.registerItem(classicBronzeNugget, Names.Items.CLASSIC_BRONZE_NUGGET);
		GameRegistry.registerItem(mildBronzeNugget, Names.Items.MILD_BRONZE_NUGGET);
		GameRegistry.registerItem(electrumNugget, Names.Items.ELECTRUM_NUGGET);
		GameRegistry.registerItem(coalDust, Names.Items.COAL_DUST);
		GameRegistry.registerItem(spear, Names.Items.SPEAR);
		GameRegistry.registerItem(knife, Names.Items.KNIFE);
	}
	
	public static void oreDictionary () {
		OreDictionary.registerOre(Names.OreDictionary.INGOT_COPPER, copperIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_TIN, tinIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_SILVER, silverIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_BRONZE_CLASSIC, classicBronzeIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_BRONZE_MILD, mildBronzeIngot);
		OreDictionary.registerOre(Names.OreDictionary.INGOT_ELECTRUM, electrumIngot);
		OreDictionary.registerOre(Names.OreDictionary.DUST_COPPER, copperDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_TIN, tinDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_SILVER, silverDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_GOLD, goldDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_BRONZE_CLASSIC, classicBronzeDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_BRONZE_MILD, mildBronzeDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_ELECTRUM, electrumDust);
		OreDictionary.registerOre(Names.OreDictionary.DUST_COAL, coalDust);
		OreDictionary.registerOre(Names.OreDictionary.NUGGET_COPPER, copperNugget);
		OreDictionary.registerOre(Names.OreDictionary.NUGGET_TIN, tinNugget);
		OreDictionary.registerOre(Names.OreDictionary.NUGGET_SILVER, silverNugget);
		OreDictionary.registerOre(Names.OreDictionary.NUGGET_ELECTRUM, electrumNugget);
	}
}
