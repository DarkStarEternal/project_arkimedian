package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class HuntmodeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("hunt_mode")).equals("stealth")) {
			return true;
		}
		return false;
	}
}
