package com.mcprog.greece.block;

import com.mcprog.greece.creativetab.CreativeTabGreece;
import com.mcprog.greece.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * 
 * @author mcprog
 *
 */
public class BlockLetter extends BlockDirectional{

	@SideOnly(Side.CLIENT)
	private IIcon face;
	
	public BlockLetter() {
		super(Material.rock);
		setCreativeTab(CreativeTabGreece.GREECE_TAB);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? Blocks.stone.getIcon(side, meta) : (side == 0 ? Blocks.stone.getIcon(side, meta): (meta == 2 && side == 2 ? this.blockIcon : (meta == 3 && side == 5 ? this.blockIcon : (meta == 0 && side == 3 ? this.blockIcon : (meta == 1 && side == 4 ? this.face: Blocks.stone.getIcon(side, meta))))));
    }
	
	public void onBlockPlacedBy (World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
        int l = MathHelper.floor_double((double)(p_149689_5_.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
    }
	
	@Override
	public String getUnlocalizedName () {
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

	
}
