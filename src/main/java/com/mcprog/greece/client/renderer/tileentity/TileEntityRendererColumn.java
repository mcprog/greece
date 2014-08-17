package com.mcprog.greece.client.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import com.mcprog.greece.client.renderer.model.ModelColumn;
import com.mcprog.greece.client.renderer.model.ModelSpear;
import com.mcprog.greece.reference.Textures;
import com.mcprog.greece.tileentity.TileEntityColumn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

/**
 * 
 * @author mcprog
 *
 */
@SideOnly(Side.CLIENT)
public class TileEntityRendererColumn extends TileEntitySpecialRenderer {

	private ModelColumn model;
	
	public TileEntityRendererColumn (ModelColumn model) {
		this.model = model;
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTickTime) {
		if (tileEntity instanceof TileEntityColumn) {
			GL11.glPushMatrix();
			GL11.glTranslated(x + .5, y - .5, z + .5);
			
			bindTexture(Textures.Model.COLUMN);
			
			model.render(null, 0, 0, 0, 0, 0, 0.06256f);
			
			GL11.glPopMatrix();
		}
		
	}

}
