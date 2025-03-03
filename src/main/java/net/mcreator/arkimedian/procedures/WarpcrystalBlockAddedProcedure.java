package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModBlocks;

public class WarpcrystalBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_north";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_south";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_east";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_west";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_down";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ArkimedianModBlocks.MENTRIOLITEWARP.get()) {
			{
				String _value = "grow_up";
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("grow") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
					world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
			}
		}
	}
}
