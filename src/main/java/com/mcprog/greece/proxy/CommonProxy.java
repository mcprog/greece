package com.mcprog.greece.proxy;

import com.mcprog.greece.Greece;
import com.mcprog.greece.entity.EntitySpear;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.tileentity.TileEntityColumn;
import com.mcprog.greece.tileentity.TileEntityGrindstone;
import com.mcprog.greece.utility.LogHelper;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 *
 */
public abstract class CommonProxy implements IProxy {
	
	@Override
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityColumn.class, Names.Blocks.COLUMN);
		GameRegistry.registerTileEntity(TileEntityGrindstone.class, Names.Blocks.GRINDSTONE);
	}
	
	@Override
	public void initRenderingAndTextures() {
		
	}
}
