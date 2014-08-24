package com.mcprog.greece.init;

import com.mcprog.greece.worldgen.OreGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGeneration {

	public static void init () {
		GameRegistry.registerWorldGenerator(new OreGen(), 0);//move this
	}
}
