package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class InitiatestartsequenceOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		(entity.getVehicle()).getPersistentData().putBoolean("start_initiated", true);
	}
}
