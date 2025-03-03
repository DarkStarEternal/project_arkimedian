package net.mcreator.arkimedian.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.arkimedian.init.ArkimedianModItems;
import net.mcreator.arkimedian.ArkimedianMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawningwithchainswordsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("initial_done") == false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 5, 1));
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(ArkimedianModItems.CHAINSWORD.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			entity.getPersistentData().putBoolean("initial_done", true);
			ArkimedianMod.queueServerWork(30, () -> {
				entity.getPersistentData().putString("page", "first_join");
				entity.getPersistentData().putBoolean("gwen_interacting", true);
			});
		}
	}
}
