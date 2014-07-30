package com.mcprog.greece.init;

import com.mcprog.greece.reference.Names;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
	
	public static ToolMaterial classicBronzeMaterial = EnumHelper.addToolMaterial(
			Names.Material.CLASSIC_BRONZE_MATERIAL, 
			3, //harvest (diamond)
			0, 
			0, 
			0, 
			0);
	
	
}