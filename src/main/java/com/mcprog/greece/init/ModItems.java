package com.mcprog.greece.init;

import com.mcprog.greece.item.ItemGreece;
import com.mcprog.greece.item.ItemObol;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemGreece obol = new ItemObol();
	
	public static void init () {
		GameRegistry.registerItem(obol, "obol");
	}
}
