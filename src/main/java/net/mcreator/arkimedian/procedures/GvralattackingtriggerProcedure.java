package net.mcreator.arkimedian.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.arkimedian.entity.SynriaEntity;
import net.mcreator.arkimedian.entity.GrelhoundEntity;
import net.mcreator.arkimedian.entity.ErnetmonstrocityEntity;

import java.util.Comparator;

public class GvralattackingtriggerProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null))
				|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == ((Entity) world.getEntitiesOfClass(GrelhoundEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null))
				|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == ((Entity) world.getEntitiesOfClass(SynriaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null))
				|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == ((Entity) world.getEntitiesOfClass(ErnetmonstrocityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null))) && entity instanceof Mob _mobEnt12 && _mobEnt12.isAggressive()) {
			return true;
		}
		return false;
	}
}
