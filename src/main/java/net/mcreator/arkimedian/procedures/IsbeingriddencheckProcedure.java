package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class IsbeingriddencheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isVehicle()) {
			return true;
		}
		return false;
	}
}
