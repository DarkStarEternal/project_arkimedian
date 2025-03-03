package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.arkimedian.init.ArkimedianModBlocks;

public class BeltAVIIpushingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))) == (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(ArkimedianModBlocks.BELT_AV_II.get().defaultBlockState(), "corner", "none"))) {
			BeltAVIIpushingstraightProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(ArkimedianModBlocks.BELT_AV_II.get().defaultBlockState(), "corner", "right"))) {
			BeltAVIIpushingleftProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(ArkimedianModBlocks.BELT_AV_II.get().defaultBlockState(), "corner", "left"))) {
			BeltAVIIpushingrightProcedure.execute(world, x, y, z);
		}
	}
}
