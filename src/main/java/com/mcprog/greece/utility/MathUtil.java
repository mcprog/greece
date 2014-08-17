package com.mcprog.greece.utility;

/**
 * 
 * @author mcprog
 *
 */
public class MathUtil {
	
	/**
	 * decimal conversion for rendering from base 16 pixel convention
	 * @param pixels: 1 of 16
	 * @return float equivalent (e.g. 1pixel > 1 / 16 > 0.0625f
	 */
	public static float getFloatFromPixels (int pixels) {
		return (float) (pixels) / 16f;
	}
}
