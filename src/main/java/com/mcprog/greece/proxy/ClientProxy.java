package com.mcprog.greece.proxy;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.mcprog.greece.client.renderer.RenderSpear;
import com.mcprog.greece.client.renderer.item.ItemRendererColumn;
import com.mcprog.greece.client.renderer.model.ModelColumn;
import com.mcprog.greece.client.renderer.tileentity.TileEntityRendererColumn;
import com.mcprog.greece.entity.EntitySpear;
import com.mcprog.greece.init.ModBlocks;
import com.mcprog.greece.reference.RenderIds;
import com.mcprog.greece.tileentity.TileEntityColumn;
import com.mcprog.greece.utility.LogHelper;

import cpw.mods.fml.client.registry.ClientRegistry;
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
		RenderIds.column = RenderingRegistry.getNextAvailableRenderId();
		
		System.err.println("Registering renderers in ClientProxy");
		RenderingRegistry.registerEntityRenderingHandler(EntitySpear.class, new RenderSpear());

		ModelColumn modelColumn = new ModelColumn();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityColumn.class, new TileEntityRendererColumn(modelColumn));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.column), new ItemRendererColumn(modelColumn));
		
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
