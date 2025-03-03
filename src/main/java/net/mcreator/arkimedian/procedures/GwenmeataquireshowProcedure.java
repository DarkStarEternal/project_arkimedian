package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class GwenmeataquireshowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("page")).equals("meat") && entity.getPersistentData().getBoolean("gwen_interacting") == true) {
			return true;
		}
		return false;
	}
}
