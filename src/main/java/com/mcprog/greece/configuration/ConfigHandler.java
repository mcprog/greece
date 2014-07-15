package com.mcprog.greece.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static void init (File configFile) {
		Configuration config = new Configuration(configFile);
		
		try {
			config.load();
			
			//read in properties
			boolean isMCProgCool = config.get("Important", "isMCProgCool", true, "This is an awesome configuration").getBoolean(true);
			
		} catch (Exception e) {
			//TODO log exection
		} finally {
			config.save();
		}
	}
}
