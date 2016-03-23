package com.mcprog.greece.block;

import com.mcprog.greece.creativetab.CreativeTabGreece;
import com.mcprog.greece.reference.Textures;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 
 * @author mcprog
 *
 */
public class BlockDust extends BlockFalling {
	
	private MapColor mapColor;
	
	public BlockDust (MapColor color) {
		setCreativeTab(CreativeTabGreece.GREECE_TAB);
		setHardness(0.6F);
		setStepSound(soundTypeSand);
		mapColor = color;
	}
	
	public BlockDust () {
		this(MapColor.sandColor);
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
	
	@Override
	public MapColor getMapColor (int p_149728_1_) {
        return mapColor;
    }
	
}
