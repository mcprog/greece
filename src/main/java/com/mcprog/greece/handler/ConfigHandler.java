package com.mcprog.greece.handler;

import java.io.File;

import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;


public class ConfigHandler {
	
	public static Configuration config;
	public static boolean isMCProgCool;

	public static void init (File configFile) {
		if (config == null) {
			config = new Configuration(configFile);
			loadConfig();
		}
		
		
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfig();
		}
	}
	
	private static void loadConfig () {
			
		//read in properties
		isMCProgCool = config.get("important", "isMCProgCool", true, "This is an awesome configuration").getBoolean(true);
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}
