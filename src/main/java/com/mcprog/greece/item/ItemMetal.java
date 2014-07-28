package com.mcprog.greece.item;

import java.util.List;

import com.mcprog.greece.item.info.ElementInfo;
import com.mcprog.greece.reference.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author mcprog
 *
 */
public class ItemMetal extends ItemGreece {

	private ElementInfo[] elements;
	
	public ItemMetal() {
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation (ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        if (elements != null) {
        	for (ElementInfo elI : elements) {
        		p_77624_3_.add(elI.toString());
        	}
        }
    }
	
	public void setElementInfo (ElementInfo[] elements) {
		this.elements = elements;
	}

}
