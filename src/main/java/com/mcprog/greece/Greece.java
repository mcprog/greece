package com.mcprog.greece;

import net.minecraftforge.oredict.OreDictionary;

import com.mcprog.greece.handler.ConfigHandler;
import com.mcprog.greece.init.ModBlocks;
import com.mcprog.greece.init.ModItems;
import com.mcprog.greece.init.Recipes;
import com.mcprog.greece.proxy.IProxy;
import com.mcprog.greece.reference.Reference;
import com.mcprog.greece.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * @author mcprog
 *
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_PATH)
public class Greece {

	@Mod.Instance(Reference.MOD_ID)
	public static Greece instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_PATH, serverSide = Reference.SERVER_PROXY_PATH)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("PreInitialization Completed");
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event) {
		Recipes.init();
		
		LogHelper.info("Initialization Completed");
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event) {
//		for (String oreName: OreDictionary.getOreNames()) {
//			LogHelper.info(oreName);
//		}
		
		LogHelper.info("PostInitialization Completed");
	}
}
