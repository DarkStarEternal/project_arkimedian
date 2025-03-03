package net.mcreator.arkimedian.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class GasexhaustOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) != 0) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 4), z, 10, 0.5, 4, 0.5, 0);
		}
	}
}
