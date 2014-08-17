package com.mcprog.greece.client.renderer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.mcprog.greece.client.renderer.model.ModelSpear;
import com.mcprog.greece.entity.EntitySpear;
import com.mcprog.greece.reference.Reference;
import com.mcprog.greece.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

/**
 * 
 * @author mcprog
 *
 */
public class RenderSpear extends Render {


	private ModelSpear model;
	
	public RenderSpear () {
		model = new ModelSpear();
		shadowSize = 0;
	}
	
	public void doRender(EntitySpear entity, double x, double y, double z, float yaw, float partialTickTime) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTickTime - 90f, 0, 1, 0);
		GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTickTime, 0, 0, 1);
		GL11.glScalef(-1f, -1f, -1f);
		
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		float f11 = (float) entity.arrowShake - partialTickTime;

        if (f11 > 0.0F)
        {
            float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
            GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
        }

        GL11.glRotatef(180.0F, 180.0F, 180.0F, 0.0F);
		
		bindEntityTexture(entity);
		model.render(entity, 0, 0, 0, 0, 0, 0.05625F);
		
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return Textures.Model.SPEAR;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
		this.doRender((EntitySpear)entity, x, y, z, yaw, partialTickTime);
	}

    
}
