package com.mcprog.greece.utility;

import com.mcprog.greece.entity.EntitySpear;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

/**
 * 
 * @author mcprog
 *
 */
public class ModDamage extends DamageSource {

	public ModDamage(String type) {
		super(type);
	}
	
	public static DamageSource causeSpearDamage(EntitySpear p_76353_0_, Entity p_76353_1_)
    {
        return (new EntityDamageSourceIndirect("arrow", p_76353_0_, p_76353_1_)).setProjectile();
    }

}
