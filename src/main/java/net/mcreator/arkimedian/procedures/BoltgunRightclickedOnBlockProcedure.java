package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.arkimedian.init.ArkimedianModItems;

public class BoltgunRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (itemstack.getOrCreateTag().getBoolean("has_ammo_upgrade") == false && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ArkimedianModItems.AMMOUPGRADE.get()) {
				itemstack.getOrCreateTag().putBoolean("has_ammo_upgrade", true);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ArkimedianModItems.AMMOUPGRADE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ArkimedianModItems.BOLTCONTAINER.get())) : false) {
				if (itemstack.getDamageValue() == 10) {
					itemstack.setDamageValue(0);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ArkimedianModItems.BOLTCONTAINER.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		} else {
			BoltgunRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		}
	}
}
