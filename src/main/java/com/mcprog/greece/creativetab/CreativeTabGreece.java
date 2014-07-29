package com.mcprog.greece.creativetab;

import com.mcprog.greece.init.ModItems;
import com.mcprog.greece.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 
 * @author mcprog
 *
 */
public class CreativeTabGreece {

	public static final CreativeTabs GREECE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.stater;
		}
	};
}
