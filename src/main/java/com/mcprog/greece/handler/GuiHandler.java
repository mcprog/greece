package com.mcprog.greece.handler;

import com.mcprog.greece.client.gui.inventory.GuiGrindstone;
import com.mcprog.greece.inventory.ContainerGrindstone;
import com.mcprog.greece.tileentity.TileEntityGrindstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public GuiHandler () {
		
	}
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		switch (id) {
		case 0:
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityGrindstone) {
				return new ContainerGrindstone(player.inventory, (TileEntityGrindstone)te);
			}
			break;

		default:
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		switch (id) {
		case 0:
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityGrindstone) {
				return new GuiGrindstone(player.inventory, (TileEntityGrindstone)te);
			}
			break;

		default:
			break;
		}
		return null;
	}

}
