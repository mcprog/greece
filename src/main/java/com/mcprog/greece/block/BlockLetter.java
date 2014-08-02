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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

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
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
		return side == 1 ? Blocks.stone.getIcon(side, meta) : (side == 0 ? Blocks.stone.getIcon(side, meta) : (meta == 2 && side == 2 ? this.blockIcon : (meta == 3 && side == 5 ? this.blockIcon : (meta == 0 && side == 3 ? this.blockIcon : (meta == 1 && side == 4 ? this.blockIcon : Blocks.stone.getIcon(side, meta))))));
    }
	
	@Override
	public void onBlockPlacedBy (World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }
	
	public boolean rotateBlock (World world, EntityPlayer player, int x, int y, int z, ForgeDirection side) {
		onBlockPlacedBy(world, x, y, z, player, player.getCurrentEquippedItem());
		return true;
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
