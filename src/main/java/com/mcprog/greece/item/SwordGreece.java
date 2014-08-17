package com.mcprog.greece.item;

import com.mcprog.greece.creativetab.CreativeTabGreece;
import com.mcprog.greece.init.ToolMaterials;
import com.mcprog.greece.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * 
 * @author mcprog
 *
 */
public class SwordGreece extends ItemSword {

	public SwordGreece (ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabGreece.GREECE_TAB);
	}
	
	public SwordGreece() {
		this(ToolMaterials.classicBronzeMaterial);
	}
	
	@Override
	public String getUnlocalizedName () {
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName (ItemStack itemStack) {
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons (IIconRegister iconRegister) {
		itemIcon = 
				iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName (String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
