package com.mcprog.greece.handler;

import com.mcprog.greece.reference.Names;

/**
 * 
 * @author mcprog
 *
 */
public class NameHandler {
	
	/**
	 * Used for letter blocks
	 * @param index in letter block arraylist
	 * @return the string corresponding to the name of the letter block in the cell at the index
	 */
	public static String getNameFromIndex (int index) {
		switch (index) {
			case 0:
				return Names.Blocks.LETTER_BLOCK_ALPHA;
			case 1:
				return Names.Blocks.LETTER_BLOCK_BETA;
			case 2:
				return Names.Blocks.LETTER_BLOCK_GAMMA;
			case 3:
				return Names.Blocks.LETTER_BLOCK_DELTA;
			case 4:
				return Names.Blocks.LETTER_BLOCK_EPSILON;
			case 5:
				return Names.Blocks.LETTER_BLOCK_ZETA;
			case 6:
				return Names.Blocks.LETTER_BLOCK_ETA;
			case 7:
				return Names.Blocks.LETTER_BLOCK_THETA;
			case 8:
				return Names.Blocks.LETTER_BLOCK_IOTA;
			case 9:
				return Names.Blocks.LETTER_BLOCK_KAPPA;
			case 10:
				return Names.Blocks.LETTER_BLOCK_LAMBDA;
			case 11:
				return Names.Blocks.LETTER_BLOCK_MU;
			case 12:
				return Names.Blocks.LETTER_BLOCK_NU;
			case 13:
				return Names.Blocks.LETTER_BLOCK_XI;
			case 14:
				return Names.Blocks.LETTER_BLOCK_OMICRON;
			case 15:
				return Names.Blocks.LETTER_BLOCK_PI;
			case 16:
				return Names.Blocks.LETTER_BLOCK_RHO;
			case 17:
				return Names.Blocks.LETTER_BLOCK_SIGMA;
			case 18:
				return Names.Blocks.LETTER_BLOCK_TAU;
			case 19:
				return Names.Blocks.LETTER_BLOCK_UPSILON;
			case 20:
				return Names.Blocks.LETTER_BLOCK_PHI;
			case 21:
				return Names.Blocks.LETTER_BLOCK_CHI;
			case 22:
				return Names.Blocks.LETTER_BLOCK_PSI;
			default:
				return Names.Blocks.LETTER_BLOCK_OMEGA;
		}
		
	}
	
	public static int length () {
		return 23;
	}
}
