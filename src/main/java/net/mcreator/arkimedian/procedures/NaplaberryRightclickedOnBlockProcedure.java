package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModItems;
import net.mcreator.arkimedian.init.ArkimedianModBlocks;

public class NaplaberryRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y + 1, z), ArkimedianModBlocks.NAPLA.get().defaultBlockState(), 3);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ArkimedianModItems.NAPLABERRY.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
