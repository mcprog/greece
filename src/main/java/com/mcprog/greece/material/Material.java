package com.mcprog.greece.material;

import java.util.List;

import com.mcprog.greece.item.info.ElementInfo;

/**
 * 
 * @author mcprog
 *
 */
public class Material {

	protected ElementInfo[] elements;
	
	public Material (ElementInfo[] elements) {
		this.elements = elements;
	}
	
	public void addInformation (List list) {
		if (elements != null) {
	    	for (ElementInfo elI : elements) {
	    		list.add(elI.toString());
	    	}
        }
	}
}
