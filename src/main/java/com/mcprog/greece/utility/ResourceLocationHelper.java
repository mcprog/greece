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
	
	/**
	 * Makes new resource location from the default path
	 * @param path from default path
	 * @return the resource location object
	 */
	public static ResourceLocation getResourceLocation (String path) {
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	}
	
	/**
	 * Makes new resource location from the "/textures/models/" path
	 * @param path from model path
	 * @return the resource location object
	 */
	public static ResourceLocation getModelLocation (String path) {
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), Textures.Model.MODEL_DIR + path);
	}
}
