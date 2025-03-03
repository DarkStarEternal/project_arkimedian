package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModItems;

public class NaplaOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("growth") instanceof EnumProperty _getep1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep1).toString() : "")
				.equals("fourth")) {
			for (int index0 = 0; index0 < Math.round(Mth.nextInt(RandomSource.create(), 1, 3)); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ArkimedianModItems.NAPLABERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			{
				String _value = "third";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("growth") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		}
	}
}
