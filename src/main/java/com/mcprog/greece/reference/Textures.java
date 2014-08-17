package com.mcprog.greece.reference;

import com.mcprog.greece.utility.ResourceLocationHelper;

import net.minecraft.util.ResourceLocation;

/**
 * 
 * @author mcprog
 *
 */
public final class Textures {
	
	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":"; 
	
	public static final class Model {
		public static final String MODEL_DIR = "textures/models/";
		public static final ResourceLocation SPEAR = ResourceLocationHelper.getModelLocation("spear.png");
		public static final ResourceLocation COLUMN = ResourceLocationHelper.getModelLocation("column.png");
	}
}
