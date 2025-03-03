package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class HuntmodekillProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("hunt_mode")).equals("kill")) {
			return true;
		}
		return false;
	}
}
