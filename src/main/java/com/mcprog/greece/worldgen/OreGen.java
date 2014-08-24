package com.mcprog.greece.worldgen;

import java.util.Random;

import com.mcprog.greece.init.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * 
 * @author ime990
 *
 */
public class OreGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);// * 16 specifies size of chunk
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}
	
	private void generateEnd(World world, Random random, int i, int j) {
	}
	
	private void generateSurface(World world, Random random, int i, int j) {
		/*
		 * CODE for Coppper
		 * loop tries to genreate 20 times in each chunk
		 */
		for(int t = 0; t < 20 ; ++t){
			int copperOreXCord = i + random.nextInt(16);
			int copperOreZCord = j + random.nextInt(16);
			int copperOreYCord = random.nextInt(40);//spawn height limit
			/*
			 * WorldGenMInable class generates specified block to specific quantity
			 */
			new WorldGenMinable(ModBlocks.copperOre, 10).generate(world, random, copperOreXCord, copperOreYCord, copperOreZCord);
		}
		
		/*
		 * CODE for tin
		 */
		for(int t = 0; t < 10 ; ++t){
			int tinOreXCord = i + random.nextInt(16);
			int tinOreYCord = random.nextInt(30);
			int tinOreZCord = j + random.nextInt(16);
			new WorldGenMinable(ModBlocks.tinOre, 4).generate(world, random, tinOreXCord, tinOreYCord, tinOreZCord);
		}
	}
	
	private void generateNether(World world, Random random, int i, int j) {
	}

}
