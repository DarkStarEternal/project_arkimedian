package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class GweninteractionDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("page")).equals("start") && entity.getPersistentData().getBoolean("gwen_interacting") == true) {
			return true;
		}
		return false;
	}
}
