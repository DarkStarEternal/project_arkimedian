package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

public class DocreanitilePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isSwimming()) {
			return true;
		}
		return false;
	}
}
