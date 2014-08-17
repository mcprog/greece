package com.mcprog.greece.client.renderer.item;

import org.lwjgl.opengl.GL11;

import com.mcprog.greece.client.renderer.model.ModelColumn;
import com.mcprog.greece.reference.Textures;
import com.mcprog.greece.utility.ResourceLocationHelper;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelDragon;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

/**
 * 
 * @author mcprog
 *
 */
public class ItemRendererColumn implements IItemRenderer {

	private ModelColumn model;
	
	public ItemRendererColumn (ModelColumn model) {
		this.model = model;
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		switch (type) {
		case INVENTORY:
			GL11.glTranslatef(0, -1f, 0);
			break;
		case ENTITY:
			GL11.glTranslatef(0, -1, 0);		
			break;
		case EQUIPPED_FIRST_PERSON:
			GL11.glTranslatef(.5f, -.5f, .5f);
			break;
		case EQUIPPED:
			GL11.glTranslatef(0, -1f, 1);
			GL11.glScalef(2, 2, 2);
			break;
		default:
			break;
		}
		
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.Model.COLUMN);
		model.render(null, 0, 0, 0, 0, 0, .0625f);
		
		GL11.glPopMatrix();
	}

}
