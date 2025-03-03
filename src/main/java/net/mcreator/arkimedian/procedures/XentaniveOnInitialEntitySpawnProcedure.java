package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModBlocks;
import net.mcreator.arkimedian.entity.XentaniveEntity;

public class XentaniveOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ArkimedianModBlocks.XENTANIVESNEST.get()) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (entity instanceof XentaniveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(XentaniveEntity.DATA_hivex, (int) sx);
			if (entity instanceof XentaniveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(XentaniveEntity.DATA_hivey, (int) sy);
			if (entity instanceof XentaniveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(XentaniveEntity.DATA_hivez, (int) sz);
		}
	}
}
