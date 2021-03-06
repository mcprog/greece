package com.mcprog.greece.item.info;

/**
 * 
 * @author mcprog
 *
 */
public class ElementInfo {
	
	public String name;
	public float percent;
	
	public ElementInfo (String name, float percent) {
		this.name = name;
		this.percent = percent;
	}
	
	@Override
	public String toString () {
		return name + ": " + String.format("%.2f%s", percent * 100f, "%");
	}
}
