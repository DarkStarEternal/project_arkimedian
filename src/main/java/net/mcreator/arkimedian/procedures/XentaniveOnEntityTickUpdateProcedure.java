package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.entity.XentaniveEntity;

public class XentaniveOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "xentanive_count") < 3) {
			if ((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0) + 1
					|| (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0) - 1) {
				if ((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0) + 1
						|| (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0)
								- 1) {
					if ((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0) + 1
							|| (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0) == (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0)
									- 1) {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0,
									entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0, entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("xentanive_count", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(x, y, z), "xentanive_count") + 1));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}
