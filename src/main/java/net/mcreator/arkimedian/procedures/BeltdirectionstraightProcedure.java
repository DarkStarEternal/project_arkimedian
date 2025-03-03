package net.mcreator.arkimedian.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class BeltdirectionstraightProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("corner set to \"none\""), true);
		{
			String _value = "none";
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("corner") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
				world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
		}
	}
}
