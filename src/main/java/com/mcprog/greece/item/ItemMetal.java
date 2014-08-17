package com.mcprog.greece.item;

import java.util.List;

import com.mcprog.greece.item.info.ElementInfo;
import com.mcprog.greece.material.Material;
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

	private Material material;
	
	public ItemMetal(Material material) {
		this.material = material;
	}
	
	/**
	 * Element makeup is added to all items that extend this
	 */
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation (ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_) {
        material.addInformation(list);
    }

}
