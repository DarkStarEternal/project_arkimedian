package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.arkimedian.network.ArkimedianModVariables;

public class OpenmeatinteractionsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ArkimedianModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ArkimedianModVariables.PlayerVariables())).meat_dialogue == false) {
			entity.getPersistentData().putBoolean("gwen_interacting", true);
			entity.getPersistentData().putString("page", "meat");
			{
				boolean _setval = true;
				entity.getCapability(ArkimedianModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.meat_dialogue = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
