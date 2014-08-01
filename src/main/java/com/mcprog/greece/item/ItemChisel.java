package com.mcprog.greece.item;

import com.mcprog.greece.block.BlockLetter;
import com.mcprog.greece.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemChisel extends ItemDamagable{

	public ItemChisel(int maxDamage) {
		super(maxDamage);
		
	}
	
	@Override
	public boolean canItemEditBlocks () {
		return true;
	}
	
	@Override
	public boolean onItemUseFirst (ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float X, float Y, float Z) {
		Block block = world.getBlock(x, y, z);
		if(block == Blocks.stone || block instanceof BlockLetter){
			player.swingItem();
			world.setBlock(x, y, z, ModBlocks.letterBlockAlpha);
			BlockLetter lBlock = (BlockLetter) world.getBlock(x, y, z);
			lBlock.rotateBlock(world,player, x, y, z, ForgeDirection.getOrientation(side));
		stack.damageItem(1, player);
		}
		return false;
	}
	

}
