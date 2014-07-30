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
	
	public ItemCoin () {
		setUnlocalizedName(Names.Items.COIN);
		setMaxStackSize(60);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation (ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add(denomination);
    }
	
	public void setDenomination (String denomination) {
		this.denomination = denomination;
	}
}
