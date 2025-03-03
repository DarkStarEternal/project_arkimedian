package net.mcreator.arkimedian.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.arkimedian.ArkimedianMod;

public class ShipstartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean effects = false;
		if (entity.getPersistentData().getBoolean("start_initiated") == true) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 20, 1, 1, 1, 0.2);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, y, z, 5, 1, 1, 1, 0.2);
			ArkimedianMod.queueServerWork(100, () -> {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				ArkimedianMod.queueServerWork(10, () -> {
					entity.setDeltaMovement(new Vec3(0, 0, 0));
				});
			});
		}
	}
}
