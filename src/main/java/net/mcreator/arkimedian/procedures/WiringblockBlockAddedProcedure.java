package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModBlocks;
import net.mcreator.arkimedian.ArkimedianMod;

public class WiringblockBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ArkimedianMod.queueServerWork(1, () -> {
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH || (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ArkimedianModBlocks.WIRINGBLOCK.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ArkimedianModBlocks.WIRINGBLOCK.get())) {
					{
						String _value = "straight";
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
							world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
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
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST || (new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ArkimedianModBlocks.WIRINGBLOCK.get() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ArkimedianModBlocks.WIRINGBLOCK.get())) {
					{
						String _value = "straight";
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("shape") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
							world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
					}
				}
			}
		});
	}
}
