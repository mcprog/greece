package com.mcprog.greece.proxy;

import net.minecraft.client.renderer.EntityRenderer;

import com.mcprog.greece.entity.EntitySpear;
import com.mcprog.greece.renderer.RenderSpear;
import com.mcprog.greece.utility.LogHelper;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * 
 * @author mcprog
 *
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void registerTileEntities() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initRenderingAndTextures() {
		System.err.println("Registering renderers in ClientProxy");
		RenderingRegistry.registerEntityRenderingHandler(EntitySpear.class, new RenderSpear());
		
	}

	@Override
	public void registerEventHandlers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerKeybindings() {
		// TODO Auto-generated method stub
		
	}

}
