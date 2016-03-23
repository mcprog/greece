package com.mcprog.greece.client.gui.inventory;

import org.lwjgl.opengl.GL11;

import com.mcprog.greece.inventory.ContainerGrindstone;
import com.mcprog.greece.tileentity.TileEntityGrindstone;
import com.mcprog.greece.utility.ResourceLocationHelper;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiGrindstone extends GuiContainer {

	public GuiGrindstone(InventoryPlayer invPlayer, TileEntityGrindstone te) {
		super(new ContainerGrindstone(invPlayer, te));
		
		xSize = 176;
		ySize = 166;
	}
	
	private static ResourceLocation texture = ResourceLocationHelper.getGuiLocation("grindstone.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_,
			int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1, 1, 1, 1);
		
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}
