// Date: 8/14/2014 5:18:59 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.mcprog.greece.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

/**
 * 
 * @author mcprog
 *
 */
public class ModelSpear extends ModelBase
{
  //fields
    ModelRenderer shaft;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer fin1;
    ModelRenderer fin2;
    ModelRenderer fin3;
    ModelRenderer fin4;
  
  public ModelSpear()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      shaft = new ModelRenderer(this, 0, 0);
      shaft.addBox(0F, 0F, 0F, 1, 32, 1);
      shaft.setRotationPoint(0F, -7F, 0F);
      shaft.setTextureSize(64, 32);
      shaft.mirror = true;
      setRotation(shaft, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 0, 0);
      head1.addBox(0F, 0F, 0F, 1, 5, 1);
      head1.setRotationPoint(1F, -5F, 0F);
      head1.setTextureSize(64, 32);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(0F, 0F, 0F, 1, 5, 1);
      head2.setRotationPoint(-1F, -5F, 0F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      head3 = new ModelRenderer(this, 0, 0);
      head3.addBox(0F, 0F, 0F, 1, 5, 1);
      head3.setRotationPoint(0F, -5F, -1F);
      head3.setTextureSize(64, 32);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head4 = new ModelRenderer(this, 0, 0);
      head4.addBox(0F, 0F, 0F, 1, 5, 1);
      head4.setRotationPoint(0F, -5F, 1F);
      head4.setTextureSize(64, 32);
      head4.mirror = true;
      setRotation(head4, 0F, 0F, 0F);
      fin1 = new ModelRenderer(this, 0, 0);
      fin1.addBox(0F, 0F, 2F, 1, 2, 1);
      fin1.setRotationPoint(0F, -1F, 0F);
      fin1.setTextureSize(64, 32);
      fin1.mirror = true;
      setRotation(fin1, 0F, 0F, 0F);
      fin2 = new ModelRenderer(this, 0, 0);
      fin2.addBox(0F, 0F, 2F, 1, 2, 1);
      fin2.setRotationPoint(0F, -1F, -4F);
      fin2.setTextureSize(64, 32);
      fin2.mirror = true;
      setRotation(fin2, 0F, 0F, 0F);
      fin3 = new ModelRenderer(this, 0, 0);
      fin3.addBox(0F, 0F, 2F, 1, 2, 1);
      fin3.setRotationPoint(-2F, -1F, -2F);
      fin3.setTextureSize(64, 32);
      fin3.mirror = true;
      setRotation(fin3, 0F, 0F, 0F);
      fin4 = new ModelRenderer(this, 0, 0);
      fin4.addBox(0F, 0F, 2F, 1, 2, 1);
      fin4.setRotationPoint(2F, -1F, -2F);
      fin4.setTextureSize(64, 32);
      fin4.mirror = true;
      setRotation(fin4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    shaft.render(f5);
    head1.render(f5);
    head2.render(f5);
    head3.render(f5);
    head4.render(f5);
    fin1.render(f5);
    fin2.render(f5);
    fin3.render(f5);
    fin4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}