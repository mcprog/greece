package com.mcprog.greece;

import com.mcprog.greece.configuration.ConfigHandler;
import com.mcprog.greece.proxy.IProxy;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Greece {

	@Mod.Instance(Reference.MOD_ID)
	public static Greece instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_PATH, serverSide = Reference.SERVER_PROXY_PATH)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit (FMLPreInitializationEvent event) {
//		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
}
