package net.mcreator.arkimedian.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class WiringblockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH && (blockstate.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep4 ? blockstate.getValue(_getep4).toString() : "").equals("straight")
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("arkimedian:powercables")))) {
			if (new Object() {
				public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, BlockPos.containing(x, y, z - 1)) + 200 > new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z - 1))) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.SOUTH && (blockstate.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep14 ? blockstate.getValue(_getep14).toString() : "").equals("straight")
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("arkimedian:powercables")))) {
			if (new Object() {
				public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, BlockPos.containing(x, y, z + 1)) + 200 > new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z + 1))) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.EAST && (blockstate.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep24 ? blockstate.getValue(_getep24).toString() : "").equals("straight")
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("arkimedian:powercables")))) {
			if (new Object() {
				public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, BlockPos.containing(x + 1, y, z)) + 200 > new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x + 1, y, z))) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.WEST && (blockstate.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _getep34 ? blockstate.getValue(_getep34).toString() : "").equals("straight")
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("arkimedian:powercables")))) {
			if (new Object() {
				public int getMaxEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, BlockPos.containing(x - 1, y, z)) + 200 > new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x - 1, y, z))) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
			}
		}
	}
}
