package com.mcprog.greece.block;

import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * 
 * @author mcprog
 *
 */
public class BlockMetal extends BlockGreece {
	
	private MapColor mapColor;
	
	public BlockMetal (MapColor color) {
		super(Material.iron);
		mapColor = color;
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(soundTypeMetal);
	}
	
	public BlockMetal () {
		this(MapColor.ironColor);
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.minecraft.block.Block#getMapColor(int)
	 * no idea what p_149728_1_ is
	 */
	@Override
	public MapColor getMapColor (int p_149728_1_) {
		return mapColor;
	}
}
