package net.mcreator.arkimedian.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.arkimedian.entity.GrelhoundEntity;

public class GrelhoundnearbyProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(GrelhoundEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}
