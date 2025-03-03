package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.arkimedian.init.ArkimedianModEntities;
import net.mcreator.arkimedian.entity.BoltEntity;

public class BoltgunRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (10 > itemstack.getDamageValue()) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new BoltEntity(ArkimedianModEntities.BOLT.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(x, (y + 1), z);
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (itemstack.getOrCreateTag().getBoolean("has_ammo_upgrade")) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(2, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
