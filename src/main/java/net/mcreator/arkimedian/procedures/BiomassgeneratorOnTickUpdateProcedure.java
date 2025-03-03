package net.mcreator.arkimedian.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class BiomassgeneratorOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "active")) == true) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "craft_cooldown") > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craft_cooldown", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "craft_cooldown")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if ((new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "has_exhaust")) == true && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "craft_cooldown") == 0) {
				if (new Object() {
					public int getEnergyStored(LevelAccessor level, BlockPos pos) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
						return _retval.get();
					}
				}.getEnergyStored(world, BlockPos.containing(x, y, z)) < new Object() {
					public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
						return _retval.get();
					}
				}.getMaxEnergyStored(world, BlockPos.containing(x, y, z))) {
					if (new Object() {
						public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
							return _retval.get();
						}
					}.getMaxEnergyStored(world, BlockPos.containing(x, y, z)) > new Object() {
						public int getEnergyStored(LevelAccessor level, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, BlockPos.containing(x, y, z)) && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), 0) > 0 && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == ArkimedianModItems.BIOMASS.get()) {
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							if (_ent != null) {
								final int _slotid = 0;
								final ItemStack _setstack = (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), 0)).copy();
								_setstack.setCount((int) (new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, BlockPos.containing(x, y, z), 0) - 1));
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
						{
							BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
							int _amount = 200;
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craft_cooldown", 10);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}
}
