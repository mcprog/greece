package com.mcprog.greece.init;

import com.mcprog.greece.reference.Names;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * 
 * @author mcprog
 * for custom weapons
 *
 */
public class ToolMaterials {
	
	public static ToolMaterial classicBronzeMaterial = EnumHelper.addToolMaterial(
			Names.Material.CLASSIC_BRONZE_MATERIAL, 
			3, //harvest (diamond)
			1000, //durability (iron, diamond) (<--math notation) 
			6.5F, //effieciency (iron, diamond)
			2.5F, //damage vs entity
			12);
	
	
}
