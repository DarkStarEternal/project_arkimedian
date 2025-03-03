package net.mcreator.arkimedian.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ShipspeedupcallProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if (entity.getDeltaMovement().x() != 0 && entity.getDeltaMovement().z() != 0 || entity.getDeltaMovement().x() != 0 || entity.getDeltaMovement().z() != 0) {
				if (entity.getLookAngle().y > 0.02) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getLookAngle().y), (entity.getDeltaMovement().z())));
				} else if (entity.getLookAngle().y < -0.02) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getLookAngle().y), (entity.getDeltaMovement().z())));
				}
			}
		}
	}
}
