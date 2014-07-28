package com.mcprog.greece.client.gui;

import java.util.List;

import com.mcprog.greece.handler.ConfigHandler;
import com.mcprog.greece.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

/**
 * 
 * @author mcprog
 *
 */
public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen, 
				new ConfigElement(ConfigHandler.config.getCategory("important")).getChildElements(), 
				Reference.MOD_ID, 
				false,
				false, 
				"Greece Mod Config (" + GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()) + ")");
	}

}
