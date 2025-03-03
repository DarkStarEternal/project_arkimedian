package net.mcreator.arkimedian.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.arkimedian.entity.XentaniveEntity;

public class XentanivefetchfoodProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity instanceof XentaniveEntity _datEntSetI)
				_datEntSetI.getEntityData().set(XentaniveEntity.DATA_feed_level, (int) ((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_feed_level) : 0) + 1));
			if ((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_feed_level) : 0) == 3) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivex) : 0),
							(entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivey) : 0), (entity instanceof XentaniveEntity _datEntI ? _datEntI.getEntityData().get(XentaniveEntity.DATA_hivez) : 0), 1);
			}
		}
	}
}
