package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class Gwenoption1OnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("page")).equals("start")) {
			entity.getPersistentData().putBoolean("gwen_interacting", false);
		} else if ((entity.getPersistentData().getString("page")).equals("beastiary")) {
			entity.getPersistentData().putString("page", "start");
		} else if ((entity.getPersistentData().getString("page")).equals("meat")) {
			entity.getPersistentData().putBoolean("gwen_interacting", false);
		} else if ((entity.getPersistentData().getString("page")).equals("first_join")) {
			entity.getPersistentData().putBoolean("gwen_interacting", false);
		}
	}
}
