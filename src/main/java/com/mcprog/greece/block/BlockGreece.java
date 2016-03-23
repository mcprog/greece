package com.mcprog.greece.block;

import com.mcprog.greece.creativetab.CreativeTabGreece;
import com.mcprog.greece.reference.Textures;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 
 * @author mcprog
 *
 */
public class BlockGreece extends Block {

	public BlockGreece (Material material) {
		super(material);
		setCreativeTab(CreativeTabGreece.GREECE_TAB);
		
	}
	
	public BlockGreece () {
		this(Material.rock);// defaults to rock material
		setHardness(1.5F);
		setResistance(10.0F);
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
