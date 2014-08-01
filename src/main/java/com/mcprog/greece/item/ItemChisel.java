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
			if (player.isSneaking()) {
				if (block == Blocks.stone) {
					world.setBlock(x, y, z, ModBlocks.letterBlockOmega);
				} else {
					previousLetter(block, world, x, y, z);
				}
			} else {
				if (block == Blocks.stone) {
					world.setBlock(x, y, z, ModBlocks.letterBlockAlpha);
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
		if (block == ModBlocks.letterBlockAlpha) {
			world.setBlock(x, y, z, ModBlocks.letterBlockBeta);
		}
		else if (block == ModBlocks.letterBlockBeta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockGamma);
		}
		else if (block == ModBlocks.letterBlockGamma) {
			world.setBlock(x, y, z, ModBlocks.letterBlockDelta);
		}
		else if (block == ModBlocks.letterBlockDelta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockEpsilon);
		}
		else if (block == ModBlocks.letterBlockEpsilon) {
			world.setBlock(x, y, z, ModBlocks.letterBlockZeta);
		}
		else if (block == ModBlocks.letterBlockZeta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockEta);
		}
		else if (block == ModBlocks.letterBlockEta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockTheta);
		}
		else if (block == ModBlocks.letterBlockTheta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockIota);
		}
		else if (block == ModBlocks.letterBlockIota) {
			world.setBlock(x, y, z, ModBlocks.letterBlockKappa);
		}
		else if (block == ModBlocks.letterBlockKappa) {
			world.setBlock(x, y, z, ModBlocks.letterBlockLambda);
		}
		else if (block == ModBlocks.letterBlockLambda) {
			world.setBlock(x, y, z, ModBlocks.letterBlockMu);
		}
		else if (block == ModBlocks.letterBlockMu) {
			world.setBlock(x, y, z, ModBlocks.letterBlockNu);
		}
		else if (block == ModBlocks.letterBlockNu) {
			world.setBlock(x, y, z, ModBlocks.letterBlockXi);
		}
		else if (block == ModBlocks.letterBlockXi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockOmicron);
		}
		else if (block == ModBlocks.letterBlockOmicron) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPi);
		}
		else if (block == ModBlocks.letterBlockPi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockRho);
		}
		else if (block == ModBlocks.letterBlockRho) {
			world.setBlock(x, y, z, ModBlocks.letterBlockSigma);
		}
		else if (block == ModBlocks.letterBlockSigma) {
			world.setBlock(x, y, z, ModBlocks.letterBlockTau);
		}
		else if (block == ModBlocks.letterBlockTau) {
			world.setBlock(x, y, z, ModBlocks.letterBlockUpsilon);
		}
		else if (block == ModBlocks.letterBlockUpsilon) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPhi);
		}
		else if (block == ModBlocks.letterBlockPhi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockChi);
		}
		else if (block == ModBlocks.letterBlockChi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPsi);
		} 
		else if (block == ModBlocks.letterBlockPsi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockOmega);
		} else {
			world.setBlock(x, y, z, ModBlocks.letterBlockAlpha);
		}
	}
	
	protected void previousLetter (Block block, World world, int x, int y, int z) {
		if (block == ModBlocks.letterBlockOmega) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPsi);
		}
		else if (block == ModBlocks.letterBlockPsi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockChi);
		}
		else if (block == ModBlocks.letterBlockChi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPhi);
		}
		else if (block == ModBlocks.letterBlockPhi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockUpsilon);
		}
		else if (block == ModBlocks.letterBlockUpsilon) {
			world.setBlock(x, y, z, ModBlocks.letterBlockTau);
		}
		else if (block == ModBlocks.letterBlockTau) {
			world.setBlock(x, y, z, ModBlocks.letterBlockSigma);
		}
		else if (block == ModBlocks.letterBlockSigma) {
			world.setBlock(x, y, z, ModBlocks.letterBlockRho);
		}
		else if (block == ModBlocks.letterBlockRho) {
			world.setBlock(x, y, z, ModBlocks.letterBlockPi);
		}
		else if (block == ModBlocks.letterBlockPi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockOmicron);
		}
		else if (block == ModBlocks.letterBlockOmicron) {
			world.setBlock(x, y, z, ModBlocks.letterBlockXi);
		}
		else if (block == ModBlocks.letterBlockXi) {
			world.setBlock(x, y, z, ModBlocks.letterBlockNu);
		}
		else if (block == ModBlocks.letterBlockNu) {
			world.setBlock(x, y, z, ModBlocks.letterBlockMu);
		}
		else if (block == ModBlocks.letterBlockMu) {
			world.setBlock(x, y, z, ModBlocks.letterBlockLambda);
		}
		else if (block == ModBlocks.letterBlockLambda) {
			world.setBlock(x, y, z, ModBlocks.letterBlockKappa);
		}
		else if (block == ModBlocks.letterBlockKappa) {
			world.setBlock(x, y, z, ModBlocks.letterBlockIota);
		}
		else if (block == ModBlocks.letterBlockIota) {
			world.setBlock(x, y, z, ModBlocks.letterBlockTheta);
		}
		else if (block == ModBlocks.letterBlockTheta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockEta);
		}
		else if (block == ModBlocks.letterBlockEta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockZeta);
		}
		else if (block == ModBlocks.letterBlockZeta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockEpsilon);
		}
		else if (block == ModBlocks.letterBlockEpsilon) {
			world.setBlock(x, y, z, ModBlocks.letterBlockDelta);
		}
		else if (block == ModBlocks.letterBlockDelta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockGamma);
		}
		else if (block == ModBlocks.letterBlockGamma) {
			world.setBlock(x, y, z, ModBlocks.letterBlockBeta);
		} 
		else if (block == ModBlocks.letterBlockBeta) {
			world.setBlock(x, y, z, ModBlocks.letterBlockAlpha);
		} else {
			world.setBlock(x, y, z, ModBlocks.letterBlockOmega);
		}
	}
	

}
