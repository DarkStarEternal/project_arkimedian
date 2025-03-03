package net.mcreator.arkimedian.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class SynriaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()
				&& (!(entity.getPersistentData().getString("hunt_mode")).equals("stealth") || !(entity.getPersistentData().getString("hunt_mode")).equals("kill"))) {
			if (Math.random() < 0.7) {
				entity.getPersistentData().putString("hunt_mode", "stealth");
			} else {
				entity.getPersistentData().putString("hunt_mode", "kill");
			}
		}
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.1) {
					entity.getPersistentData().putString("hunt_mode", "kill");
				}
			}
		}
	}
}
