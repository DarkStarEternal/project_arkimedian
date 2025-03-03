package net.mcreator.arkimedian.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NtrasylLogOnTickUpdateProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ArkimedianModBlocks.NTRASYL_LOG.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ArkimedianModBlocks.NTRASYL_WOOD.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "break") > 200) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("break", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "break") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "break") == 200) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y + 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y + 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y + 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y + 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y + 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y + 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y - 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y - 1, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y - 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y - 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y - 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y - 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y - 1, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y - 1, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x - 1, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + 1, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:ntrasyl_part")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z + 1);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("break", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
