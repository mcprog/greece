package com.mcprog.greece.init;

import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemObol;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemGreece obol = new ItemObol();
	
	public static void init () {
		GameRegistry.registerItem(obol, Names.Items.OBOL);
	}
}
