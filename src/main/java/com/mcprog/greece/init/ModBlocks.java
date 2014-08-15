package com.mcprog.greece.init;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import com.mcprog.greece.block.BlockColumn;
import com.mcprog.greece.block.BlockDust;
import com.mcprog.greece.block.BlockGreece;
import com.mcprog.greece.block.BlockLetter;
import com.mcprog.greece.block.BlockMetal;
import com.mcprog.greece.block.OreGreece;
import com.mcprog.greece.handler.NameHandler;
import com.mcprog.greece.reference.Names;
import com.mcprog.greece.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author mcprog
 * @author ime990
 *
 */
//@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockGreece column = new BlockColumn();
	public static final BlockGreece copperBlock = new BlockMetal(MapColor.adobeColor);
	public static final BlockGreece tinBlock = new BlockMetal(MapColor.snowColor);
	public static final BlockGreece classicBronzeBlock = new BlockMetal(MapColor.goldColor);
	public static final BlockGreece mildBronzeBlock = new BlockMetal(MapColor.adobeColor);
	public static final Block copperDustBlock = new BlockDust(MapColor.adobeColor);
	public static final ArrayList<BlockLetter> letterBlocks = new ArrayList<BlockLetter>();
	/*public static final BlockLetter letterBlockAlpha = new BlockLetter();
	public static final BlockLetter letterBlockBeta = new BlockLetter();
	public static final BlockLetter letterBlockGamma = new BlockLetter();
	public static final BlockLetter letterBlockDelta = new BlockLetter();
	public static final BlockLetter letterBlockEpsilon = new BlockLetter();
	public static final BlockLetter letterBlockZeta = new BlockLetter();
	public static final BlockLetter letterBlockEta = new BlockLetter();
	public static final BlockLetter letterBlockTheta = new BlockLetter();
	public static final BlockLetter letterBlockIota = new BlockLetter();
	public static final BlockLetter letterBlockKappa = new BlockLetter();
	public static final BlockLetter letterBlockLambda = new BlockLetter();
	public static final BlockLetter letterBlockMu = new BlockLetter();
	public static final BlockLetter letterBlockNu = new BlockLetter();
	public static final BlockLetter letterBlockXi = new BlockLetter();
	public static final BlockLetter letterBlockOmicron = new BlockLetter();
	public static final BlockLetter letterBlockPi = new BlockLetter();
	public static final BlockLetter letterBlockRho = new BlockLetter();
	public static final BlockLetter letterBlockSigma = new BlockLetter();
	public static final BlockLetter letterBlockTau = new BlockLetter();
	public static final BlockLetter letterBlockUpsilon = new BlockLetter();
	public static final BlockLetter letterBlockPhi = new BlockLetter();
	public static final BlockLetter letterBlockChi = new BlockLetter();
	public static final BlockLetter letterBlockPsi = new BlockLetter();
	public static final BlockLetter letterBlockOmega = new BlockLetter();*/
	public static final OreGreece copperOre = new OreGreece();
	public static final OreGreece tinOre = new OreGreece();
	
	public static void init () {
		
		for (int i = 0; i <= NameHandler.length(); ++i) {
			BlockLetter bL = new BlockLetter();
			String name = NameHandler.getNameFromIndex(i);
			bL.setBlockName(name);
			GameRegistry.registerBlock(bL, name);
			letterBlocks.add(bL);
		}
		
		copperBlock.setBlockName(Names.Blocks.COPPER_BLOCK);
		tinBlock.setBlockName(Names.Blocks.TIN_BLOCK);
		classicBronzeBlock.setBlockName(Names.Blocks.CLASSIC_BRONZE_BLOCK);
		mildBronzeBlock.setBlockName(Names.Blocks.MILD_BRONZE_BLOCK);
		copperDustBlock.setBlockName(Names.Blocks.COPPER_DUST_BLOCK);
		/*letterBlockAlpha.setBlockName(Names.Blocks.LETTER_BLOCK_ALPHA);
		letterBlockBeta.setBlockName(Names.Blocks.LETTER_BLOCK_BETA);
		letterBlockGamma.setBlockName(Names.Blocks.LETTER_BLOCK_GAMMA);
		letterBlockDelta.setBlockName(Names.Blocks.LETTER_BLOCK_DELTA);
		letterBlockEpsilon.setBlockName(Names.Blocks.LETTER_BLOCK_EPSILON);
		letterBlockZeta.setBlockName(Names.Blocks.LETTER_BLOCK_ZETA);
		letterBlockEta.setBlockName(Names.Blocks.LETTER_BLOCK_ETA);
		letterBlockTheta.setBlockName(Names.Blocks.LETTER_BLOCK_THETA);
		letterBlockIota.setBlockName(Names.Blocks.LETTER_BLOCK_IOTA);
		letterBlockKappa.setBlockName(Names.Blocks.LETTER_BLOCK_KAPPA);
		letterBlockLambda.setBlockName(Names.Blocks.LETTER_BLOCK_LAMBDA);
		letterBlockMu.setBlockName(Names.Blocks.LETTER_BLOCK_MU);
		letterBlockNu.setBlockName(Names.Blocks.LETTER_BLOCK_NU);
		letterBlockXi.setBlockName(Names.Blocks.LETTER_BLOCK_XI);
		letterBlockOmicron.setBlockName(Names.Blocks.LETTER_BLOCK_OMICRON);
		letterBlockPi.setBlockName(Names.Blocks.LETTER_BLOCK_PI);
		letterBlockRho.setBlockName(Names.Blocks.LETTER_BLOCK_RHO);
		letterBlockSigma.setBlockName(Names.Blocks.LETTER_BLOCK_SIGMA);
		letterBlockTau.setBlockName(Names.Blocks.LETTER_BLOCK_TAU);
		letterBlockUpsilon.setBlockName(Names.Blocks.LETTER_BLOCK_UPSILON);
		letterBlockPhi.setBlockName(Names.Blocks.LETTER_BLOCK_PHI);
		letterBlockChi.setBlockName(Names.Blocks.LETTER_BLOCK_CHI);
		letterBlockPsi.setBlockName(Names.Blocks.LETTER_BLOCK_PSI);
		letterBlockOmega.setBlockName(Names.Blocks.LETTER_BLOCK_OMEGA);*/
		copperOre.setBlockName(Names.Blocks.COPPER_ORE);
		tinOre.setBlockName(Names.Blocks.TIN_ORE);
		
		
		GameRegistry.registerBlock(column, Names.Blocks.COLUMN);
		GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
		GameRegistry.registerBlock(tinBlock, Names.Blocks.TIN_BLOCK);
		GameRegistry.registerBlock(classicBronzeBlock, Names.Blocks.CLASSIC_BRONZE_BLOCK);
		GameRegistry.registerBlock(mildBronzeBlock, Names.Blocks.MILD_BRONZE_BLOCK);
		GameRegistry.registerBlock(copperDustBlock, Names.Blocks.COPPER_DUST_BLOCK);
		/*GameRegistry.registerBlock(letterBlockAlpha, Names.Blocks.LETTER_BLOCK_ALPHA);
		GameRegistry.registerBlock(letterBlockBeta, Names.Blocks.LETTER_BLOCK_BETA);
		GameRegistry.registerBlock(letterBlockGamma, Names.Blocks.LETTER_BLOCK_GAMMA);
		GameRegistry.registerBlock(letterBlockDelta, Names.Blocks.LETTER_BLOCK_DELTA);
		GameRegistry.registerBlock(letterBlockEpsilon, Names.Blocks.LETTER_BLOCK_EPSILON);
		GameRegistry.registerBlock(letterBlockZeta, Names.Blocks.LETTER_BLOCK_ZETA);
		GameRegistry.registerBlock(letterBlockEta, Names.Blocks.LETTER_BLOCK_ETA);
		GameRegistry.registerBlock(letterBlockTheta, Names.Blocks.LETTER_BLOCK_THETA);
		GameRegistry.registerBlock(letterBlockIota, Names.Blocks.LETTER_BLOCK_IOTA);
		GameRegistry.registerBlock(letterBlockKappa, Names.Blocks.LETTER_BLOCK_KAPPA);
		GameRegistry.registerBlock(letterBlockLambda, Names.Blocks.LETTER_BLOCK_LAMBDA);
		GameRegistry.registerBlock(letterBlockMu, Names.Blocks.LETTER_BLOCK_MU);
		GameRegistry.registerBlock(letterBlockNu, Names.Blocks.LETTER_BLOCK_NU);
		GameRegistry.registerBlock(letterBlockXi, Names.Blocks.LETTER_BLOCK_XI);
		GameRegistry.registerBlock(letterBlockOmicron, Names.Blocks.LETTER_BLOCK_OMICRON);
		GameRegistry.registerBlock(letterBlockPi, Names.Blocks.LETTER_BLOCK_PI);
		GameRegistry.registerBlock(letterBlockRho, Names.Blocks.LETTER_BLOCK_RHO);
		GameRegistry.registerBlock(letterBlockSigma, Names.Blocks.LETTER_BLOCK_SIGMA);
		GameRegistry.registerBlock(letterBlockTau, Names.Blocks.LETTER_BLOCK_TAU);
		GameRegistry.registerBlock(letterBlockUpsilon, Names.Blocks.LETTER_BLOCK_UPSILON);
		GameRegistry.registerBlock(letterBlockPhi, Names.Blocks.LETTER_BLOCK_PHI);
		GameRegistry.registerBlock(letterBlockPsi, Names.Blocks.LETTER_BLOCK_PSI);
		GameRegistry.registerBlock(letterBlockChi, Names.Blocks.LETTER_BLOCK_CHI);
		GameRegistry.registerBlock(letterBlockOmega, Names.Blocks.LETTER_BLOCK_OMEGA);*/
		GameRegistry.registerBlock(copperOre, Names.Blocks.COPPER_ORE);
		GameRegistry.registerBlock(tinOre, Names.Blocks.TIN_ORE);
	}
}
