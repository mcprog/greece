package com.mcprog.greece.item;

import com.mcprog.greece.block.BlockLetter;
import com.mcprog.greece.handler.NameHandler;
import com.mcprog.greece.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * 
 * @author mcprog
 *
 */
public class ItemChisel extends ItemDamagable{// class may have corrupt logic

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
			if (player.isSneaking()) {
				if (block == Blocks.stone) {
					world.setBlock(x, y, z, ModBlocks.letterBlocks.get(0));// change to block alpha
				} else {
					previousLetter(block, world, x, y, z);
				}
			} else {
				if (block == Blocks.stone) {
					world.setBlock(x, y, z, ModBlocks.letterBlocks.get(0));// wrong?
				} else {
					nextLetter(block, world, x, y, z);
				}
			}
			BlockLetter lBlock = (BlockLetter) world.getBlock(x, y, z);
			lBlock.rotateBlock(world,player, x, y, z, ForgeDirection.getOrientation(side));
			stack.damageItem(1, player);
		}
		return false;
	}
	
	protected void nextLetter (Block block, World world, int x, int y, int z) {
		if (block == ModBlocks.letterBlocks.get(NameHandler.length())) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(0));
		}
		else if (block == ModBlocks.letterBlocks.get(0)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(1));
		}
		else if (block == ModBlocks.letterBlocks.get(1)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(2));
		}
		else if (block == ModBlocks.letterBlocks.get(2)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(3));
		}
		else if (block == ModBlocks.letterBlocks.get(3)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(4));
		}
		else if (block == ModBlocks.letterBlocks.get(4)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(5));
		}
		else if (block == ModBlocks.letterBlocks.get(5)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(6));
		}
		else if (block == ModBlocks.letterBlocks.get(6)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(7));
		}
		else if (block == ModBlocks.letterBlocks.get(7)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(8));
		}
		else if (block == ModBlocks.letterBlocks.get(8)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(9));
		}
		else if (block == ModBlocks.letterBlocks.get(9)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(10));
		}
		else if (block == ModBlocks.letterBlocks.get(10)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(11));
		}
		else if (block == ModBlocks.letterBlocks.get(11)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(12));
		}
		else if (block == ModBlocks.letterBlocks.get(12)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(13));
		}
		else if (block == ModBlocks.letterBlocks.get(13)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(14));
		}
		else if (block == ModBlocks.letterBlocks.get(14)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(15));
		}
		else if (block == ModBlocks.letterBlocks.get(15)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(16));
		}
		else if (block == ModBlocks.letterBlocks.get(16)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(17));
		}
		else if (block == ModBlocks.letterBlocks.get(17)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(18));
		}
		else if (block == ModBlocks.letterBlocks.get(18)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(19));
		}
		else if (block == ModBlocks.letterBlocks.get(19)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(20));
		}
		else if (block == ModBlocks.letterBlocks.get(20)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(21));
		} else {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(NameHandler.length()));
		}
	}
	
	protected void previousLetter (Block block, World world, int x, int y, int z) {
		if (block == ModBlocks.letterBlocks.get(NameHandler.length())) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(21));
		}
		else if (block == ModBlocks.letterBlocks.get(21)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(20));
		}
		else if (block == ModBlocks.letterBlocks.get(20)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(19));
		}
		else if (block == ModBlocks.letterBlocks.get(19)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(18));
		}
		else if (block == ModBlocks.letterBlocks.get(18)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(17));
		}
		else if (block == ModBlocks.letterBlocks.get(17)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(16));
		}
		else if (block == ModBlocks.letterBlocks.get(16)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(15));
		}
		else if (block == ModBlocks.letterBlocks.get(15)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(14));
		}
		else if (block == ModBlocks.letterBlocks.get(14)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(13));
		}
		else if (block == ModBlocks.letterBlocks.get(13)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(12));
		}
		else if (block == ModBlocks.letterBlocks.get(12)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(11));
		}
		else if (block == ModBlocks.letterBlocks.get(11)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(10));
		}
		else if (block == ModBlocks.letterBlocks.get(10)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(9));
		}
		else if (block == ModBlocks.letterBlocks.get(9)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(8));
		}
		else if (block == ModBlocks.letterBlocks.get(8)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(7));
		}
		else if (block == ModBlocks.letterBlocks.get(7)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(6));
		}
		else if (block == ModBlocks.letterBlocks.get(6)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(5));
		}
		else if (block == ModBlocks.letterBlocks.get(5)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(4));
		}
		else if (block == ModBlocks.letterBlocks.get(4)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(3));
		}
		else if (block == ModBlocks.letterBlocks.get(3)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(2));
		}
		else if (block == ModBlocks.letterBlocks.get(2)) {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(1));
		} else {
			world.setBlock(x, y, z, ModBlocks.letterBlocks.get(0));
		}
	}
	

}
