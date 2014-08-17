package com.mcprog.greece.utility;

import com.mcprog.greece.reference.Reference;
import com.mcprog.greece.reference.Textures;

import net.minecraft.util.ResourceLocation;


/**
 * 
 * @author mcprog
 *
 */
public class ResourceLocationHelper {
	
	public static ResourceLocation getResourceLocation (String path) {
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	}
	
	public static ResourceLocation getModelLocation (String path) {
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), Textures.Model.MODEL_DIR + path);
	}
}
