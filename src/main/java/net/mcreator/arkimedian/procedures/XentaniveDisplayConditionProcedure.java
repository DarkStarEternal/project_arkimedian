package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class XentaniveDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			return true;
		}
		return false;
	}
}
