package com.mcprog.greece.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.mcprog.greece.item.info.ElementInfo;
import com.mcprog.greece.reference.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author mcprog
 *
 */
public class ItemCoin extends ItemGreece {

	private String denomination;
	private String comparison;
	
	public ItemCoin () {
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation (ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_) {
        list.add(denomination);
        list.add(comparison);
    }
	
	public void setDenomination (String denomination, String comparison) {
		this.denomination = denomination;
		this.comparison = comparison;
	}
}
