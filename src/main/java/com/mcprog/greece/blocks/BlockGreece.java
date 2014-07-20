package com.mcprog.greece.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGreece extends Block {

	public BlockGreece(Material material) {
		super(material);
	}
	
	public BlockGreece() {
		this(Material.rock);
	}

}
