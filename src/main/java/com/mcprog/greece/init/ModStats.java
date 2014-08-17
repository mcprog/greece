package com.mcprog.greece.init;

import com.mcprog.greece.event.GreeceEvent;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;

/**
 * 
 * @author mcprog
 * achivement code
 *
 */
public class ModStats {
	public static final Achievement oldOreMiner = 
			new Achievement("achievement.oldOreMiner", "oldOreMiner", 0, 0, ModBlocks.copperOre, (Achievement) null);
	public static final AchievementPage GREECE_PAGE = new AchievementPage(Reference.MOD_NAME, oldOreMiner);
	
	public static void init () {
		oldOreMiner.registerStat();
		FMLCommonHandler.instance().bus().register(new GreeceEvent());
		MinecraftForge.EVENT_BUS.register(new GreeceEvent());
	}
}
