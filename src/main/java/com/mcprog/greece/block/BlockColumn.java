package com.mcprog.greece.block;

import net.minecraft.block.BlockChest;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.RenderIds;
import com.mcprog.greece.tileentity.TileEntityColumn;
import com.mcprog.greece.utility.MathUtil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author mcprog
 *
 */
public class BlockColumn extends BlockGreece implements ITileEntityProvider {
	
	public BlockColumn () {
		setBlockName(Names.Blocks.COLUMN);
		setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 1, 0.9375f);
	}

	@Override
	public TileEntity createNewTileEntity(World wotld, int meta) {
		return new TileEntityColumn();
	}
	
	@Override
    public boolean renderAsNormalBlock () {
        return false;
    }

    @Override
    public int getRenderType () {
        return RenderIds.column;
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }
}
