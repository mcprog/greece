package com.mcprog.greece.block;

import com.mcprog.greece.creativetab.CreativeTabGreece;
import com.mcprog.greece.reference.Textures;

import net.minecraft.block.BlockOre;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 
 * @author ime990
 *
 */

public class OreGreece extends BlockOre{
	
	public OreGreece() {
		setCreativeTab(CreativeTabGreece.GREECE_TAB);
	}
	
	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
