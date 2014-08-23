package com.mcprog.greece.item.info;

import com.mcprog.greece.reference.Elements;

/**
 * 
 * @author mcprog
 *
 */
public class SpecificInfo {

	public static final ElementInfo[] copper = {
		new ElementInfo(Elements.COPPER, 1)
	};
	
	public static final ElementInfo[] tin = {
		new ElementInfo(Elements.TIN, 1)
	};
	
	public static final ElementInfo[] silver = {
		new ElementInfo(Elements.SILVER, 1)
	};
	
	public static final ElementInfo[] gold = {
		new ElementInfo(Elements.GOLD, 1)
	};
	
	public static final ElementInfo[] classicBronze = {
		new ElementInfo(Elements.COPPER, 0.9f),
		new ElementInfo(Elements.TIN, 0.1f)
	};
	
	public static final ElementInfo[] mildBronze = {
		new ElementInfo(Elements.COPPER, 1f - (1f / 17f)),
		new ElementInfo(Elements.TIN, 1f / 17f)
	};
	
	public static final ElementInfo[] electrum = {
		new ElementInfo(Elements.GOLD, 0.5F),
		new ElementInfo(Elements.SILVER, 0.5F)
	};
}
