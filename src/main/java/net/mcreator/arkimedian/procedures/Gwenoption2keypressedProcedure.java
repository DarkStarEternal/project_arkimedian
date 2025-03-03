package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class Gwenoption2keypressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("gwen_interacting") == true) {
			entity.getPersistentData().putString("page", "beastiary");
		}
	}
}
