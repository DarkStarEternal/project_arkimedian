package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class GweninteractionsopenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("gwen_interacting", true);
		entity.getPersistentData().putString("page", "start");
	}
}
