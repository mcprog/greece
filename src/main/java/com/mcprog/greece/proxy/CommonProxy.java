package com.mcprog.greece.proxy;

import com.mcprog.greece.Greece;
import com.mcprog.greece.entity.EntitySpear;
import com.mcprog.greece.utility.LogHelper;

import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * 
 * @author mcprog
 *
 */
public abstract class CommonProxy implements IProxy {
	@Override
	public void initRenderingAndTextures() {
//		LogHelper.info("Registering entities");
//		EntityRegistry.registerModEntity(EntitySpear.class, "entitySpear", 0, Greece.instance, 128, 5, true);
		
	}
}
